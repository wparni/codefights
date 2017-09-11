import java.util.Arrays;

/**
 Given array of integers, remove each kth element from it.
 */
public class ExtractEachKth {
    static int[] extractEachKth(int[] inputArray, int k) {
        int countDelete = inputArray.length / k;
        int index = 0;
        int[] array = new int[inputArray.length - countDelete];

        for (int i = 0; i < inputArray.length; i++) {
            if ((i + 1) % k != 0) {
                array[index] = inputArray[i];
                index++;
            }
        }
        return array;
    }

    public static void main(String[] args) {


        int[] druga = {1, 2, 1, 2, 1, 2, 1, 2};
        int[] tablica = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 3;
        System.out.println(Arrays.toString(extractEachKth(tablica, k)));
    }
}
