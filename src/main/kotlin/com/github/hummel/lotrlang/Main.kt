package com.github.hummel.lotrlang

import com.formdev.flatlaf.FlatLightLaf
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubDarkIJTheme
import java.awt.BorderLayout
import java.awt.Dimension
import java.awt.EventQueue
import java.awt.GridLayout
import java.io.File
import javax.swing.*
import javax.swing.border.EmptyBorder

fun main() {
	FlatLightLaf.setup()
	EventQueue.invokeLater {
		try {
			UIManager.setLookAndFeel(FlatGitHubDarkIJTheme())
			val frame = GUI()
			frame.isVisible = true
		} catch (e: Exception) {
			e.printStackTrace()
		}
	}
}

class GUI : JFrame() {
	private fun selectPath(pathField: JTextField) {
		val fileChooser = JFileChooser()
		val result = fileChooser.showOpenDialog(this)
		if (result == JFileChooser.APPROVE_OPTION) {
			pathField.text = fileChooser.selectedFile.absolutePath
		}
	}

	private fun process(vanillaField: JTextField, submodField: JTextField, vanillaPriority: Boolean) {
		if (vanillaField.text.isEmpty() || submodField.text.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Fill the fields", "Error", JOptionPane.ERROR_MESSAGE)
			return
		}
		val firstFile = File(vanillaField.text)
		val secondFile = File(submodField.text)
		if (!firstFile.exists() || !firstFile.isFile || !secondFile.exists() || !secondFile.isFile) {
			JOptionPane.showMessageDialog(this, "Corrupted file", "Error", JOptionPane.ERROR_MESSAGE)
			return
		}

		val firstLines = firstFile.readLines()
		val secondLines = secondFile.readLines()

		val allLines = if (vanillaPriority) firstLines + secondLines else secondLines + firstLines

		val uniqueLines = allLines.map {
			it.split('=', limit = 2)
		}.distinctBy {
			it[0]
		}.map {
			it.joinToString("=")
		}

		secondFile.writeText(uniqueLines.joinToString("\n"))

		JOptionPane.showMessageDialog(
			this, "File was finalized", "Message", JOptionPane.INFORMATION_MESSAGE
		)
	}

	init {
		title = "Hummel009's LOTR Lang Finalizer"
		defaultCloseOperation = EXIT_ON_CLOSE
		setBounds(100, 100, 640, 200)

		val contentPanel = JPanel()
		contentPanel.border = EmptyBorder(5, 5, 5, 5)
		contentPanel.layout = BorderLayout(0, 0)
		contentPanel.layout = GridLayout(0, 1, 0, 0)
		contentPane = contentPanel

		val vanillaPanel = JPanel()
		val vanillaLabel = JLabel("Vanilla LOTR lang path:")
		vanillaLabel.preferredSize = Dimension(140, vanillaLabel.preferredSize.height)
		val vanillaField = JTextField(24)
		val vanillaButton = JButton("Select path")
		vanillaButton.addActionListener { selectPath(vanillaField) }
		vanillaPanel.add(vanillaLabel)
		vanillaPanel.add(vanillaField)
		vanillaPanel.add(vanillaButton)

		val submodPanel = JPanel()
		val submodLabel = JLabel("Submod LOTR lang path:")
		submodLabel.preferredSize = Dimension(140, submodLabel.preferredSize.height)
		val submodField = JTextField(24)
		val submodButton = JButton("Select path")
		submodButton.addActionListener { selectPath(submodField) }
		submodPanel.add(submodLabel)
		submodPanel.add(submodField)
		submodPanel.add(submodButton)

		val checkboxPanel = JPanel()
		val processCheckbox = JCheckBox("Vanilla LOTR translation is a priority", true)
		checkboxPanel.add(processCheckbox)

		val processPanel = JPanel()
		val processButton = JButton("Process")
		processButton.addActionListener {
			process(vanillaField, submodField, processCheckbox.isSelected)
		}
		processPanel.add(processButton)

		contentPanel.add(vanillaPanel)
		contentPanel.add(submodPanel)
		contentPanel.add(checkboxPanel)
		contentPanel.add(processPanel)

		setLocationRelativeTo(null)
	}
}