//Hazhel CJ B. Matingyad
//CITCS 1N-A
//Upgraded version

package hazhel_tr;
import java.util.Scanner;

public class Grocery_Calcu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        int quantity1,quantity2,quantity3; // variable of your products
        double price1,price2,price3, subtotal, discount, sales, finall;
        
        System.out.print("Enter the price of your first item: ");
        price1 = scan.nextDouble();
        System.out.print("Enter the quantity of your first item: ");
        quantity1 = scan.nextInt();
        System.out.print("Enter the price of your first item: ");
        price2 = scan.nextDouble();
        System.out.print("Enter the quantity of your first item: ");     // where the user encode the quantity and price
        quantity2 = scan.nextInt();
        System.out.print("Enter the price of your first item: ");
        price3 = scan.nextDouble();
        System.out.print("Enter the quantity of your first item: ");
        quantity3 = scan.nextInt();
        
        subtotal = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);    // calcu for subtotal
        
         discount = 0.05d * subtotal;                           
         sales = 0.12d * (subtotal - discount);                // use double for decimal or discount to calculate 
         finall = sales + subtotal;
        
        System.out.println("_______________________________________");
        
        System.out.println("Subtotal: " + "PHP" + subtotal);
        System.out.println("Discount: " + "PHP" + discount);              //the totals of the product
        System.out.println("Sales tax: " + "PHP" + sales);
        System.out.println("Final Total: " + "PHP" + finall);

	}

}
