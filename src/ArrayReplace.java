import java.util.Arrays;

/**
 Given an array of integers, replace all the occurrences of elemToReplace with substitutionElem.
 */
public class ArrayReplace {

    static int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {

        int[] newArray = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            newArray[i] = inputArray[i];
            if (inputArray[i] == elemToReplace) {
                newArray[i] = substitutionElem;
            }
        }
        return newArray;
    }


    public static void main(String[] args) {


        int[] array = {1, 2, 1};
        int elementToChange = 1;
        int changedElement = 3;

        System.out.println(Arrays.toString(arrayReplace(array, elementToChange, changedElement)));
    }
}
