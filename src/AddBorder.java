import java.util.Arrays;

/**
 Given a rectangular matrix of characters, add a border of asterisks(*) to it.
 */
public class AddBorder {

    String[] addBorder(String[] a) {

        String[] newArray = new String[a.length + 2];

        for (int i = 0; i < a.length; i++) {
            newArray[i + 1] = "*" + a[i] + "*";
        }

        String message = "";

        for (int i = 0; i < newArray[1].length(); i++) {
            message += "*";
        }

        newArray[0] = message;
        newArray[newArray.length - 1] = message;
        return newArray;
    }
}