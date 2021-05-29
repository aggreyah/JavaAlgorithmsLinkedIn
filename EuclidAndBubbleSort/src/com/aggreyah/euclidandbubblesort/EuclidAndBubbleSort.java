package com.aggreyah.euclidandbubblesort;

public class EuclidAndBubbleSort {
    public static int euclidGCD(int firstNum, int secondNum){
        if (firstNum == 0)
            return secondNum;
        else if (secondNum == 0)
            return firstNum;
        else
            return euclidGCD(secondNum, firstNum % secondNum);
    }

    public static int[] bubbleSort(int[] ints) {
        for (int j = ints.length - 1; j >= 0; j--){
            for (int i = 0; i < j; i++){
                if (ints[i] > ints[i + 1]){
                    int temp = ints[i + 1];
                    ints[i + 1] = ints[i];
                    ints[i] = temp;
                }
            }
        }
        return ints;
    }
}
