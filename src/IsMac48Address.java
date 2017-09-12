
/**A media access control address (MAC address) is a unique identifier assigned to network interfaces for communications on the physical network segment.
 The standard (IEEE 802) format for printing MAC-48 addresses in human-friendly form is six groups of two hexadecimal digits (0 to 9 or A to F),
 separated by hyphens (e.g. 01-23-45-67-89-AB).
 Your task is to check by given string inputString whether it corresponds to MAC-48 address or not.*/

public class IsMac48Address {

    static boolean isMAC48Address(String inputString) {


        String[] tablica = inputString.split("-");

        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i].length() != 2) {
                return false;
            }
        }

        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if ((int) inputString.charAt(i) >= 48 && (int) inputString.charAt(i) <= 57
                    || (int) inputString.charAt(i) >= 65 && (int) inputString.charAt(i) <= 70
                    || (int) inputString.charAt(i) == 45) {
                count++;
            }
        }
        if (count == inputString.length() && inputString.charAt(inputString.length() - 1) != '-' && inputString.charAt(0) != '-') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        String macAdress = "00-1B-63-84-45-E6";
        System.out.println(isMAC48Address(macAdress));
    }
}
