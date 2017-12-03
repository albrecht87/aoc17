import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Day02_2017KtTest {

    val test = "5\t1\t9\t5\n" +
            "7\t5\t3\n" +
            "2\t4\t6\t8"

    val test2 = "5\t9\t2\t8\n" +
            "9\t4\t7\t3\n" +
            "3\t8\t6\t5"

    @Test
    fun solution_day02a() {
        assertEquals(18, solution_day02a(test))
    }

    @Test
    fun solution_day02b() {
        assertEquals(9, solution_day02b(test2))
    }

    @Test
    fun solution_day02_checksum_b_1() {
        assertEquals(4, checksum_b(0, listOf(5, 9, 2, 8)))
        assertEquals(3, checksum_b(0, listOf(9, 4, 7, 3)))
        assertEquals(2, checksum_b(0, listOf(3, 8, 6, 5)))
    }
}