/**
 You found two items in a treasure chest!
 The first item weighs weight1 and is worth value1, and the second item weighs weight2 and is worth value2.
 What is the total maximum value of the items you can take with you, assuming that your max weight capacity is maxW and you can't come back for the items later?
 Note that there are only two items and you can't bring more than one item of each type, i.e. you can't take two first items or two second items.
 */
public class KnapsackLight {


    static int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {

        int value = 0;

        if (maxW >= (weight1 + weight2)) {
            value = value1 + value2;
        } else if (maxW < (weight1 + weight2)) {
            if (maxW >= weight1 && maxW >= weight2) {
                value = maxValue(value1, value2);
            }else if(maxW == weight1){
                value = value1;
            }else if(maxW == weight2){
                value = value2;
            }
        }
        return value;
    }

    static private int maxValue(int value1, int value2) {
        if (value1 >= value2) {
            return value1;
        } else {
            return value2;
        }
    }


    public static void main(String[] args) {
        int value1 = 15;
        int weight1 = 2;
        int value2 = 20;
        int weight2 = 3;
        int maxW = 2;

        System.out.println(knapsackLight(value1, weight1, value2, weight2, maxW));

    }
}
