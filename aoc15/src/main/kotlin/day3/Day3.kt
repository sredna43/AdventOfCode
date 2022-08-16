package day3

import model.Day

class Day3 : Day<String, Int>("Day 3") {

    override fun partOne(input: String): Int {
        val santa = Santa()
        santa.visitHouses(input)
        return santa.getHousesVisited().count()
    }

    override fun partTwo(input: String): Int {
        val santa = Santa()
        val roboSanta = Santa()
        val santaInput = input.filterIndexed { index, _ -> index % 2 == 0 }
        val roboSantaInput = input.filterIndexed { index, _ -> index % 2 == 1 }
        santa.visitHouses(santaInput)
        roboSanta.visitHouses(roboSantaInput)
        santa.getHousesVisited().forEach { roboSanta.getHousesVisited().putIfAbsent(it.key, it.value) }
        return roboSanta.getHousesVisited().count()
    }

    override fun solve() {
        val input = inputReader.readFileToString("./src/main/resources/day3.txt")
        partOneAnswer = partOne(input)
        partTwoAnswer = partTwo(input)
    }
}