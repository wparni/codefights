/**
 * Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9 grid
 * with digits so that each column, each row, and each of the nine 3 × 3 sub-grids that compose the grid contains all of the digits from 1 to 9.
 * This algorithm should check if the given grid of numbers represents a correct solution to Sudoku.
 */

public class Sudoku {

    static boolean sudoku(int[][] grid) {

        double average2 = 0;
        double average = 0;
        int count3x3 = 0;
        int rowCount = 0;
        int colCount = 0;


        for (int z = 0; z < grid.length; z += 3) {
            for (int i = 0; i < grid[0].length; i += 3) {
                for (int k = z; k < z + 3; k++) {
                    for (int j = i; j < i + 3; j++) {
                        average += grid[k][j];
                    }
                }
                average /= 9;
                if (average == 5.0) {
                    count3x3++;
                    average = 0;
                }
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                try {
                    if (grid[i][j] != grid[i][j + 1]) {
                        average += grid[i][j];
                        average2 += grid[j][i];
                    }
                } catch (ArrayIndexOutOfBoundsException aioe) {
                    average += grid[i][j];
                    average2 += grid[j][i];
                }
            }
            average /= 9;
            average2 /= 9;
            if (average == 5.0 && average2 == 5.0) {
                rowCount++;
                colCount++;
                average = 0;
                average2 = 0;

            }
        }


        if (count3x3 == 9 && rowCount == 9 && colCount == 9) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {

        int[][] tablica =
                {{1, 3, 2, 5, 4, 6, 9, 8, 7},
                        {4, 6, 5, 8, 7, 9, 3, 2, 1},
                        {7, 9, 8, 2, 1, 3, 6, 5, 4},
                        {9, 2, 1, 4, 3, 5, 8, 7, 6},
                        {3, 5, 4, 7, 6, 8, 2, 1, 9},
                        {6, 8, 7, 1, 9, 2, 5, 4, 3},
                        {5, 7, 6, 9, 8, 1, 4, 3, 2},
                        {2, 4, 3, 6, 5, 7, 1, 9, 8},
                        {8, 1, 9, 3, 2, 4, 7, 6, 5}};

        System.out.println(sudoku(tablica));
    }
}



