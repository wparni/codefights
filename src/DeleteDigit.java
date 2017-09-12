/**
 * Given some integer, find the maximal number you can obtain by deleting exactly one digit of the given number.
 */

public class DeleteDigit {


    static int deleteDigit(int n) {

        String max = "";
        String newString = "0";
        char[] digitArray = String.valueOf(n).toCharArray();


        for (int i = 0; i < digitArray.length; i++) {
            for (int j = 0; j < digitArray.length; j++) {
                if (i != j) {
                    max += digitArray[j];
                }
            }
            if (Integer.parseInt(newString) < Integer.parseInt(max)) {
                newString = max;
                max = "";
            } else {
                max = "";
            }
        }
        return Integer.parseInt(newString);
    }

    public static void main(String[] args) {

        int deleteDigit = 152;

        System.out.println(deleteDigit(deleteDigit));
    }
}
