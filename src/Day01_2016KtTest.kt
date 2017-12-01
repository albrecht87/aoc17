import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day01_2016KtTest {
    /**
    a. Following R2, L3 leaves you 2 blocks East and 3 blocks North, or 5 blocks away.

    b. R2, R2, R2 leaves you 2 blocks due South of your starting position, which is 2 blocks away.

    c. R5, L5, R5, R3 leaves you 12 blocks away.
     **/

    @Test
    fun a() {
        assertEquals(5, solution_day01_16(arrayOf("R2, L3")))
    }

    @Test
    fun b() {
        assertEquals(2, solution_day01_16(arrayOf("R2, R2, R2")))
    }

    @Test
    fun c() {
        assertEquals(12, solution_day01_16(arrayOf("R5, L5, R5, R3")))
    }

    @Test
    fun north_to_west() {
        assertEquals(3, rotateDirection(0, -1))
    }

    @Test
    fun west_to_north() {
        assertEquals(0, rotateDirection(3, 1))
    }

    @Test
    fun parseSteps() {
        assertEquals(5, parseSteps("R5"))
        assertEquals(5, parseSteps("L5"))
        assertEquals(5, parseSteps("RRRR5"))
        assertEquals(5, parseSteps("RLRLR5"))
        assertEquals(5, parseSteps("R5"))
    }

}