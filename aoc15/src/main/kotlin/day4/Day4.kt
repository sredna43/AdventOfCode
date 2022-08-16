package day4

import model.Day
import java.math.BigInteger
import java.security.MessageDigest

class Day4: Day<String, Long>("Day 4") {

    private fun generateMD5(input: String): String {
        val md = MessageDigest.getInstance("MD5")
        return BigInteger(1, md.digest(input.toByteArray())).toString(16).padStart(32, '0')
    }

    private fun matchMD5StartingSequence(input: String, sequence: String): Long {
        var i: Long = 0
        var hash = generateMD5(input + "0")
        while ((hash.substring(0, sequence.length) != sequence) && (i < 100000000)) {
            i += 1
            hash = generateMD5("$input$i")
        }
        return i
    }

    override fun partOne(input: String): Long {
        return matchMD5StartingSequence(input, "00000")
    }

    override fun partTwo(input: String): Long {
        return matchMD5StartingSequence(input, "000000")
    }

    override fun solve() {
        val input = inputReader.readFileToString("./src/main/resources/day4.txt")
        partOneAnswer = partOne(input)
        partTwoAnswer = partTwo(input)
    }

}