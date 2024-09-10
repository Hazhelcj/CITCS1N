package hazhel_tr;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // call the scanner
		int number;     
		String animal;
		boolean choice;      //variables
		char letter;
		float grade;              
		
		// below are the questions for the user to answer that will soon be shown
		System.out.print("Please enter your favorite number: "); 
		number = scan.nextInt();
		
		System.out.print("Please enter your favorite animal: ");
		animal = scan.next();
		
		System.out.print("Choose between True or False: ");
		choice = scan.nextBoolean();
		
		System.out.print("Please enter your crush first letter: ");
		letter = scan.next().charAt(0);
		
		System.out.print("Please enter your highest grade: ");
        grade = scan.nextFloat();
        
        System.out.println("____________________________"); //design
        
        //below for the program to show the given inputs of the user from the above questions
        
        System.out.println("Your favorite number is " + number);
        System.out.println("Your favorite animal is " + animal);
        System.out.println("Your choice is " + choice);
        System.out.println("Your crush first letter is " + letter);
        System.out.println("Your highest grade is " + grade);


	}

}
