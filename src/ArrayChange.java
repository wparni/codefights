import java.util.Arrays;

/**
 * You are given an array of integers.
 * On each move you are allowed to increase exactly one of its element by one.
 * Find the minimal number of moves required to obtain a strictly increasing sequence from the input.
 */
public class ArrayChange {


    static int arrayChange(int[] inputArray) {

        int steps = 0;
        int difference;
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] >= inputArray[i + 1]) {
                difference = inputArray[i] - inputArray[i + 1]+1;
                inputArray[i + 1] += difference;
                steps += difference;
            }
        }
        return steps;
    }


    public static void main(String[] args) {

        int[] tablica = {-1000, 0, -2, 0};

        System.out.println(arrayChange(tablica));
    }
}
