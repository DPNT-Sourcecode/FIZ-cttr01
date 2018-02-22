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

        if(number > 10 && hasSameDigits(number)) {
            if(number % 2 != 0) {
                result += " fake";
            }
            result += " deluxe";
        }

        if(result.isEmpty()) {
            return number.toString();
        } else {
            return result.trim();
        }
    }

    public static boolean hasSameDigits(Integer x) {
        String numberString = x.toString();
        return numberString.replaceAll(numberString.substring(0,1), "").equals("");
    }


    public static void main(String[] args) {
        for(int i=10; i<1000000; i++) {
            int nb = 5 * 3 * 2 * i;
            if(hasSameDigits(nb)) {
                System.out.println(nb);
                break;
            }
        }
    }

}
