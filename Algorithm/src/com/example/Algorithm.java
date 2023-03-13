package com.example;

import com.example.Sorting.BozoSort;
import com.example.Sorting.InsertionSort;


public class Algorithm {
    public static void main(String[] args) {
        int[] numbers = {1, 9, 2, 3, 7, 2, 5};

        long start = System.nanoTime();

        //InsertionSort.insertionSort(numbers);
        //BozoSort.bozoSort(numbers);

        long end = System.nanoTime();

        long elapsedTime = end - start;

        PrintArray(numbers);

        //1 second = 1 * 10 ^ 9 nanosecond or 1 billion nanosecond  = 1 second
        System.out.print("Elapsed time: " +elapsedTime);

    }

    public static void PrintArray(int[] arr){
        System.out.print("Sorted array: ");
        for (int x : arr) {
            System.out.print(x + ", ");
        }
        System.out.println();
    }

}
