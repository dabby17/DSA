import java.util.LinkedList; //  kani mao ni mo implement sa queue gamit ang type na linear data sturcture na Linklist 
import java.util.Queue; // mao ni mo provide sa method para ma manage ang queue
import java.util.Scanner; // kani mo allow sa user to input from the console

public class CustomerServiceQueue {

    public static void main(String[] args) {
        Queue<Integer> customerQueue = new LinkedList<>(); // mohimo sa queue na named customer queue para adto is store ang customer IDs
        Scanner scanner = new Scanner(System.in);

//  using while loop
        while (true) {
            System.out.println("\nCustomer Service Queue Menu:");
            System.out.println("1. Add Customer");
            System.out.println("2. Remove Customer");
            System.out.println("3. View Next Customer");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer ID: ");
                    int customerId = scanner.nextInt();
                    customerQueue.offer(customerId);
                    System.out.println("Customer added to the queue.");
                    break;
                case 2:
                    if (customerQueue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        int removedCustomerId = customerQueue.poll();
                        System.out.println("Customer ID " + removedCustomerId + " removed from the queue.");
                    }
                    break;
                case 3:
                    if (customerQueue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        int nextCustomerId = customerQueue.peek();
                        System.out.println("Next customer : ID " + nextCustomerId);
                    }
                    break;
                case 4:
                    System.out.println("Exit.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}