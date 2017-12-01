import org.junit.jupiter.api.Test

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

    @Test
    fun solution_day02_1122() {
        assert(solution_day01b("1212") == 6);
    }

    @Test
    fun solution_day02_1221() {
        assert(solution_day01b("1221") == 0);
    }

    @Test
    fun solution_day02_123425() {
        assert(solution_day01b("123425") == 4);
    }

    @Test
    fun solution_day02_123123() {
        assert(solution_day01b("123123") == 12);
    }

    @Test
    fun solution_day02_12131415() {
        assert(solution_day01b("12131415") == 4);
    }

}