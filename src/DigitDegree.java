/**
 * Let's define digit degree of some positive integer as the number of times we need to replace this number with the sum of its digits until we get to a one digit number.
 * Given an integer, find its digit degree.
 */
public class DigitDegree {

    static int digitDegree(int n) {

        int count = 0;
        int sum = 0;
        String z = String.valueOf(n);


        if (n < 10) {
            return 0;
        } else {
            do {
                for (int i = 0; i < z.length(); i++) {
                    sum += (int) z.charAt(i) - '0';
                }
                z = String.valueOf(sum);
                sum = 0;
                count++;
            } while (Integer.valueOf(z) > 9);

        }

        return count;
    }


    public static void main(String[] args) {


        int n = 91;
        System.out.println(digitDegree(n));
    }
}

