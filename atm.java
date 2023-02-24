package atm;
import java.util.Scanner;
public class atm {

	public static void main(String[] args) {
		
		  int pin = 1234; // correct pin number
		   Scanner input = new Scanner(System.in);
		   
		   System.out.println("Welcome to the ATM");
		   System.out.println("Please enter your pin number: ");
		   int enteredPin = input.nextInt();
		   
		    if (enteredPin == pin) {
		        // pin number is correct, authenticate user
		        System.out.println("Pin number accepted. You are now authenticated.");
		        
		     // display options for user
		        System.out.println("Please choose a transaction or feature:");
		        System.out.println("1. Withdraw");
		        System.out.println("2. Deposit");
		        System.out.println("3. Check balance");
		        System.out.println("4. Account settings");
		        System.out.println("5. Logout");
		        System.out.println("Enter the number of your choice: ");
		        int choice = input.nextInt();

		        switch (choice) {
		          case 1:
		            // withdraw money
		            System.out.println("Withdrawing money...");
		            break;
		          case 2:
		            // deposit money
		            System.out.println("Depositing money...");
		            break;
		          case 3:
		            // check balance
		            System.out.println("Checking balance...");
		            break;
		          case 4:
		            // manage account settings
		            System.out.println("Managing account settings...");
		            break;
		          case 5:
		            // logout
		            System.out.println("Logging out...");
		            break;
		          default:
		            // invalid choice
		            System.out.println("Invalid choice. Please try again.");
		            break;
		        }
		      } else {
		        // pin number is incorrect, deny access
		        System.out.println("Error: Incorrect pin number. Access denied.");
		      }

	}

}
