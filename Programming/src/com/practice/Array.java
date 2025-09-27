package com.practice;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int i = sc.nextInt();  // Input the size of the array
        int[] arr = new int[i];  // Create the array
        
        // Read values from the user and store them in the array
        System.out.println("enter the values of s");
        for (int j = 0; j < i; j++) {
            arr[j] = sc.nextInt();  // Store user input in the array
        }

        // Print the array
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
