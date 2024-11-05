package hazhel_tr;
import java.util.Scanner;
public class Grade_in_Switch {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int score;
	char grade;
	for(;;) {
	System.out.print("Enter your grade:");
	score = input.nextInt();
	
	switch (score / 10) {
    case 10: // scores 100
    case 9: // scores 90-99
        grade = 'A';
    case 8:
        grade = 'B';
    case 7:
        grade = 'C';
    case 6:
        grade = 'D';
    case 5: // scores 50-59
    case 4: // scores 40-49
    case 3: // scores 30-39
    case 2: // scores 20-29
    case 1: // scores 10-19
    case 0: // scores 0-9
    	grade = 'F';
        break;
    default:
        System.out.println("grabe ka na teeh");
        System.out.println("System error");

        return; // Exit if the score is invalid
}

System.out.println("Your grade is : " + grade);

	
	}
	}

}
