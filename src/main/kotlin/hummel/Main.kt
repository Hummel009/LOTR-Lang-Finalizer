package hummel

import java.io.File

fun main(args: Array<String>) {
	if (args.isEmpty()) {
		println("Usage: java -jar ThisApp.jar langUnfinalized.lang")
		return
	}

	val firstFile = File(args[0])
	val lines = File(args[0]).readLines()

	val uniqueLines = lines.map {
		it.split('=', limit = 2)
	}.distinctBy {
		it[0]
	}.map {
		it.joinToString("=")
	}

	File("${firstFile.nameWithoutExtension}-finalized.lang").writeText(uniqueLines.joinToString("\n"))
}