/**
 Correct variable names consist only of Latin letters, digits and underscores and they can't start with a digit.
 Check if the given string is a correct variable name.
 */
public class VariableName {


    static boolean variableName(String name) {

        for (int i = 0; i < name.length(); i++) {
            if (!('a' <= name.charAt(i) && name.charAt(i) <= 'z' ||
                    'A' <= name.charAt(i) && name.charAt(i) <= 'Z' ||
                    '0' <= name.charAt(i) && name.charAt(i) <= '9' ||
                    name.charAt(i) == '_')) {
                return false;
            }
        }

        if ('0' <= name.charAt(0) && name.charAt(0) <= '9') {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        String toCheck = "qvar_1__Int";

        System.out.println(variableName(toCheck));

    }
}
