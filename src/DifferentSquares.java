import java.util.HashSet;
import java.util.Set;

/**
 * Given a rectangular matrix containing only digits, calculate the number of different 2 × 2 squares in it.
 */

public class DifferentSquares {


    static int differentSquares(int[][] matrix) {

        String sum = "";
        Set set = new HashSet<>();

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                for (int i = row; i < row + 2; i++) {
                    for (int j = col; j < col + 2; j++) {
                        sum += matrix[i][j];
                    }
                }
                set.add(sum);
                sum = "";
            }
        }

        System.out.println(set);

        return set.size();
    }

    public static void main(String[] args) {


        int[][] tablica = {{1, 2, 1},
                {2, 2, 2},
                {2, 2, 2},
                {1, 2, 3},
                {2, 2, 1}};

        System.out.println(differentSquares(tablica));
    }

}
