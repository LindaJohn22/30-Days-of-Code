//Problem Statement: The variables i,d and s are already declared and initialized for you. You must:
1.Declare 3 variables: one of type int, one of type double, and one of type String.
2.Read 3 lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your  variables.
3.Use the + operator to perform the following operations:
	1.Print the sum of i plus your int variable on a new line.
	2.Print the sum of d plus your double variable to a scale of one decimal place on a new line.
	3.Concatenate s with the string you read as input and print the result on a new line.
//Language Used: Java
//------------------------------------------------------------------------------

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;	//integer variable initialized
        double d = 4.0;		//double variable initialized
        String s = "HackerRank ";	//string variable initialized
		
        Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();		//taking user input for integer
	double l = scan.nextDouble();	//taking user input for double
  	scan.nextLine();		//if this line not written then scan for string will be done for the blank space
  	String w = scan.nextLine();	//taking user input for string
  	System.out.println(n+i);	//printing addition
  	System.out.println(l+d);
  	System.out.println(s+""+w);	//strings concatenated and printed
	scan.close();
	}
}