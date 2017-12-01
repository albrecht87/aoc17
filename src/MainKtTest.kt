import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun solution_day01_1122() {
        assert(solution_day01("1122") == 3);
    }
    @Test
    fun solution_day01_1111() {
        assert(solution_day01("1111") == 4);
    }
    @Test
    fun solution_day01_1234() {
        assert(solution_day01("1234") == 0);
    }
    @Test
    fun solution_day01_91212129() {
        assert(solution_day01("91212129") == 9);
    }

    /**
     * 1212 produces 6: the list contains 4 items, and all four digits match the digit 2 items ahead.
     * 1221 produces 0, because every comparison is between a 1 and a 2.
     * 123425 produces 4, because both 2s match each other, but no other digit has a match.
     * 123123 produces 12.
     * 12131415 produces 4.
     */

    @Test
    fun solution_day02_1122() {
        assert(solution_day02("1212") == 6);
    }
    @Test
    fun solution_day02_1221() {
        assert(solution_day02("1221") == 0);
    }
    @Test
    fun solution_day02_123425() {
        assert(solution_day02("123425") == 4);
    }
    @Test
    fun solution_day02_123123() {
        assert(solution_day02("123123") == 12);
    }
    @Test
    fun solution_day02_12131415() {
        assert(solution_day02("12131415") == 4);
    }

}