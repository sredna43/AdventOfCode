package day3

class Santa {
    private var location = Pair(0, 0)
    private var housesVisited = mutableMapOf(Pair(location.toString(), 1))

    private fun parseInstructions(direction: Char): Pair<Int, Int> {
        return when (direction) {
            '>' -> Pair(1, 0)
            '<' -> Pair(-1, 0)
            '^' -> Pair(0, 1)
            'v' -> Pair(0, -1)
            else -> Pair(0, 0)
        }
    }

    private fun move(direction: Char) {
        location = location.add(parseInstructions(direction))
        housesVisited.putIfAbsent(location.toString(), 1)
    }

    private fun Pair<Int, Int>.add(a: Pair<Int, Int>): Pair<Int, Int> {
        return Pair(this.first + a.first, this.second + a.second)
    }

    fun visitHouses(input: String) {
        input.forEach { move(it) }
    }

    fun getHousesVisited(): MutableMap<String, Int> {
        return housesVisited
    }
}