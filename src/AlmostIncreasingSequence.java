/**
 * Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.
 */

public class AlmostIncreasingSequence {

    boolean almostIncreasingSequence(int[] sequence) {
        int prevValueToMaxValue = Integer.MIN_VALUE;
        int maxVlue = Integer.MIN_VALUE;

        int n = 0;
        for (int i = 0; i < sequence.length; i++) {

            if (sequence[i] <= prevValueToMaxValue || sequence[i] == maxVlue) {
                n++;
            }

            if (i - 1 > -1 && (sequence[i] <= sequence[i - 1])) {
                maxVlue = sequence[i - 1];
                if (i - 2 > -1)
                    prevValueToMaxValue = sequence[i - 2];
                n++;
            }
        }

        if (n == 1 || n == 0) {
            return true;
        }
        return false;
    }
}
