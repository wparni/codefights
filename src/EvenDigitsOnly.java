/**
 Check if all digits of the given integer are even.
 */
public class EvenDigitsOnly {

    static boolean evenDigitsOnly(int n) {


        char[] arrayOfDigits = String.valueOf(n).toCharArray();
        int result = 0;


        for (int i = 0; i < arrayOfDigits.length; i++) {
            if (arrayOfDigits[i] % 2 == 0) {
                result++;
            } else {
                result--;
            }
        }
        if (result == arrayOfDigits.length) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int n = 238622;


        System.out.println(evenDigitsOnly(n));
    }
}
