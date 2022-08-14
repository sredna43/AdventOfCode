package day2

import model.Day

class Day2: Day<List<String>, Int>("Day 2") {

    private fun parseLine(line: String): Box {
        val sides = line.split("x").map { it.toInt() }
        return Box(sides)
    }

    override fun partOne(input: List<String>): Int {
        return input.sumOf { parseLine(it).calculateTotalPaperNeeded() }
    }

    override fun partTwo(input: List<String>): Int {
        return input.sumOf { parseLine(it).calculateTotalRibbonNeeded() }
    }

    override fun solve() {
        val input = inputReader.readFileToListOfLines("./src/main/resources/day2.txt")
        partOneAnswer = partOne(input)
        partTwoAnswer = partTwo(input)
    }
}