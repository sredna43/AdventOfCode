package day1

import model.Day

class Day1: Day<String, Int>("Day 1") {

    private val inputFilePath = "./src/main/resources/day1.txt"

    private var floor = 0

    private fun move(c: Char): Int {
        when (c) {
            '(' -> floor += 1
            ')' -> floor -= 1
        }
        return floor
    }

    override fun partOne(input: String): Int {
        floor = 0
        return input.map { move(it) }.last()
    }

    override fun partTwo(input: String): Int {
        floor = 0
        return input.map { move(it) }.indexOfFirst { it == -1 } + 1
    }

    override fun solve() {
        val input = inputReader.readFileToString(inputFilePath)
        partOneAnswer = partOne(input)
        partTwoAnswer = partTwo(input)
    }
}