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

	private fun process(inputField: JTextField, outputField: JTextField) {
		if (inputField.text.isEmpty() || outputField.text.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Fill the fields", "Error", JOptionPane.ERROR_MESSAGE)
			return
		}
		val firstFile = File(inputField.text)
		val secondFile = File(outputField.text)
		if (!firstFile.exists() || !firstFile.isFile) {
			JOptionPane.showMessageDialog(this, "Corrupted file", "Error", JOptionPane.ERROR_MESSAGE)
			return
		}
		val lines = firstFile.readLines()

		val uniqueLines = lines.map {
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

		val inputPanel = JPanel()
		val inputLabel = JLabel("Target lang path:")
		inputLabel.preferredSize = Dimension(120, inputLabel.preferredSize.height)
		val inputField = JTextField(24)
		val inputButton = JButton("Select path")
		inputButton.addActionListener { selectPath(inputField) }
		inputPanel.add(inputLabel)
		inputPanel.add(inputField)
		inputPanel.add(inputButton)

		val outputPanel = JPanel()
		val outputLabel = JLabel("Output lang path:")
		outputLabel.preferredSize = Dimension(120, outputLabel.preferredSize.height)
		val outputField = JTextField(24)
		val outputButton = JButton("Select path")
		outputButton.addActionListener { selectPath(outputField) }
		outputPanel.add(outputLabel)
		outputPanel.add(outputField)
		outputPanel.add(outputButton)

		val processPanel = JPanel()
		val processButton = JButton("Process")
		processButton.addActionListener {
			process(inputField, outputField)
		}
		processPanel.add(processButton)

		contentPanel.add(inputPanel)
		contentPanel.add(outputPanel)
		contentPanel.add(processPanel)

		setLocationRelativeTo(null)
	}
}