package day6

import model.Day

class Day6 : Day<List<String>, Int>("Day 6") {

    private lateinit var grid: Array<IntArray>

    private fun parseLine(input: String): Instruction {
        val instruction = Instruction()
        var firstPoint: List<String>
        var secondPoint: List<String>
        val splitLine = input.split(" ")
        if (splitLine[0] == "turn") {
            instruction.type = splitLine[1]
            firstPoint = splitLine[2].split(",")
            secondPoint = splitLine[4].split(",")
        } else {
            instruction.type = splitLine[0]
            firstPoint = splitLine[1].split(",")
            secondPoint = splitLine[3].split(",")
        }
        instruction.first = Pair(
            firstPoint.first().toInt(),
            firstPoint.last().toInt()
        )
        instruction.second = Pair(
            secondPoint.first().toInt(),
            secondPoint.last().toInt()
        )

        return instruction
    }

    private fun turnOnTheLights(start: Pair<Int, Int>, stop: Pair<Int, Int>) {
        for (i in start.first..stop.first) {
            for (j in start.second..stop.second) {
                grid[i][j] = 1
            }
        }
    }



    private fun turnOffTheLights(start: Pair<Int, Int>, stop: Pair<Int, Int>) {
        for (i in start.first..stop.first) {
            for (j in start.second..stop.second) {
                grid[i][j] = 0
            }
        }
    }

    private fun toggleTheLights(start: Pair<Int, Int>, stop: Pair<Int, Int>) {
        for (i in start.first..stop.first) {
            for (j in start.second..stop.second) {
                if (grid[i][j] == 0) {
                    grid[i][j] = 1
                } else {
                    grid[i][j] = 0
                }
            }
        }
    }

    private fun followInstruction(input: String) {
        val instruction = parseLine(input)
        when (instruction.type) {
            "on" -> turnOnTheLights(instruction.first, instruction.second)
            "off" -> turnOffTheLights(instruction.first, instruction.second)
            "toggle" -> toggleTheLights(instruction.first, instruction.second)
            else -> println("unknown instruction: ${instruction.type}")
        }
    }

    override fun partOne(input: List<String>): Int {
        grid = Array(1000) { IntArray(1000) { 0 } }
        var count = 0
        input.forEach {
            followInstruction(it)
        }
        grid.forEach { row ->
            row.forEach { item ->
                count += item
            }
        }
        return count
    }

    // Part Two Below, split for readability since they're very similar

    private fun turnOnTheLights2(start: Pair<Int, Int>, stop: Pair<Int, Int>) {
        for (i in start.first..stop.first) {
            for (j in start.second..stop.second) {
                grid[i][j] = grid[i][j] + 1
            }
        }
    }

    private fun turnOffTheLights2(start: Pair<Int, Int>, stop: Pair<Int, Int>) {
        for (i in start.first..stop.first) {
            for (j in start.second..stop.second) {
                grid[i][j] = (grid[i][j] - 1).coerceAtLeast(0)
            }
        }
    }

    private fun toggleTheLights2(start: Pair<Int, Int>, stop: Pair<Int, Int>) {
        for (i in start.first..stop.first) {
            for (j in start.second..stop.second) {
                grid[i][j] = grid[i][j] + 2
            }
        }
    }

    private fun followInstruction2(input: String) {
        val instruction = parseLine(input)
        when (instruction.type) {
            "on" -> turnOnTheLights2(instruction.first, instruction.second)
            "off" -> turnOffTheLights2(instruction.first, instruction.second)
            "toggle" -> toggleTheLights2(instruction.first, instruction.second)
            else -> println("unknown instruction: ${instruction.type}")
        }
    }

    override fun partTwo(input: List<String>): Int {
        grid = Array(1000) { IntArray(1000) { 0 } }
        var count = 0
        input.forEach {
            followInstruction2(it)
        }
        grid.forEach { row ->
            row.forEach { item ->
                count += item
            }
        }
        return count
    }

    override fun solve() {
        val input = inputReader.readFileToListOfLines("./src/main/resources/day6.txt")
        partOneAnswer = partOne(input)
        partTwoAnswer = partTwo(input)
    }

}