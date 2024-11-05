// Hazhel CJ B. Matingyad
//CITCS 1N (A)
//Sep 19, 2024
package hazhel_tr;
import java.util.Scanner;
public interface Grade {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in); 
		int grade;
		
		for(;;) { // a loop for it will ask nonstop
		System.out.print("Enter your exam score: ");
		grade = input.nextInt();
		
		
		if (grade >= 90 && grade <= 100) {
			System.out.println("Your grade is: A");
		}
		else if (grade >= 80 && grade <= 89) {
			System.out.println("Your grade is: B");
		}
		else if (grade >= 70 && grade <= 79) {
			System.out.println("Your grade is: C");
		}
		else if (grade >= 60 && grade <= 69) {
			System.out.println("Your grade is: D");
		}
		else if (grade >= 0 && grade <= 60) {
			System.out.println("Your grade is: F");
		}
		}
		
	}

}
