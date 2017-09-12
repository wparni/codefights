/**
 * Given two strings, find the number of common characters between them.
 */

public class CommonCharacterCount {

    int commonCharacterCount(String s1, String s2) {


        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();

        int counter = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    array2[j] = ' ';
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }
}
