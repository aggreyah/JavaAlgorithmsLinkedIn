package com.aggreyah.euclidandbubblesort;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(EuclidAndBubbleSort.euclidGCD(270, 192));
        int [] ints = {4, 2, 1, 0, 7, 5};
        EuclidAndBubbleSort.bubbleSort(ints);
        for (int item: ints)
            System.out.println(item);
    }
}
