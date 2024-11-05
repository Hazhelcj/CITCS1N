/*HAZHEL CJ B MATINGYAD
CITCS 1N(A)*/
package hazhel_tr;
import java.util.Scanner;
public class Classroom_Attendance_System {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total_of_students, absent = 0, present = 0;
		String input;
		
		//Input of the number of students
		System.out.print("Enter the total number of students: ");
		total_of_students = scan.nextInt();		
		
		
		for (int i = 1; i <= total_of_students; i++ ) {
			
			//ask the user if the student is present or absent
			System.out.print("Is student " + i + " present? (Y/N): ");
			input = scan.next().toUpperCase();
			
			//to count the number of present and absent
			if (input.equals("Y")) {				
				present++;
			}
			else {
				absent++;
			}
			
		}
		
		//Shows the result
		System.out.println("Total present: " + present);
		System.out.println("Total absent: " + absent);
		
		
	}

}
