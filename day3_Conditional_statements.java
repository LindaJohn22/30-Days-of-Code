/* //Problem statement: Given an integer,n, perform the following conditional actions:
If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
//Language used: Java
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
        int N = scanner.nextInt();
        if(N%2!=0){		//if condition satisfied then print 'weird'
            System.out.println("Weird");
        }
        else{			//else execute below code

            if(((2<=N)&&(N<=5))||(N>20)){	//if condition satisfied then print 'not weird'
                System.out.println("Not Weird");
            }
            else if((6<=N)&&(N<=20)){		//else if condition this satisfied then print 'weird'
                System.out.println("Weird");
            }
        }

        scanner.close();
    }
}

OUTPUT:
Input (stdin)
3
Expected Output
Weird
