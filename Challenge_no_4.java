/*
 * Hazhel CJ B. Matingyad
 * CITCS 1N-A
 */
package hazhel_tr;

import java.util.Scanner;

public class Challenge_no_4 {

    // Node class to represent a web page in history
    static class Node {
        String page;       // The URL of the page
        Node previous;     // Pointer to the previous page
        Node next;         // Pointer to the next page

        public Node(String page) {
            this.page = page;
            this.previous = null;
            this.next = null;
        }
    }

    // BrowserHistory class to simulate browser history
    static class BrowserHistory {
        private Node current; // Points to the current page the user is on
        private Node head;    // Points to the first page in history
        private Node tail;    // Points to the last page in history

        public BrowserHistory() {
            this.current = null;
            this.head = null;
            this.tail = null;
        }

        // Visit a new page
        public void visitNewPage(String page) {
            Node newNode = new Node(page);
            
            // If there's already a current page, clear the forward history
            if (current != null) {
                current.next = null;
            }

            // If the history is empty, set the new node as both the head and tail
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                // Add the new page at the end of the history
                tail.next = newNode;
                newNode.previous = tail;
                tail = newNode;
            }

            // Set the current page as the newly visited page
            current = newNode;
            System.out.println("Visited: " + page);
        }

        // Go back to the previous page
        public void goBack() {
            if (current != null && current.previous != null) {
                current = current.previous;
                System.out.println("Went back to: " + current.page);
            } else {
                System.out.println("No previous page.");
            }
        }

        // Go forward to the next page
        public void goForward() {
            if (current != null && current.next != null) {
                current = current.next;
                System.out.println("Went forward to: " + current.page);
            } else {
                System.out.println("No next page.");
            }
        }

        // Print the entire history from the first page to the current page
        public void printHistory() {
            if (head == null) {
                System.out.println("No pages visited yet.");
                return;
            }

            Node temp = head;
            System.out.println("History: ");
            while (temp != null) {
                System.out.print(temp.page + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // Clear all the history
        public void clearHistory() {
            head = null;
            tail = null;
            current = null;
            System.out.println("History cleared.");
        }

        // Print the current page
        public void printCurrentPage() {
            if (current != null) {
                System.out.println("Currently on: " + current.page);
            } else {
                System.out.println("No pages visited.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BrowserHistory history = new BrowserHistory();
        
        // Command loop
        while (true) {
            System.out.println("\nAvailable commands:");
            System.out.println("1: Visit a new page");
            System.out.println("2: Go back");
            System.out.println("3: Go forward");
            System.out.println("4: Print history");
            System.out.println("5: Print current page");
            System.out.println("6: Clear history");
            System.out.println("7: Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (choice) {
                case 1: 
                    // Visit a new page
                    System.out.print("Enter the page URL: ");
                    String page = scanner.nextLine();
                    history.visitNewPage(page);
                    break;
                case 2: 
                    // Go back
                    history.goBack();
                    break;
                case 3: 
                    // Go forward
                    history.goForward();
                    break;
                case 4: 
                    // Print history
                    history.printHistory();
                    break;
                case 5: 
                    // Print current page
                    history.printCurrentPage();
                    break;
                case 6: 
                    // Clear history
                    history.clearHistory();
                    break;
                case 7:
                    // Exit the program
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
