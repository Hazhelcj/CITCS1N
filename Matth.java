package hazhel_tr;

import java.util.Scanner;

public class Matth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int first, second, nega;
		
		System.out.print("Enter a number: ");
		first = scan.nextInt();
		
		System.out.print("Enter another number: ");
		second = scan.nextInt();
		System.out.print("Enter a negative number: ");
		nega = scan.nextInt();
		
		System.out.println("The highest number is: " + Math.max(first,second));
		System.out.println("The lowest number is: " + Math.min(first,second));
		System.out.println("The squareroot of the first number is: " + Math.sqrt(first));
		System.out.println("The squareroot of the second number is: " + Math.sqrt(second));
        System.out.println("The addition: " + Math.addExact(first, second));
        System.out.println("The subtraction: " + Math.subtractExact(first, second));
        System.out.println("The multiplication: " + Math.multiplyFull(first, second));
        System.out.println("The division: " + Math.divideExact(first, second));
        System.out.println("Random Number: " + Math.ceilDiv(first, second));
        System.out.println("Its positive number is " + Math.abs(nega));
        System.out.println("Random Number: " + Math.random());
        
        
	}

}
