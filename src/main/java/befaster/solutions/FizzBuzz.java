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

        boolean fizzDeluxe = isFizzDeluxe(number);
        boolean buzzDeluxe = isBuzzDeluxe(number);
        if(fizzDeluxe || buzzDeluxe) {
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


    public static boolean isFizzDeluxe(Integer x) {
        return x % 3 == 0 && x.toString().contains("3");
    }

    public static boolean isBuzzDeluxe(Integer x) {
        return x % 5 == 0 && x.toString().contains("5");
    }


    public static void main(String[] args) {
        for(int i=1; i<1000000; i++) {
            int nb = 5 * 3 * i;
            if(isFizzDeluxe(nb) && isBuzzDeluxe(nb)) {
                System.out.println(nb);
            }
        }
    }

}
