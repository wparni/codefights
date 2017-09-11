/**
 * A string is said to be beautiful if b occurs in it no more times than a; c occurs in it no more times than b; etc.
 * Given a string, check whether it is beautiful.
 */


public class IsBeautifulString {

    static boolean isBeautifulString(String inputString) {
        int[] count = new int[26];
        for (char cha : inputString.toCharArray()) {
            count[cha - 'a']++;
        }
        for (int i = 1; i < 26; i++) {
            if (count[i - 1] < count[i]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        String doSprawdzenia = "bbbaacdafe";
        System.out.println(isBeautifulString(doSprawdzenia));

    }
}
