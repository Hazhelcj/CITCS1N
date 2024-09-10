package hazhel_tr;
import java.util.Scanner;

public class lab_2 {

	public static void main(String[] args) {
Scanner scan= new Scanner(System.in);
		
		System.out.print("What is the length of your garden?");
		int l = scan.nextInt();
		
		System.out.print("What is the width of your garden?");
		int w = scan.nextInt();
		
		int area = l * w;
		int peri = 2 * (l + w);
		
		System.out.println("The length of your garden is " + l );
		System.out.println("The width of your garden is " + w );
		System.out.println("The area of your garden is " + area );
		System.out.println("The perimeter of your garden is " + peri );

   
	}

}
