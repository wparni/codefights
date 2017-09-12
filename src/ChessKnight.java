/**
 * Given a position of a knight on the standard chessboard, find the number of different moves the knight can perform.
 * The knight can move to a square that is two squares horizontally and one square vertically,
 * or two squares vertically and one square horizontally away from it.
 * The complete move therefore looks like the letter L.
 * Check out the image below to see all valid moves for a knight piece that is placed on one of the central squares.
 */

public class ChessKnight {

    static int chessKnight(String cell) {

        int jump = 0;
        int move1 = 2;
        int move2 = 1;
        char[] array = cell.toCharArray();

        if (array[0] + move1 >= 97 && array[0] + move1 < 105 && array[1] + move2 >= 49 && array[1] + move2 < 57) {
            jump++;
        }
        if (array[0] + move1 >= 97 && array[0] + move1 < 105 && array[1] - move2 >= 49 && array[1] - move2 < 57) {
            jump++;
        }
        if (array[0] + move2 >= 97 && array[0] + move2 < 105 && array[1] + move1 >= 49 && array[1] + move1 < 57) {
            jump++;
        }
        if (array[0] + move2 >= 97 && array[0] + move2 < 105 && array[1] - move1 >= 49 && array[1] - move1 < 57) {
            jump++;
        }
        if (array[0] - move1 >= 97 && array[0] - move1 < 105 && array[1] + move2 >= 49 && array[1] + move2 < 57) {
            jump++;
        }
        if (array[0] - move1 >= 97 && array[0] - move1 < 105 && array[1] - move2 >= 49 && array[1] - move2 < 57) {
            jump++;
        }
        if (array[0] - move2 >= 97 && array[0] - move2 < 105 && array[1] + move1 >= 49 && array[1] + move1 < 57) {
            jump++;
        }
        if (array[0] - move2 >= 97 && array[0] - move2 < 105 && array[1] - move1 >= 49 && array[1] - move1 < 57) {
            jump++;
        }

        return jump;
    }


    public static void main(String[] args) {

        String cell = "c2";

        System.out.println(chessKnight(cell));
    }
}
