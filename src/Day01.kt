import kotlin.math.abs

fun main() {
    fun part1(input: List<String>): Int {
        val col1 = ArrayList<Int>()
        val col2 = ArrayList<Int>()

        // create two list to save the two column
        for (line in input){
            col1.add(line.split("   ")[0].toInt())
            col2.add(line.split("   ")[1].toInt())
        }

        // sort the two list created
        col1.sort()
        col2.sort()

        var result = 0
        for( i in col1.indices){
            result += abs(col1[i]-col2[i])
        }

        return result
    }

    fun part2(input: List<String>): Int {
        val col1 = ArrayList<Int>()
        val col2 = ArrayList<Int>()

        // create two list to save the two column
        for (line in input){
            col1.add(line.split("   ")[0].toInt())
            col2.add(line.split("   ")[1].toInt())
        }

        var result = 0

        for (elem in col1)
        {
            result += elem *  col2.count { it == elem }
        }

        return result
    }

    // Read the input from the `src/Day01.txt` file.
    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()
}
