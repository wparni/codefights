/**
 * Ratiorg got statues of different sizes as a present from CodeMaster for his birthday,
 * each statue having an non-negative integer size.
 * Since he likes to make things perfect, he wants to arrange them from smallest to largest so that each statue will be bigger than the previous one exactly by 1.
 * He may need some additional statues to be able to accomplish that. Help him figure out the minimum number of additional statues needed.
 */


public class MakeArrayConsecutive2 {

    int makeArrayConsecutive2(int[] statues) {
        int max = statues[0];
        int min = statues[0];
        for (int i = 0; i < statues.length; i++) {
            if (statues[i] > max)
                max = statues[i];
            else if (statues[i] < min)
                min = statues[i];

        }
        return (max - min) - statues.length + 1;
    }

}
