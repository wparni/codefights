import java.util.*;

/**
 Given a sorted array of integers a, find an integer x from a such that the value of
 abs(a[0] - x) + abs(a[1] - x) + ... + abs(a[a.length - 1] - x)
 is the smallest possible (here abs denotes the absolute value).
 If there are several possible answers, output the smallest one.
 */
public class AbsoluteValuesSumMinimization {

    static int absoluteValuesSumMinimization(int[] a) {

        int[] z = new int[a.length];
        int x = 0;
        int key = 0;
        ArrayList newArray = new ArrayList();

        Map<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                x += Math.abs(a[j] - a[i]);
            }
            map.put(a[i], x);
            z[i] = x;
            x = 0;
        }

        for (int i = 0; i < z.length; i++) {
            for (int j = 1; j < z.length - 1; j++) {
                if (z[j - 1] > z[j]) {
                    int temp = z[j - 1];
                    z[j - 1] = z[j];
                    z[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(z));

        int minimum = Collections.min(map.values());
        for (Map.Entry<Integer, Integer> c : map.entrySet()) {
            if (c.getValue() == minimum) {
                key = c.getKey();
                newArray.add(key);
            }
        }

        return (int) newArray.get(0);
    }


    public static void main(String[] args) {


        int[] a = {1, 1, 3, 4};

        System.out.println(absoluteValuesSumMinimization(a));

    }
}
