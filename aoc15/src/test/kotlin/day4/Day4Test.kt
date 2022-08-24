package day4

import kotlin.test.Test
import kotlin.test.assertEquals

class Day4Test {

    private val day4 = Day4()

    private val input1 = "abcdef"
    private val input2 = "pqrstuv"

    @Test
    fun testPartOne() {
        assertEquals(609043, day4.partOne(input1))
        assertEquals(1048970, day4.partOne(input2))
    }

    @Test
    fun testPartTwo() {
        assertEquals(6742839, day4.partTwo(input1))
        assertEquals(5714438, day4.partTwo(input2))
    }
}