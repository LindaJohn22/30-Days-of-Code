//Problem Statement: Given a string,S, of length N that is indexed from 0 to N-1, print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line.
//Language Used: Java
//------------------------------------------------------------------------------

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();		//number of test cases
        String[] arr = new String[T];
        for(int i=0;i<T;i++)
        {
            arr[i] = sc.next();		//scan strings as user input
        }
        for(int i=0;i<T;i++){		//segregating each string in the array
            String str = arr[i];
            int l = str.length();
            for(int j=0;j<l;j++){ 	//printing characters as even indices
                if(j%2==0){
                    char c = str.charAt(j);
                    System.out.print(c);
                }
            }
            System.out.print(" ");
            for(int j=0;j<l;j++){	//printing characters at odd indices
                if(j%2!=0){
                    char c = str.charAt(j);
                    System.out.print(c);
                }
            }
            System.out.println(" ");
        }
    }
}
