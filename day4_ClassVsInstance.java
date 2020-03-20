//Problem Statement: 
Task-
Write a Person class with an instance variable,age, and a constructor that takes an integer,initialAge, as a parameter. The constructor must assign initialAge to age after confirming the argument passed as initialAge is not negative; if a negative argument is passed as initialAge, the constructor should set age to 0 and print Age is not valid, setting age to 0.. In addition, you must write the following instance methods:
1.yearPasses() should increase the  instance variable by 1.
2.amIOld() should perform the following conditional actions:
	*If age<13, print You are young..
	*If age>=13 and age<18, print You are a teenager..
	*Otherwise, print You are old..
Once the initialAge is checked, the age should be checked again after 3 years.
//Language Used: Java
//------------------------------------------------------------------------------

import java.io.*;
import java.util.*;

public class Person {
    private int age; 
     
    public Person(int initialAge) {
	//check initialAge, if negative then initialize age to 0, else assign initialAge to age
          if (initialAge >= 0) { 
            age = initialAge;
        } else {
            System.out.println("Age is not valid, setting age to 0.");
            age = 0;
        }
    }

    public void amIOld() {
	//check if the person is old or not 
        String sent_print;
        
          if (age<13){
              sent_print = "You are young.";
          }
          else if (age<18){
              sent_print = "You are a teenager.";
          }
          else{
              sent_print = "You are old.";
          }
        System.out.println(sent_print);
    }

    public void yearPasses() {
        // Increment this person's age.
          age += 1;
          
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();	//number of test cases
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();		//age of a person
			Person p = new Person(age);	//creating instance of Person
			p.amIOld();			//calling method 'amIOld'
			for (int j = 0; j < 3; j++) {	//3 year passes
				p.yearPasses();		
			}
			p.amIOld();			//checking age after 3 years
			System.out.println();
        }
		sc.close();
    }
}

