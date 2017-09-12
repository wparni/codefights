/**Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.*/

public class AdjacentElementsProduc {

    int adjacentElementsProduct(int[] inputArray) {

        int max = inputArray[0]*inputArray[1];

        for (int i = 0; i < inputArray.length-1; i++){
            if(inputArray[i]*inputArray[i+1]>max)
                max = inputArray[i]*inputArray[i+1];
        }
        return max;
    }
}
