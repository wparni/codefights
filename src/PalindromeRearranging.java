import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find out if its characters can be rearranged to form a palindrome.
 */
public class PalindromeRearranging {

    static boolean palindromeRearranging(String inputString) {

        char[] tablica = inputString.toCharArray();
        Map<Character, Integer> mapa = new HashMap<>();

        int bezPary = 0;
        int licznik = 0;

        for (int i = 0; i < tablica.length; i++) {
            for (int j = 1; j < tablica.length; j++) {
                if (tablica[j - 1] > tablica[j]) {
                    char temp = tablica[j];
                    tablica[j] = tablica[j - 1];
                    tablica[j - 1] = temp;
                }
            }
        }

        System.out.println("1" + Arrays.toString(tablica));


        System.out.println(licznik);
        String posortowany = new String(tablica);

        String nowy = "";

        for (int i = 0; i < posortowany.length(); i += 2) {
            nowy += posortowany.charAt(i);
        }

        for (int i = 0; i < tablica.length; i++) {
            if (mapa.containsKey(tablica[i])) {
                mapa.put(tablica[i], mapa.get(tablica[i]) + 1);
            } else {
                mapa.put(tablica[i], 1);
            }
        }


        for (Map.Entry<Character, Integer> map : mapa.entrySet()) {
            if (map.getValue() % 2 != 0) {
                bezPary++;
            }
        }

        System.out.println(bezPary);
        for (int i = posortowany.length() - 1; i >= 1; i -= 2) {
            if (posortowany.length() % 2 != 0) {
                nowy += posortowany.charAt(i - 1);
            } else {
                nowy += posortowany.charAt(i);
            }
        }

        System.out.println("2" + nowy);
        String odwroconyPalindrom = "";
        for (int i = nowy.length() - 1; i >= 0; i--) {
            odwroconyPalindrom += nowy.charAt(i);
        }

        System.out.println("3" + odwroconyPalindrom);

        if (nowy.equals(odwroconyPalindrom) || bezPary <= 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {


        String doSprawdzenia = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaccccbbb";

        System.out.println(palindromeRearranging(doSprawdzenia));

    }
}
