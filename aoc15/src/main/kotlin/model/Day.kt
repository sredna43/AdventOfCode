package model

import util.InputReader

/**
 * @param T1 Input type
 * @param T2 Answer type
 * @constructor name to be displayed
 * @property partOneAnswer answer to part one
 * @property partTwoAnswer answer to part two
 */
abstract class Day<T1: Any, T2: Any>(private val name: String) {
    val inputReader = InputReader()
    var partOneAnswer = 0
    var partTwoAnswer = 0
    abstract fun partOne(input: T1): T2
    abstract fun partTwo(input: T1): T2
    abstract fun solve()

    override fun toString(): String {
        solve()
        return "$name Part 1: $partOneAnswer\n" +
                "$name Part 2: $partTwoAnswer"
    }
}