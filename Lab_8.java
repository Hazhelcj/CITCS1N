/* HAZHEL CJ B. MATINGYAD
  CITCS 1N (GROUP A) */
package hazhel_tr;

public class Lab_8 {
	// Employee class defined as a class
    static class Employee {
        String employeeID;
        String name;
        double hourlyWage;
        double hoursWorked;

        // Constructor to initialize employee details
        public Employee(String employeeID, String name, double hourlyWage, double hoursWorked) {
            this.employeeID = employeeID;
            this.name = name;
            this.hourlyWage = hourlyWage;
            this.hoursWorked = hoursWorked;
        }

        // Method to calculate monthly salary
        public double calculateSalary() {
            return hourlyWage * hoursWorked;
        }

        // Method to display employee details
        public void displayEmployeeDetails() {
            System.out.printf("Employee ID: %s\nName: %s\nHourly Wage: %.2f\nHours Worked: %.2f\nMonthly Salary: %.2f\n",
                    employeeID, name, hourlyWage, hoursWorked, calculateSalary());
        }
    }

    public static void main(String[] args) {
        // Creating an Employee object with the given details
        Employee employee1 = new Employee("E001", "Alice Go", 15.0, 160.0);
        Employee employee2 = new Employee("E002", "Bob Hann", 18.0, 150.0);
        
        // Displaying the employee details
        System.out.println("Employee 1: ");
        employee1.displayEmployeeDetails();
        System.out.println();
        System.out.println("Employee 2: ");
        employee2.displayEmployeeDetails();
    }
}
