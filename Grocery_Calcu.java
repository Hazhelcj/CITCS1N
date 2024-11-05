//Hazhel CJ B. Matingyad
//CITCS 1N-A
//Upgraded version

package hazhel_tr;
import java.util.Scanner;

public class Grocery_Calcu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        int quantity1,quantity2,quantity3; // variable of your products
        double price1,price2,price3, subtotal, discount, sales, finall; //for the price if ever it has a decimal
        
        //ENCODE THE PRICE AND QUANTITY OF THE PRODUCTS
        System.out.print("Enter the price of your first item: ");     // where the user encode the price of the first item
        price1 = scan.nextDouble();
        System.out.print("Enter the quantity of your first item: ");  // where the user encode the quantity of the first item
        quantity1 = scan.nextInt();
        System.out.print("Enter the price of your second item: ");    // where the user encode the price of the second item
        price2 = scan.nextDouble();
        System.out.print("Enter the quantity of your second item: "); // where the user encode the quantity of the second item
        quantity2 = scan.nextInt();
        System.out.print("Enter the price of your third item: ");     // where the user encode the price of the third item
        price3 = scan.nextDouble();
        System.out.print("Enter the quantity of your third item: ");  // where the user encode the quantity of the third item
        quantity3 = scan.nextInt();
        
        subtotal = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);    // calcu for subtotal
         
         // TO CALCULATE THE FOLLOWING DISCOUNT, SALES, AND FINALL
         discount = 0.05 * subtotal;                    // to calcu for the discount, where 0.05 represents the 5%
         sales = 0.12 * (subtotal - discount);          // to calcu para sa subtotal, where the 0.12 represent the 12% 
         finall = sales + (subtotal - discount);        // to calcu for the final sale po
        
        System.out.println("_______________________________________"); //design
        
        // OUTPUT OF THE CODE
        System.out.println("Subtotal: " + "PHP" + subtotal + "0");
        System.out.println("Discount: " + "PHP" + discount + "0");              
        System.out.println("Sales tax: " + "PHP" + sales + "0");
        System.out.println("Final Total: " + "PHP" + finall + "0");

	}

}
