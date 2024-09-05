import java.util.Scanner;

// Class representing an ATM machine
class Atm {

    // Variables to store the balance and PIN!!!!!!!
    float Balance;  // Variable to store account.... balance
    int PIN = 4490; // Fixed PIN for the ATM user /////(hardcoded)

    // Method to check the user's entered PIN
    public void checkpin() {
        System.out.println("Enter Your pin:");

        // Infinite loop to continuously ask for the PIN until the correct one is entered!!!!!!
        while (true) {
            Scanner sc = new Scanner(System.in); // Scanner object to take user input
            int EnterPin = sc.nextInt(); // User inputs their PIN

            // If the entered PIN matches the predefined PIN, display the menu
            if (PIN == EnterPin) {
                menu(); // Call the menu method
                break;  // Exit the loop once the correct PIN is entered
            } else {
                // If the PIN is incorrect, ask the user to enter a valid PIN
                System.out.println("Enter the valid pin");
            }
        }
    }

    // Method to display the main menu options!!!!!
    public void menu() {
        // Display the options to the user
        System.out.println("1. Check Account balance:");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        // Take the user's menu choice
        Scanner li = new Scanner(System.in);
        int option = li.nextInt();

        // Depending on the user's choice, call the appropriate method...
        if (option == 1) {
            CheckBalance(); // Call method to check balance
        } else if (option == 2) {
            withdrawMoney(); // Call method to withdraw money
        } else if (option == 3) {
            depositMoney(); // Call method to deposit money
        } else if (option == 4) {
            System.out.println("Thank You for comming");
            return;  // Exit the menu
        } else {
            // If the user enters an invalid option, display an error message
            System.out.println("Enter A valid Choice");
        }
    }

    // Method to check the account balance
    public void CheckBalance() {
        System.out.println("Balance: " + Balance); // Display the current balance
        menu(); // Go back to the menu after showing the balance
    }

    // Method to withdraw money from the account
    public void withdrawMoney() {
        System.out.println("Enter the amount to withdraw");

        // Take the withdrawal amount from the user
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        // Check if the withdrawal amount is greater than the available balance
        if (amount > Balance) {
            System.out.println("Insufficient Balance!!!!!"); // Display error if balance is not enough
        } else {
            Balance = Balance - amount; // Deduct the withdrawal amount from the balance
            System.out.println("Money withdrawal Successful"); // Display success message
        }

        menu(); // Go back to the menu after the transaction
    }

    // Method to deposit money into the account!!!!!
    public void depositMoney() {
        System.out.println("Enter the Amount: ");

        // Take the deposit amount from the user
        Scanner qm = new Scanner(System.in);
        float amount = qm.nextFloat();
        
        Balance = Balance + amount; // Add the deposit amount to the balance
        System.out.println("Money Deposit Successfully!!!"); // Display success message

        menu(); // Go back to the menu after the transaction
    }
}

// Main class to run the ATM machine simulation
public class ATMMachine {

    public static void main(String arg[]) {
        Atm obj = new Atm(); // Create an object of the ATM class
        obj.checkpin(); // Start the process by checking the user's PIN
    }
}
