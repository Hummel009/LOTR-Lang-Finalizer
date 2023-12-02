package hummel

import java.io.File

fun main(args: Array<String>) {
	require(args.size == 2) {
		println("Usage: java -jar ThisApp.jar langUnfinalized.lang")
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