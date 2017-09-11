import java.util.Arrays;

/**
 * Created by Arni on 2017-07-13.
 */
public class IsIPv4Address {
    static boolean isIPv4Address(String inputString) {


        String[] array = inputString.split("\\.");
        int count = 0;

        System.out.println(Arrays.toString(array));

        try {
            for (int i = 0; i < array.length; i++) {
                if ((array[i].length() > 0) && (array[i].length() <= 3) && ((Integer.valueOf(array[i]) >= 0) && (Integer.valueOf(array[i]) <= 255))) {
                    count++;
                } else if
                        (!array[i].matches(".*[a-z].*")) {
                    count--;
                }
            }
        } catch (NumberFormatException nfe) {
            return false;
        }

        if (count == 4) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {

        String address = "1.1.1.1a";
        System.out.println(isIPv4Address(address));

    }
}
