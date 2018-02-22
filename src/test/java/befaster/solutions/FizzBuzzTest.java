package befaster.solutions;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {

    @Test
    public void test_fizz_buzz() {
        assertThat(FizzBuzz.fizzBuzz(3), equalTo("fizz"));
        assertThat(FizzBuzz.fizzBuzz(5), equalTo("buzz"));
        assertThat(FizzBuzz.fizzBuzz(15), equalTo("fizz buzz"));
        assertThat(FizzBuzz.fizzBuzz(16), equalTo("16"));
    }
}
