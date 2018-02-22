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
        for(int i=1; i<1000; i++) {
            if(hasSameDigits(15 * i)) {
                System.out.println(15*i);
                break;
            }
        }
    }

}
