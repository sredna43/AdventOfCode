package day2

import model.Day

class Day2: Day<List<String>, Int>("Day 2") {

    override fun partOne(input: List<String>): Int {
        return -1
    }

    override fun partTwo(input: List<String>): Int {
        return -1
    }

    override fun solve() {
        val input = inputReader.readFileToListOfLines("./src/main/resources/day1.txt")
        partOneAnswer = partOne(input)
        partTwoAnswer = partTwo(input)
    }
}