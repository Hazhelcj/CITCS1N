/*
 * Hazhel CJ B. Matingyad
 * CITCS 1N-A
 * 11/28/2024
 */
package test;
import javax.swing.*;

// Custom Exception class for Invalid Quantity
class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message) {
        super(message);
    }
}

// Main class to simulate the shopping cart
public class Online_Shopping_Cart {
    public static void main(String[] args) {
        int[] availableStock = {5, 9, 7};  // Stock for Ice Cream, Cake, Biscuit
        String input;
        int quantity;
        
        String[] options = {"Ice Cream", "Cake", "Biscuit"};
        int choice = JOptionPane.showOptionDialog(null, "What do you want bebe:)", "Chimiki Sweets",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options);
        
        switch (choice) {
        case 0:  // Ice Cream
            // Ask the user for the quantity
            input = JOptionPane.showInputDialog("Enter quantity for Ice Cream (Available stock: " + availableStock[0] + "):");

            try {
                // Convert the input to an integer (quantity to be purchased)
                quantity = Integer.parseInt(input);

                // Check if the quantity is valid
                if (quantity < 0) {
                    throw new InvalidQuantityException("Quantity cannot be negative.");
                } else if (quantity > availableStock[0]) {
                    throw new InvalidQuantityException("Insufficient stock. Available stock: " + availableStock[0]);
                }

                // Successful purchase
                JOptionPane.showMessageDialog(null, "You have successfully added " + quantity + " Ice Cream(s) to your cart.", "Success", JOptionPane.INFORMATION_MESSAGE);

            } catch (NumberFormatException e) {
                // Handle invalid input (not a number)
                JOptionPane.showMessageDialog(null, "Please enter a valid number for quantity.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (InvalidQuantityException e) {
                // Handle invalid quantity (negative or exceeds stock)
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            break;

        case 1:  // Cake
            // Ask the user for the quantity
            input = JOptionPane.showInputDialog("Enter quantity for Cake (Available stock: " + availableStock[1] + "):");

            try {
                // Convert the input to an integer (quantity to be purchased)
                quantity = Integer.parseInt(input);

                // Check if the quantity is valid
                if (quantity < 0) {
                    throw new InvalidQuantityException("Quantity cannot be negative.");
                } else if (quantity > availableStock[1]) {
                    throw new InvalidQuantityException("Insufficient stock. Available stock: " + availableStock[1]);
                }

                // Successful purchase
                JOptionPane.showMessageDialog(null, "You have successfully added " + quantity + " Cake(s) to your cart.", "Success", JOptionPane.INFORMATION_MESSAGE);

            } catch (NumberFormatException e) {
                // Handle invalid input (not a number)
                JOptionPane.showMessageDialog(null, "Please enter a valid number for quantity.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (InvalidQuantityException e) {
                // Handle invalid quantity (negative or exceeds stock)
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            break;

        case 2:  // Biscuit
            // Ask the user for the quantity
            input = JOptionPane.showInputDialog("Enter quantity for Biscuit (Available stock: " + availableStock[2] + "):");

            try {
                // Convert the input to an integer (quantity to be purchased)
                quantity = Integer.parseInt(input);

                // Check if the quantity is valid
                if (quantity < 0) {
                    throw new InvalidQuantityException("Quantity cannot be negative.");
                } else if (quantity > availableStock[2]) {
                    throw new InvalidQuantityException("Insufficient stock. Available stock: " + availableStock[2]);
                }

                // Successful purchase
                JOptionPane.showMessageDialog(null, "You have successfully added " + quantity + " Biscuit(s) to your cart.", "Success", JOptionPane.INFORMATION_MESSAGE);

            } catch (NumberFormatException e) {
                // Handle invalid input (not a number)
                JOptionPane.showMessageDialog(null, "Please enter a valid number for quantity.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (InvalidQuantityException e) {
                // Handle invalid quantity (negative or exceeds stock)
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            break;

        default:
            // Handle case where no valid selection is made
            JOptionPane.showMessageDialog(null, "No valid option selected.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
