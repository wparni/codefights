/**
 Consider integer numbers from 0 to n - 1 written down along the circle in such a way that the distance between any two neighbouring numbers is equal (note that 0 and n - 1 are neighbouring, too).
 Given n and firstNumber, find the number which is written in the radially opposite position to firstNumber.
 */
public class CircleOfNumbers {

    static int circleOfNumbers(int n, int firstNumber) {


        int result = n / 2 + firstNumber;
        if (result > n) {
            result = result-n;
        }
        return result;
    }


    public static void main(String[] args) {
        int n = 10;
        int firstNumber = 7;

        System.out.println(circleOfNumbers(n, firstNumber));
    }
}
