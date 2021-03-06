
/**Some people are standing in a row in a park.
 There are trees between them which cannot be moved.
 Your task is to rearrange the people by their heights in a non-descending order without moving the trees.*/

public class sortByHeight {

    static int[] sortByHeight(int[] a) {

        int[] sortedArray = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            if (a[i] == -1) {
                sortedArray[i] = a[i];
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int change;
                if (a[i] > a[j]) {
                    change = a[i];
                    a[i] = a[j];
                    a[j] = change;
                }
            }
        }


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < sortedArray.length; j++) {
                if (sortedArray[j] == 0 && a[i] > 0) {
                    sortedArray[j] = a[i];
                    break;
                }
            }
        }


        return sortedArray;
    }
}
