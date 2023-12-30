
import com.cham.learning.algo.*;
import com.cham.learning.datastructures.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Learn & Practise Java Basics..!");
        System.out.println();

//        ArrayListEx.tryArrayList();
//        HashMapEx.tryHashMap();
//        HashSetEx.tryHashSet();
//        BubbleSortEx.bubbleSort(new int[]{7,1,3,5,4,6});

//        int[] arr = BubbleSortEx.recursiveBubbleSort(new int[]{7,6,3,5,4,1}, 6);
        int[] arr = BubbleSortEx.recursiveBubbleSort(new int[]{2,1}, 2);
        System.out.println(Arrays.toString(arr));

        int position = BinarySearchEx.binarySearch(arr, 2);
        System.out.println(position);

    }
}