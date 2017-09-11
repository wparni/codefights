import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Arni on 2017-07-Find the leftmost digit that occurs in a given string.
 */
public class DifferentSymbolsNaive {

    static int differentSymbolsNaive(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            map.put(s.charAt(i), 1);
        }
        return map.size();
    }

    public static void main(String[] args) {


        String z = "cabca";

        System.out.println(differentSymbolsNaive(z));
    }
}
