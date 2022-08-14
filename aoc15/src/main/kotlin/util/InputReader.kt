package util

import java.io.File

class InputReader {
    fun readFileToString(path: String): String = File(path).readText(Charsets.UTF_8)
    fun readFileToListOfLines(path: String): List<String> = File(path).readLines(Charsets.UTF_8)
}