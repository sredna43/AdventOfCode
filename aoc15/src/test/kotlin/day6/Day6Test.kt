package day6

import kotlin.test.Test
import kotlin.test.assertEquals

class Day6Test {

    private val day6 = Day6()

    private val input1 = listOf("turn on 0,0 through 999,999") // 1,000,000 --- 1,000,000
    private val input2 = listOf("toggle 0,0 through 999,0") // 1,000 --- 2,000
    private val input3 = listOf("turn on 0,0 through 999,999", "toggle 499,499 through 500,500") // 999,996 --- 1,000,008
    private val input4 = listOf("toggle 0,0 through 0,0") // 1 --- 2

    @Test
    fun testPartOne() {
        assertEquals(1000000, day6.partOne(input1) )
        assertEquals(1000, day6.partOne(input2) )
        assertEquals(999996, day6.partOne(input3))
        assertEquals(1, day6.partOne(input4))
    }

    @Test
    fun testPartTwo() {
        assertEquals(1000000, day6.partTwo(input1) )
        assertEquals(2000, day6.partTwo(input2) )
        assertEquals(1000008, day6.partTwo(input3))
        assertEquals(2, day6.partTwo(input4))
    }
}