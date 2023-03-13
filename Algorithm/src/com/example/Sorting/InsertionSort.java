package com.example.Sorting;

public class InsertionSort {

    //Time complexity: O(n^2)
    public static void insertionSort(int[] array){
        //If the size of the array is smaller than 2, return
        if(array.length < 2){
            return;
        }

        for(int i = 1; i < array.length; i++){
            int current = array[i];

            //Traverse through all preceding elements of the current element
            int j = i - 1;//Start from element next to current element (to the left)
            while(j >=0 && array[j] > current){
                //if the element is larger than the current element, shift it to the right
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }
}
