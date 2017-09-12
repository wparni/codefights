/**
 * Define a word as a sequence of consecutive English letters. Find the longest word from the given string.
 */

public class LongestWord {

    static String longestWord(String text) {

        String result = "";
        String replace = text.replaceAll("[^a-zA-Z]", " ");


        String[] array = replace.split(" ");
        int max = array[0].length();
        try {
            if (array[1] == null) {
            }
        } catch (ArrayIndexOutOfBoundsException aioe) {
            return array[0];
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > max) {
                result = array[i];
                max = array[i].length();
            } else if (array[i].length() == max) {
                result = array[i];
            }
        }


        return result;
    }

    public static void main(String[] args) {


        String test = "asdfasdqweqweAEFAS*()*()5:6kj";
        System.out.println(longestWord(test));
    }
}