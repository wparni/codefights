/**
 * Construct a square matrix with a size N × N containing integers from 1 to N * N in a spiral order, starting from top-left and in clockwise direction.
 */

import java.util.Arrays;

public class SpiralNumbers {

    static int[][] spiralNumbers(int n) {
        int[][] filledArray = new int[n][n];
        int row = 0;
        int col = 0;
        int endRow = n;
        int endCol = n;
        int i;
        int nextNumber = 1;

        while (nextNumber <= n * n) {

            for (i = col; i < endCol; i++) {
                filledArray[row][i] = nextNumber++;
            }
            row++;

            for (i = row; i < endRow; i++) {
                filledArray[i][endCol - 1] = nextNumber++;
            }
            endCol--;

            for (i = endCol - 1; i >= col; i--) {
                filledArray[endRow - 1][i] = nextNumber++;
            }
            endRow--;

            for (i = endRow - 1; i >= row; i--) {
                filledArray[i][col] = nextNumber++;
            }
            col++;
        }

        return filledArray;

    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(Arrays.deepToString(spiralNumbers(n)));
    }
}

