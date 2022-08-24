package day5

import kotlin.test.Test
import kotlin.test.assertEquals

class Day5Test {

    private val day5 = Day5()

    private val input1 = listOf("ugknbfddgicrmopn", "aaa", "abc")
    private val input2 = listOf("haegwjzuvuyypxyu", "dvszwmarrgswjxmb", "jchzalrnumimnmhp", "aqcpdefgghi")
    private val input3 = listOf("qjhvhtzxzqqjkmpb", "aaaxyxy", "abacxxysx", "aaa")

    @Test
    fun testPartOne() {
        assertEquals(2, day5.partOne(input1))
        assertEquals(1, day5.partOne(input2))
    }

    @Test
    fun testPartTwo() {
        assertEquals(0, day5.partTwo(input1))
        assertEquals(2, day5.partTwo(input3))
    }
}