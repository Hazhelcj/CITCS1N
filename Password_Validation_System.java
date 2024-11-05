/*HAZHEL CJ B. MATINGYAD
  CITCS 1N(A)*/
package hazhel_tr;
import java.util.Scanner;

public class Password_Validation_System {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (;;) {
            System.out.print("Enter your password: ");
            String password = scanner.next();

            
            boolean hasUpperCase = false;
            boolean hasDigit = false;

            // Check password length first
            if (password.length() < 8) {
                System.out.println("Password must contain at least 8 characters");
                continue;
            }

            // Check for uppercase and digit
            for (char check : password.toCharArray()) {
                if (Character.isUpperCase(check)) {
                    hasUpperCase = true;
                }
                if (Character.isDigit(check)) {
                    hasDigit = true;
                }
            }

            // Validate results
            if (!hasUpperCase) {
                System.out.println("Password must have at least one uppercase letter");
            }
            if (!hasDigit) {
                System.out.println("Password must have at least one number");
            }
            if (hasUpperCase && hasDigit) {
                System.out.println("Password is valid");
                break; // Exit the loop if the password is valid
            }
        }

        scanner.close(); // Close the scanner
    }
}

