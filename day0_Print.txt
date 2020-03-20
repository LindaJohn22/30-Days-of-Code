//Problem Statement:you must save a line of input from stdin to a variable, print Hello, World. on a single line, and finally print the value of your variable on a second line.
//Language Used: Java
//------------------------------------------------------------------------------

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		String inputString = scan.nextLine();  //taking input from user
		scan.close(); 
		System.out.println("Hello, World.");   
		System.out.println(inputString);       //printing user input
	}
}

