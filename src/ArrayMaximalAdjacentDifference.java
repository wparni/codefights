import java.util.Arrays;

/**
 * Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.
 */
public class ArrayMaximalAdjacentDifference {

    static int arrayMaximalAdjacentDifference(int[] inputArray) {
        int maxDifference;
        int[] array = new int[inputArray.length - 1];


        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] > inputArray[i + 1]) {
                maxDifference = inputArray[i] - inputArray[i + 1];
            } else {
                maxDifference = inputArray[i + 1] - inputArray[i];
            }

            array[i] = maxDifference;
        }


        int max = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] tablica = {1, 5, -3, 6};

        System.out.println(arrayMaximalAdjacentDifference(tablica));
    }
}
