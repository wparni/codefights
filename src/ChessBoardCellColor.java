
/**
 Given two cells on the standard chess board, determine whether they have the same color or not.
 */
public class ChessBoardCellColor {


    static boolean chessBoardCellColor(String cell1, String cell2) {
        char[] string1 = cell1.toCharArray();
        char[] string2 = cell2.toCharArray();

        int cell1first = Character.getNumericValue(string1[0]);
        int cell2first = Character.getNumericValue(string2[0]);
        int cell1second = Character.getNumericValue(string1[1]);
        int cell2second = Character.getNumericValue(string2[1]);

        int firstdiff = Math.abs(cell1first - cell2first);
        int seconddiff = Math.abs(cell1second - cell2second);


        if (firstdiff % 2 == 1) {
            if (seconddiff % 2 == 1) {
                return true;
            }
            return false;
        } else if (seconddiff % 2 == 1) {
            return false;
        }
        return true;

    }
}
