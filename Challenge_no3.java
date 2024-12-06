/*
 * HAZHEL CJ B. MATINGYAD
 * CITCS 1N-A
 * 11/21/2024
 */
package hazhel_tr;
import java.util.Scanner;
public class Challenge_no3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//one dimensional array to store the students name
		String [] student_names = new String[5];
		
		//two dimensional array to store the grades of the student
		double[][] grades = new double [5][3];
		
		//names of the subject
		String [] subjects = {"CC2", "CC7", "CC1"};

		double [] average = new double [5];
		
		//input student name
		for (int i = 0; i < student_names.length; i++) {
			System.out.print("Enter the name of your student " + (i + 1) + ":");
			student_names[i] = input.next();
		}
		
		System.out.println();
		
		System.out.println("Enter the grades of each student in their 3 subjects");
		
		System.out.println();
		
		for (int i = 0; i < student_names.length; i++) {
			System.out.println("Enter the grades of " + student_names[i] + ":");
			for(int j = 0; j < 3; j++) {
				//input students grade
				System.out.print("Enter grade for subject " + subjects[j] + ":");
				grades[i][j] = input.nextDouble();
			}
		}
		
		
		//calculate the average of each student
		for (int i = 0; i < student_names.length; i++) {
            double total = 0;
            for (int j = 0; j < 3; j++) {
                total += grades[i][j];
            }
            average[i] = total / 3.0;
            
            System.out.println();
            
            System.out.println("Student Average grades ");
            
            //display each students name along with their average
            System.out.println(student_names[i]+ ": " + average[i]);
		}
		
		input.close();
		
	  
            
		
		
		

	}

}
