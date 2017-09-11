
/**
 * Given array of integers, find the maximal possible sum of some of its k consecutive elements.
 */
public class ArrayMaxConsecutiveSum {

    static int arrayMaxConsecutiveSum(int[] inputArray, int k) {
        int suma1;
        int suma2 = 0;
        for (int i = 0; i < k; i++) {
            suma2 += inputArray[i];
        }
        suma1 = suma2;
        for (int i = k; i < inputArray.length; i++) {
            int suma3 = suma2 - inputArray[i - k] + inputArray[i];
            if (suma3 > suma1) {
                suma1 = suma3;
            }
            suma2 = suma3;
        }
        return suma1;
    }


    public static void main(String[] args) {

        int[] someArray = {2, 3, 5, 1, 6, 2, 3, 5, 1, 6, 2, 3, 5, 1, 6, 2, 3, 5, 1, 6, 2, 3, 5, 1, 6, 2, 3, 5, 1, 6};
        int k = 3;

        System.out.println(arrayMaxConsecutiveSum(someArray, k));

    }
}
