package day6

data class Instruction(
    var type: String = "",
    var first: Pair<Int, Int> = Pair(0, 0),
    var second: Pair<Int, Int> = Pair(0, 0)
)