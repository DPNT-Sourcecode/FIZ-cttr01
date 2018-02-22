package befaster.solutions;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {

    @Test
    public void test_fizz_buzz() {
        assertThat(FizzBuzz.fizzBuzz(3), equals("fizz"));
        assertThat(FizzBuzz.fizzBuzz(5), equals("buzz"));
        assertThat(FizzBuzz.fizzBuzz(15), equals("fizz buzz"));
        assertThat(FizzBuzz.fizzBuzz(16), equals("16"));
    }
}
