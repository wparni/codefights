import java.util.Arrays;

/**
 You are given an array of integers representing coordinates of obstacles situated on a straight line.
 Assume that you are jumping from the point with coordinate 0 to the right.
 You are allowed only to make jumps of the same length represented by some integer.
 Find the minimal length of the jump enough to avoid all the obstacles.
 */
public class AvoidObstacles {

    static int avoidObstacles(int[] inputArray) {

        int smallestJump = 2;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % smallestJump != 0) {
                continue;
            } else {
                i = -1;
                smallestJump++;

            }
        }
        return smallestJump;
    }

    public static void main(String[] args) {

        int[] tablica = {5, 3, 6, 7, 9};

        System.out.println(avoidObstacles(tablica));

    }
}
