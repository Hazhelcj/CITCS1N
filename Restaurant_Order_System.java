//Hazhel CJ B. Matingyad
//CITCS 1N(A)

package hazhel_tr;
import java.util.Scanner;
public class Restaurant_Order_System {

	public static void main(String[] args) {
		// VARIABLES NEEDED
		Scanner scan = new Scanner(System.in);
		String food = null ;
		int order, quantity;
		double amount= 0.00;
		
		// THIS IS THE MENU 
		System.out.println("______________________________");
		System.out.println("      CHIMIKI MENU LIST       ");
		System.out.println("______________________________");
		System.out.println("1.Burger    -   PHP 100.00");
		System.out.println("2.Fries     -   PHP 50.00");
		System.out.println("3.Soda      -   PHP 30.00");
		System.out.println("4.Ice Cream -   PHP 45.00");
		System.out.println("5.Exit ");
		System.out.println("______________________________");

		//WHERE THE USER WILL INPUT FOR ITS CHOICE
		
		for(;;) {
		    System.out.print("Enter the menu number of your choice: ");
		    order = scan.nextInt();
		
		    //IF THE USER TYPES 1-4 IT WILL CONTINUE TO ENTER THE QUANTITY
		    
		    if(order == 5) {
		    	System.out.println("Exiting program");
		    	break;
		    }
		    else if (order > 5) {
		    	System.out.println("Choose between onlhy from 1-5");
		    	continue;
		    }
		    else {

			   System.out.print("Enter the quantity: ");
		       quantity = scan.nextInt(); 
	    	
		    
		    //THE OPERATION OF THE PROGRAM OF THE USER'S ORDER
		   switch (order) {
	       case 1:
		       amount = 100 * quantity;
		       food = "Burger";
			   break;
	       case 2:
		       amount = 50 * quantity;
		       food = "Fries";
	    	   break;
	   	   case 3:
		       amount = 30 * quantity;
		       food = "Soda";
		       break;
	       case 4:
	    	   amount = 45 * quantity;
	    	   food = "Ice cream";
		       break;
	    	 }
		  }
			   
		    //OUTPUT OF THE AMOUNT
		    System.out.println("You ordered " + food );
            System.out.println("Total amount: PHP " + amount + "0" );
	 	}

	}

}


