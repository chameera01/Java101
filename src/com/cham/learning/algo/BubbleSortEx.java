package com.cham.learning.algo;

import java.util.Arrays;

public class BubbleSortEx {

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        System.out.println(Arrays.toString(array));

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    // Swap elements if they are in the wrong order
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);

        System.out.println(Arrays.toString(array));
    }

    public static int[] recursiveBubbleSort(int[] arr, int n) {

        boolean swap = false;

        for(int i=1; i<n; i++) {

            if(arr[i-1] > arr[i]) {
                int tmp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = tmp;
                swap = true;
            }
        }

        if(swap) {
            recursiveBubbleSort(arr, n-1);
        }

        return arr;
    }
}
