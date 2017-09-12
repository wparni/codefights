
/**
 * Given an integer product, find the smallest positive (i.e. greater than 0) integer the product of whose digits is equal to product. If there is no such integer, return -1 instead.
 */

import java.util.ArrayList;

public class DigitsProduct {

    static int digitsProduct(int product) {

        ArrayList<String> second = new ArrayList<>();
        ArrayList<Integer> divisors = new ArrayList<>();

        for (int i = 2; i <= product; i++) {
            if (product % i == 0 && i < 10) {
                divisors.add(i);
            }
        }
        if (product == 1) {
            return 1;
        }
        if (divisors.size() == 0 && product != 0) {
            return -1;
        }
        if (product == 0) {
            return 10;
        }

        String laczenie = "";
        int result = product;
        for (int j = divisors.size() - 1; j >= 0; j--) {
            if (result % divisors.get(j) == 0) {
                laczenie += divisors.get(j);
                result = result / divisors.get(j);
                j = divisors.size();
            }
        }
        if (result != 1) {
            return -1;
        }


        System.out.println(divisors);
        System.out.println(second);

        return Integer.valueOf(String.valueOf(new StringBuilder(laczenie).reverse()));
    }

    public static void main(String[] args) {

        int product = 1;
        System.out.println(digitsProduct(product));

    }
}
