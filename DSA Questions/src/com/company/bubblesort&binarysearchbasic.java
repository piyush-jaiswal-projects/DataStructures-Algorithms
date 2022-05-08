package com.company;
import java.lang.reflect.Array;
import java.util.*;
//Question: Given an array, arr=[88,66,55,44,22]. Use bubble sort to arrange them in ascending order and then perform binary search to find index of item 44

public class bubblesort&binarysearchbasic{

public static void main(String[]args){
    int[] arr = [88,66,55,44,22];
    for(int counter=0; counter<arr.length-1; counter++){
        for(int j = counter+1; j<arr.length-1; j++){
            if(arr[j] < arr[counter]){
                int temp = arr[j];
                arr[j] = arr[counter];
                arr[counter] = temp;
        }
        }
        }
    System.out.println(Arrays.toString(arr));

        }
}