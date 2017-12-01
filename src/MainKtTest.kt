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
}