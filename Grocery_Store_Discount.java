//HAZHEL CJ B. MATINGYAD
//CC2 CITCS 1N (A)

package hazhel_tr;
import java.util.Scanner;
public class Grocery_Store_Discount {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double purchase, discount = 0, final_amount;
		
		//THE USER TO INPUT THE PURCHASE AMOUNT
		System.out.print("Enter the total purchase amount: PHP "); 
		purchase = input.nextDouble();
		
		//TO DETERMINE THE DISCOUNT BASED ON THE PURCHASED AMOUNT
		if(purchase < 1000) { //if the item is less than 1000
			discount = 0;
		}
		else if (purchase >= 1000 && purchase <= 5000) { // if the item price is 1000 to 5000
			discount = 0.05;  //discount applied
		}
		else if (purchase >= 5001 && purchase <= 10000) { // if the price is between 5001 to 10,000
			discount = 0.1;   //discount applied
		}
		else if (purchase > 10000) { //if the price is more than 10,000
			discount = 0.15;  //discount applied
		}
		
		//CALCULATES THE FINAL AMOUNT
		final_amount = purchase - (purchase * discount);
		
		//OUTPUT OF THE RESULTS
		System.out.println("Discount applied: " + discount * 100 + "%");
		System.out.println("Final price after discount: PHP " + final_amount);
		
  
	}

}
