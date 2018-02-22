package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        String result = "";
        if(number % 3 == 0 || number.toString().contains("3")) {
            result += "fizz";
        }

        if(number % 5 == 0 || number.toString().contains("5")) {
            result += " buzz";
        }

        if(result.isEmpty()) {
            return number.toString();
        } else {
            return result.trim();
        }
    }

}
