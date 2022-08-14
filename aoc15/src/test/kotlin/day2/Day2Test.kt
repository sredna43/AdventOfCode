package day2

import kotlin.test.Test
import kotlin.test.assertEquals

class Day2Test {

    private val day2 = Day2()

    private val input = listOf("2x3x4", "1x1x10")

    @Test
    fun testPartOne() {
        assertEquals(91, day2.partOne(input))
    }

    @Test
    fun testPartTwo() {

    }
}