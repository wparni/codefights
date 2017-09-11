
/**
 Given a string, replace each its character by the next one in the English alphabet (z would be replaced by a).
 */
public class AlphabeticShift {


    static String alphabeticShift(String inputString) {

        char[] array = new char[inputString.length()];
        for (int i = 0; i < inputString.length(); i++) {
            array[i] = (char) (inputString.charAt(i) + 1);
            for (int j = 0; j < array.length; j++) {
                if (array[i] >= 123) {
                    array[i] = (char) 97;
                } else if (array[i] <= 96) {
                    array[i] = (char) 122;
                }
            }
        }
        return new String(array);
    }


    public static void main(String[] args) {

        String test = "crazy";
        System.out.println(alphabeticShift(test));
    }
}

