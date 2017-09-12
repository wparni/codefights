/**
 * Given an array of strings, return another array containing all of its longest strings.
 */

public class AllLongestStrings {

    String[] allLongestStrings(String[] inputArray) {

        int stringLenght = 0;
        int stringCount = 0;


        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length() > stringLenght) {
                stringLenght = inputArray[i].length();
                stringCount = 1;
            } else if (stringLenght == inputArray[i].length()) {
                stringCount++;
            }
        }

        String[] newArray = new String[stringCount];

        int indexTablicy = 0;
        for (int j = 0; j < inputArray.length; j++) {
            if (stringLenght == inputArray[j].length()) {
                newArray[indexTablicy++] = inputArray[j];
            }
        }
        return newArray;
    }
}
