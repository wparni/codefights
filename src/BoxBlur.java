import java.util.Arrays;

/**
 Last night you had to study, but decided to party instead. Now there is a black and white photo of you that is about to go viral.
 You cannot let this ruin your reputation, so you want to apply box blur algorithm to the photo to hide its content.
 The algorithm works as follows: each pixel x in the resulting image has a value equal to the average value of the input image pixels' values from the 3 × 3 square with the center at x. All pixels at the edges are cropped.
 As pixel's value is an integer, all fractions should be rounded down.
 */
public class BoxBlur {

static int[][] boxBlur(int[][] image) {

        int[][] tab = new int[image.length - 2][image[0].length - 2];
        int index = 0;
        int index2 = 0;
        int wynik = 0;


        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (i + 1 < image.length && j + 1 < image[0].length && i - 1 >= 0 && j - 1 >= 0) {
                    for (int k = i - 1; k < i + 2; k++) {
                        for (int l = j - 1; l < j + 2; l++) {
                            wynik += image[k][l];
                        }
                    }
                    tab[index][index2] = wynik / 9;
                    if (index2 != tab[0].length - 1) {
                        index2++;
                    } else {
                        index2 = 0;
                        index++;
                    }

                    wynik = 0;
                }
            }
        }
        return tab;
    }

    public static void main(String[] args) {


        int[][] tablica3 = {{7, 4, 0, 1}, {5, 6, 2, 2}, {6, 10, 7, 8}, {1, 4, 2, 0}};
        int[][] nowaTablica = {{1, 1, 1}, {1, 7, 1}, {1, 1, 1}};
        int[][] tablica = {{36, 0, 18, 9}, {27, 54, 9, 0}, {81, 63, 72, 45}};


        System.out.println(Arrays.deepToString(boxBlur(tablica3)));

    }
}
