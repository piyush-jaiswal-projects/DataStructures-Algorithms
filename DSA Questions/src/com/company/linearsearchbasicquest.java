package com.company;
import java.lang.reflect.Array;
import java.util.*;
//Question: Take an array as an input and perform linear search to find the required item.

public class linearsearchbasicquest {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        int[] array = inputArray();
        System.out.println("Enter the required item: ");
        int item = scn.nextInt();
        System.out.println("Index of the required item: ");
        for(int i =0; i<array.length; i++) {
            if (array[i] == item) {
                System.out.println(i);
            }
        }
    }

    static int[] inputArray(){
        System.out.println("Enter the length of array: ");
        int length = scn.nextInt();
        int[] arr = new int[length];
        for(int i =0; i<length; i++){
            System.out.println("Enter array item: ");
            arr[i] = scn.nextInt();
        }
        System.out.println("Input array: ");
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
