/**
 * Check if the given string is a correct time representation of the 24-hour clock.
 */

public class SumUpNumbers {

    static int sumUpNumbers(String inputString) {

        String numbers = inputString.replaceAll("[^0-9]", " ");
        int sum = 0;
        String[] splitedNumbers = numbers.split(" ");

        for (int i = 0; i < splitedNumbers.length; i++) {
            if (!splitedNumbers[i].isEmpty()) {
                Integer.parseInt(splitedNumbers[i]);
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        String test = "2 apples, 12 oranges";

        System.out.println(sumUpNumbers(test));
    }
}
