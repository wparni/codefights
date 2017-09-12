/**
 * Ticket numbers usually consist of an even number of digits.
 * A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.
 * Given a ticket number n, determine if it's lucky or not.
 */

public class IsLucky {

    boolean isLucky(int n) {

        int lenght = Integer.toString(n).length();
        String text = Integer.toString(n);
        int sum = 0;
        for (int i = 0; i < lenght / 2; i++) {
            sum += text.charAt(i) - text.charAt(lenght - 1 - i);
        }
        return sum == 0;
    }
}
