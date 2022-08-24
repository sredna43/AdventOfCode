package day5

import model.Day

class Day5 : Day<List<String>, Int>("Day 5") {

    private val naughtyStrings = listOf("ab", "cd", "pq", "xy")
    private val vowels = listOf('a', 'e', 'i', 'o', 'u')

    private fun isNiceString(input: String): Boolean {
        var vowelsFound = 0
        var doubleLetter = false
        var lastLetter = ' '
        var containsNaughtyString = false

        input.forEach { c ->
            run {
                if (vowels.contains(c)) {
                    vowelsFound += 1
                }
                if (c == lastLetter) {
                    doubleLetter = true
                }
                if (naughtyStrings.contains("$lastLetter$c")) {
                    containsNaughtyString = true
                }
            }
            lastLetter = c
        }
        return vowelsFound >= 3 && doubleLetter && !containsNaughtyString
    }

    private fun removeInvalidPairs(pairs: List<String>): List<String> {
        var lastPair = ""
        val validPairs = mutableListOf<String>()
        for (pair in pairs) {
            if (pair != lastPair) {
                validPairs.add(pair)
            }
            lastPair = pair
        }
        return validPairs.toList()
    }

    private fun newIsNiceString(input: String): Boolean {
        val pairs: List<String> = input.windowed(2)
        val threes: List<String> = input.windowed(3)

        val groupedPairs = removeInvalidPairs(pairs).groupingBy { it }.eachCount()

        val criteriaOneMet = groupedPairs.any { it.value > 1 }
        val criteriaTwoMet = threes.any { it[0] == it[2] }

        return criteriaOneMet && criteriaTwoMet
    }

    override fun partOne(input: List<String>): Int {
        val niceStrings = input.filter { isNiceString(it) }
        return niceStrings.count()
    }

    override fun partTwo(input: List<String>): Int {
        val niceStrings = input.filter { newIsNiceString(it) }
        return niceStrings.count()
    }

    override fun solve() {
        val input = inputReader.readFileToListOfLines("./src/main/resources/day5.txt")
        partOneAnswer = partOne(input)
        partTwoAnswer = partTwo(input)
    }
}