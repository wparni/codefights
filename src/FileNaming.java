/**
 * You are given an array of desired filenames in the order of their creation.
 * Since two files cannot have equal names, the one which comes later will have an addition to its name in a form of (k),
 * where k is the smallest positive integer such that the obtained name is not used yet.
 * Return an array of names that will be given to the files.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class FileNaming {


    static String[] fileNaming(String[] names) {

        int k;
        ArrayList<String> checkArray = new ArrayList<>();
        for (String s : names) {
            k = 1;
            for (int i = 0; i < checkArray.size(); i++) {
                if (checkArray.get(i).equals(s)) {
                    if (!checkArray.contains(s + "(" + k + ")")) {
                        checkArray.add(s + "(" + k + ")");
                        k++;
                        break;
                    } else {
                        while (true) {
                            k++;
                            if (!checkArray.contains(s + "(" + k + ")")) {
                                checkArray.add(s + "(" + k + ")");
                                break;
                            }
                        }
                    }
                }
            }
            if (k == 1) {
                checkArray.add(s);
            }
        }
        String[] newNames = new String[checkArray.size()];
        for (int i = 0; i < checkArray.size(); i++) {
            newNames[i] = checkArray.get(i);
        }
        return newNames;
    }


    public static void main(String[] args) {

        String[] test = {"doc", "doc", "image", "doc(1)", "doc"};


        System.out.println(Arrays.toString(fileNaming(test)));
    }
}
