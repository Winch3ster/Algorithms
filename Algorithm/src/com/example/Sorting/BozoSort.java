package com.example.Sorting;

public class BozoSort {

    //Time complexity: infinite
    //Best TC: O(n) --> swap 1 time and the array is sorted.
    // Hence, O(n) = time taken to check if array is sorted
    //Average TC: n*n!
    public static void bozoSort(int[] array){
        if(array.length < 1){
            return;
        }

        boolean sorted = false;

        while(!sorted){

            //Select 2 random index
            int index1 = (int) (Math.random() * array.length);
            int index2 = (int) (Math.random() * array.length);

            //swap the values at that indexes
            int temp = array[index2];
            array[index2] = array[index1];
            array[index1] = temp;

            //Always assume that after each swap, the array is sorted
            sorted = true;

            //Check if the array is sorted
            for(int i = 1; i < array.length; i++){
                if(array[i-1] > array[i]){
                    sorted = false;
                    break;
                }
            }
        }
    }
}
