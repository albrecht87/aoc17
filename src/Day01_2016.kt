import java.math.BigInteger

/**
 *
 *You're airdropped near Easter Bunny Headquarters in a city somewhere.
 * "Near", unfortunately, is as close as you can get - the instructions on the Easter Bunny Recruiting Document
 * the Elves intercepted start here, and nobody had time to work them out further.
 *
 *The Document indicates that you should start at the given coordinates (where you just landed) and face North.
 * Then, follow the provided sequence: either turn left (L) or right (R) 90 degrees,
 * then walk forward the given number of blocks, ending at a new intersection.
 *
 *There's no time to follow such ridiculous instructions on foot, though,
 * so you take a moment and work out the destination.
 * Given that you can only walk on the street grid of the city, how far is the shortest path to the destination?
 *
 *For example:
 *
 *Following R2, L3 leaves you 2 blocks East and 3 blocks North, or 5 blocks away.
 *R2, R2, R2 leaves you 2 blocks due South of your starting position, which is 2 blocks away.
 *R5, L5, R5, R3 leaves you 12 blocks away.
 *How many blocks away is Easter Bunny HQ?
 */

val puzzle = "R2, L1, R2, R1, R1, L3, R3, L5, L5, L2, L1, R4, R1, R3, L5, L5, R3, L4, L4, R5, R4, R3, L1, L2, R5, R4, L2, R1, R4, R4, L2, L1, L1, R190, R3, L4, R52, R5, R3, L5, R3, R2, R1, L5, L5, L4, R2, L3, R3, L1, L3, R5, L3, L4, R3, R77, R3, L2, R189, R4, R2, L2, R2, L1, R5, R4, R4, R2, L2, L2, L5, L1, R1, R2, L3, L4, L5, R1, L1, L2, L2, R2, L3, R3, L4, L1, L5, L4, L4, R3, R5, L2, R4, R5, R3, L2, L2, L4, L2, R2, L5, L4, R3, R1, L2, R2, R4, L1, L4, L4, L2, R2, L4, L1, L1, R4, L1, L3, L2, L2, L5, R5, R2, R5, L1, L5, R2, R4, R4, L2, R5, L5, R5, R5, L4, R2, R1, R1, R3, L3, L3, L4, L3, L2, L2, L2, R2, L1, L3, R2, R5, R5, L4, R3, L3, L4, R2, L5, R5"

fun solve(): Int {
    return solution_day01_16(arrayOf(puzzle))
}

fun solution_day01_16(args: Array<String>): Int {

    var point = intArrayOf(0, 0)
    var currentDirection = 0

    val inputList = args[0]
            .replace(" ", "")
            .splitToSequence(",")

    for (item in inputList) {
        currentDirection = rotateDirection(currentDirection, parseRotation(item))
        point = goDirection(currentDirection, parseSteps(item), point[0], point[1])
    }

    val hamiltonDistance = hamiltonDistance(point)
    println("${point.contentToString()} in Universe and $hamiltonDistance far away")
    return hamiltonDistance

}

fun hamiltonDistance(input: IntArray): Int {
    return Math.abs(input[0]) + Math.abs(input[1])
}

fun goDirection(rotation: Int, steps: Int, xIn: Int, yIn: Int): IntArray {
    var x = xIn
    var y = yIn

    when (rotation) {
        0 -> y += steps
        1 -> x += steps
        2 -> y -= steps
        3 -> x -= steps
    }

    return intArrayOf(x, y)
}

fun rotateDirection(start: Int, rotation: Int): Int {
    val dir = BigInteger.valueOf((start + rotation).toLong())
    val mod = BigInteger.valueOf(4)
    val sol = dir.mod(mod)
    return sol.toInt()
}

fun parseRotation(input: String): Int {
    if (input.contains("R")) {
        return 1
    } else {
        return -1
    }
}

fun parseSteps(input: String): Int {
    val steps = input.replace("[RL]".toRegex(), "")
    return steps.toInt()
}