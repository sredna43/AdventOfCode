package day1

import kotlin.test.Test
import kotlin.test.assertEquals

class Day1Test {

    private val day1 = Day1()

    @Test
    fun testPartOne() {
        assertEquals(0, day1.partOne("(())"))
        assertEquals(0, day1.partOne("))(("))
        assertEquals(-3, day1.partOne(")))"))
        assertEquals(3, day1.partOne("((("))
    }

    @Test
    fun testPartTwo() {
        assertEquals(0, day1.partTwo(")"))
        assertEquals(2, day1.partTwo("())"))
    }
}