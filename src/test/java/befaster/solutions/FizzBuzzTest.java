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

        assertThat(FizzBuzz.fizzBuzz(137), equalTo("fizz"));
        assertThat(FizzBuzz.fizzBuzz(157), equalTo("buzz"));
        assertThat(FizzBuzz.fizzBuzz(53), equalTo("fizz buzz"));


//        - A number is considered to be "deluxe" if it is greater than 10 and all the digits are identical
//        - A number can be "fizz", "buzz" and "deluxe" at the same time. If this happens then write "fizz buzz deluxe"

        assertThat(FizzBuzz.fizzBuzz(7777), equalTo("deluxe"));
        assertThat(FizzBuzz.fizzBuzz(33), equalTo("fizz deluxe"));
        assertThat(FizzBuzz.fizzBuzz(5555), equalTo("buzz deluxe"));
        assertThat(FizzBuzz.fizzBuzz(555), equalTo("fizz buzz deluxe"));
    }
}
