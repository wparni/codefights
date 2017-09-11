
/**
 * Given the positions of a white bishop and a black pawn on the standard chess board, determine whether the bishop can capture the pawn in one move.
 * The bishop has no restrictions in distance for each move, but is limited to diagonal movement. Check out the example below to see how it can move:
 */

public class BishopAndPawn {


    static boolean bishopAndPawn(String bishop, String pawn) {


        int z = bishop.charAt(0) + bishop.charAt(1);
        int x = pawn.charAt(0) + pawn.charAt(1);


        if (z % 2 == 0 && x % 2 == 0) {
            return true;
        } else if (bishop.charAt(0) == pawn.charAt(0)) {
            return false;
        } else if (z % 2 == 1 && x % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {


        String first = "H1";
        String second = "H3";


        System.out.println(bishopAndPawn(first, second));
    }
}
