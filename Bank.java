package hazhel_tr;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input, money, balance = 500000, deposit = 0, withdraw ;
		
		System.out.println("1.View Account Balance ");
		System.out.println("2.Deposit Funds");
		System.out.println("3.Withdraw Funds");
		System.out.println("4.Exit");
		System.out.println("_________________________");
		
		
		System.out.print("Enter number of your choice: ");
		input = scan.nextInt();
		
		switch (input) {
		case 1:
			System.out.println("Your balance is PHP 5,000,000");
			break;
		case 2:
			System.out.print("How much money to deposit hubby:) : PHP ");
			money = scan.nextInt();
			deposit = money + balance;
			System.out.println("Your new balance is: PHP " + deposit);
			break;
		case 3:
			System.out.print("How much money to withdraw hubby:( : PHP ");
			money = scan.nextInt();
			if (money >= balance) {
				System.out.println("Insufficient balance bebe :( ");
			}
			else {
			withdraw = balance - money;
			System.out.println("Your new balance is: PHP " + withdraw);
			}
			break;

		default:
			System.out.println("Exiting the program");
			break;
		}
		
		

	}

}
