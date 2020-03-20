//Problem Statement: 
Task-
Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.
Input Format-
There are 3 lines of numeric input:
The first line has a double,mealCost(the cost of the meal before tax and tip).
The second line has an integer,tipPercent(the percentage of mealCost being added as tip).
The third line has an integer,taxPercent(the percentage of mealCost being added as tax).
Output Format-
Print the total meal cost, where totalCost is the rounded integer result of the entire bill (mealCost with added tax and tip)
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

    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost*tip_percent/100;
        double tax = meal_cost*tax_percent/100;
        double totalCost = meal_cost + tip + tax;
        int value =(int)Math.round(totalCost);		//rounding off the total value and typecasting into integer value
        System.out.println(value);

    }

    private static final Scanner scanner = new Scanner(System.in);	//use Scanner class to get user input

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
         
        int tip_percent = scanner.nextInt();

        int tax_percent = scanner.nextInt();

        solve(meal_cost, tip_percent, tax_percent);	//calling method 'solve'

        scanner.close();
    }
}
