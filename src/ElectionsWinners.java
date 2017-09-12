
/**
 * Elections are in progress!
 * Given an array of the numbers of votes given to each of the candidates so far,
 * and an integer k equal to the number of voters who haven't cast their vote yet,
 * find the number of candidates who still have a chance to win the election.
 * The winner of the election must secure strictly more votes than any other candidate.
 * If two or more candidates receive the same (maximum) number of votes, assume there is no winner at all.
 */

public class ElectionsWinners {

    static int electionsWinners(int[] votes, int k) {

        int equal = 0;
        int winPossible = 0;
        int max = votes[0];
        for (int i = 0; i < votes.length; i++) {
            if (votes[i] > max) {
                max = votes[i];
            }
        }

        for (int i = 0; i < votes.length; i++) {
            if (votes[i] + k > max && k != 0) {
                winPossible++;
            } else if (k == 0 && votes[i] == max) {
                equal++;
            } else if (equal >= 2) {
                winPossible = 0;
            } else if (k == 0) {
                winPossible = 1;
            }
        }

        return winPossible;
    }

    public static void main(String[] args) {

        int[] array = {2, 3, 5, 2};
        int k = 3;

        System.out.println(electionsWinners(array, k));
    }
}
