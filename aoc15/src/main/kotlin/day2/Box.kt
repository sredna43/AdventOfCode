package day2

class Box (private val sides: List<Int>) {

    private fun calculateExtraPaperNeeded(): Int {
        val side1 = sides.minOf { it }
        val side2 = sides.sorted()[1]
        return side1 * side2
    }

    fun calculateTotalPaperNeeded(): Int {
        val (l, w, h) = sides
        return (2*l*w + 2*w*h + 2*h*l) + calculateExtraPaperNeeded()
    }

    private fun calculateBow(): Int {
        return sides.reduce{ acc, i -> acc * i }
    }

    private fun calculateRibbon(): Int {
        val side1 = sides.minOf { it }
        val side2 = sides.sorted()[1]
        return 2*side1 + 2*side2
    }

    fun calculateTotalRibbonNeeded(): Int {
        return calculateRibbon() + calculateBow()
    }
}