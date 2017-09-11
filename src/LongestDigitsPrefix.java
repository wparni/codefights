/**
 Given a string, output its longest prefix which contains only digits.
 */
public class LongestDigitsPrefix {


    static String longestDigitsPrefix(String inputString) {
        String result = "";

        if (Character.isDigit(inputString.charAt(0))) {
            for (int i = 1; i < inputString.length(); i++) {
                if (Character.isDigit(inputString.charAt(i))) {
                    result += inputString.charAt(i);
                } else if (!Character.isDigit(inputString.charAt(i))) {
                    break;
                }
            }
            result = inputString.charAt(0) + result;
        } else {
            result = "";
        }
        return result;
    }


    public static void main(String[] args) {

        String inputString = "  3) always check for whitespaces";

        System.out.println(longestDigitsPrefix(inputString));

    }
}
