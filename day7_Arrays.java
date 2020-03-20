//Problem Statement: Given an array,A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.
//Language Used: Java
//------------------------------------------------------------------------------

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();	//number of test cases

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");	//split the user input integer values which is scanned and store into the array 'arrItems'

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);	//convert the string stored in the array 'arrItems' to integer
            arr[i] = arrItem;		//store integer into the array 'arr'
        }
        for (int i = n-1; i >=0; i--) {
            System.out.print(arr[i]+" ");	//print the values in the array
        }

        scanner.close();
    }
}
