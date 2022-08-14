package day2

import kotlin.test.Test
import kotlin.test.assertEquals

class Day2Test {

    private val day2 = Day2()

    private val input1 = listOf("2x3x4", "1x1x10")
    private val input2 = listOf("2x3x4")
    private val input3 = listOf("1x1x10")

    @Test
    fun testPartOne() {
        assertEquals(101, day2.partOne(input1))
        assertEquals(58, day2.partOne(input2))
        assertEquals(43, day2.partOne(input3))
    }

    @Test
    fun testPartTwo() {
        assertEquals(48, day2.partTwo(input1))
        assertEquals(34, day2.partTwo(input2))
        assertEquals(14, day2.partTwo(input3))
    }
}