/*
 Hazhel CJ B. Matingyad
 CITCS 1N (A)
 */

package hazhel_tr;
import java.util.Scanner;

public class Challenge_no_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//to store the quantities and prices
		int[] stockQuantities = new int [10];
		double[] prices = new double [10];
		
		double totalStockValue = 0;
		
		//get the quantities of the product from the user
		System.out.println("Enter the stock quantities for 10 products:");
        for (int x = 0; x < 10; x++) {
            System.out.print("Enter quantity for product " + (x + 1) + ": ");
            stockQuantities[x] = input.nextInt();
        }
        
        System.out.println();
        
		//get the prices of the product from the user
        System.out.println("Enter the prices for 10 products:");
        for (int x = 0; x < 10; x++) {
            System.out.print("Enter price for product " + (x + 1) + ": PHP ");
            prices[x] = input.nextDouble();
        }
        
        // calculate the total value of all items in stock
        for (int x = 0; x < 10; x++) {
            totalStockValue += stockQuantities[x] * prices[x];
        }
		
        //outputs the total value of the stocks
        System.out.println("The total value of all items in stock is: PHP " + totalStockValue);
        
        input.close();
     
	}

}
