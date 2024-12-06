/*
 * Hazhel CJ B. Matingyad
 * CITCS 1N-A
 * 11/28/2024
 */

package test;
import javax.swing.*;

// Custom exception class for Insufficient Funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class Banking_System {
    public static void main(String[] args) {
        int balance = 4000;
        int deposit = 0;
        String input;
        
        // Options for the user to choose from
        String[] options = {"View Account Balance", "Deposit Funds", "Withdraw Funds"};
        int choice = JOptionPane.showOptionDialog(null, "Please select an option below", "Chimiki Bank",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options);
        
        switch(choice) {
            case 0: // View Account Balance
                String[] opt = {"Ok", "Back"}; 
                JOptionPane.showOptionDialog(null, "Your balance is PHP " + balance, "Chimiki Bank",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opt, opt);
                break;
                
            case 1: // Deposit Funds
                input = JOptionPane.showInputDialog(null, "How much money would you like to deposit? (PHP)");
                try {
                    int money = Integer.parseInt(input);
                    deposit = money + balance;
                    JOptionPane.showMessageDialog(null, "Your new balance is PHP " + deposit);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.", 
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
                break;
                
            case 2: // Withdraw Funds
                input = JOptionPane.showInputDialog(null, "How much money would you like to withdraw? (PHP)");
                try {
                    int withdrawAmount = Integer.parseInt(input);
                    
                    // Check for sufficient balance
                    if (withdrawAmount > balance) {
                        throw new InsufficientFundsException("Insufficient funds. Your balance is PHP " + balance);
                    }
                    balance -= withdrawAmount; // Deduct the withdraw amount from the balance
                    JOptionPane.showMessageDialog(null, "Withdrawal successful! Your remaining balance is PHP " + balance);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.", 
                            "Error", JOptionPane.ERROR_MESSAGE);
                } catch (InsufficientFundsException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "No option selected.");
         }
        
    }
}
