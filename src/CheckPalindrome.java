/**
 * Given the string, check if it is a palindrome.
 */

public class CheckPalindrome {

    boolean checkPalindrome(String inputString) {
        if (inputString.length() == 0 || inputString.length() == 1)
            return true;
        if (inputString.charAt(0) == inputString.charAt(inputString.length() - 1))
            return checkPalindrome(inputString.substring(1, inputString.length() - 1));
        return false;
    }
}
