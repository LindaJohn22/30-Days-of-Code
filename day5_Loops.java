/* //Problem Statement: Given an integer,n, print its first 10 multiples. Each multiple n x i (where 1<=i<=10) should be printed on a new line in the form: n x i = result.
//Language Used: Java
//------------------------------------------------------------------------------ */

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
        int n = scanner.nextInt();
         int pdt;
        for(int i=1;i<=10;i++){		//printing multiple of n in the given format
            pdt = n*i;
            System.out.println(n+" x "+i+" = "+pdt);	//concatenate integer to string and print
        }

        scanner.close();
    }
}
