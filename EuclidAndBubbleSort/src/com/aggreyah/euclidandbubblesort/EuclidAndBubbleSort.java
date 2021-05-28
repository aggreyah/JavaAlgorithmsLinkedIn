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

    public int[] bubbleSort(int[] ints) {
        for (int i = 0; i < ints.length - 1; i++){
            int sorted = ints.length - i;
            while(i != sorted){
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
