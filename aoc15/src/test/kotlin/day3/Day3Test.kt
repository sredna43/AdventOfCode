package day3

import kotlin.test.Test
import kotlin.test.assertEquals

class Day3Test {

    private val day3 = Day3()

    private val input1 = ">"
    private val input2 = "^>v<"
    private val input3 = "^v^v^v^v^v"


    @Test
    fun testPartOne() {
        assertEquals(2, day3.partOne(input1))
        assertEquals(4, day3.partOne(input2))
        assertEquals(2, day3.partOne(input3))
    }

    @Test
    fun testPartTwo() {
        assertEquals(2, day3.partTwo(input1))
        assertEquals(3, day3.partTwo(input2))
        assertEquals(11, day3.partTwo(input3))
    }
}