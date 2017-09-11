/**
 Find the leftmost digit that occurs in a given string.

 */
public class FirstDigit {


    static char firstDigit(String inputString) {

        char x = ' ';
        char[] z = inputString.toCharArray();

        for (int i = 0; i < z.length; i++) {
            if (z[i] >= 48 && z[i] <= 57) {
                x = z[i];
                break;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        String jakisTam = "v825a2r_1__In4t";

        System.out.println(firstDigit(jakisTam));
    }
}
