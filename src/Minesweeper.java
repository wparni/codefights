import java.util.Arrays;

/**
 * Created by Arni on 2017-07-15.
 */
public class Minesweeper {

    static int[][] minesweeper(boolean[][] matrix) {
        int[][] tablica = new int[matrix.length][matrix[0].length];
        int wynik = 0;

        boolean[][] matrix2 = new boolean[matrix.length + 2][matrix[0].length + 2];

        int secondIndex = 0;
        int firstIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix2[i + 1][j + 1] = matrix[i][j];

            }
        }

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                if (i + 1 < matrix2.length && j + 1 < matrix2[0].length && i - 1 >= 0 && j - 1 >= 0) {
                    System.out.println(matrix2[i][j]);
                    for (int k = i - 1; k < i + 2; k++) {
                        for (int l = j - 1; l < j + 2; l++) {
                            if (matrix2[k][l]) {
                                wynik++;

                            }
                        }
                    }
                    if(matrix2[i][j]){
                        wynik--;
                    }
                    tablica[secondIndex][firstIndex] = wynik;
                    if (firstIndex != tablica[0].length - 1) {
                        firstIndex++;
                    } else {
                        firstIndex = 0;
                        secondIndex++;
                    }

                    wynik = 0;
                }
            }
        }


        return tablica;
    }

    public static void main(String[] args) {
        int[][] tab = new int[][]{{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        boolean[][] matrix = {{true, false, false}, {false, true, false}, {false, false, false}};


        System.out.println(Arrays.deepToString(minesweeper(matrix)));

    }
}
