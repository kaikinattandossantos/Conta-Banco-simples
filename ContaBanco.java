import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // List of options
        String[] options = {"transfer", "balance", "deposit"};
        CheckingAccount commonAccount = new CheckingAccount();
        SavingsAccount inheritanceAccount = new SavingsAccount();

        // Request user's name
        System.out.println("Welcome to Bank of Brazil! Please, enter your name:");
        String name = scanner.nextLine();

        // Clear the screen
        clearScreen();

        // Request bank account number
        System.out.println("Great " + name + "! What is your bank account number?");
        int id = scanner.nextInt();

        // Clear the screen again
        clearScreen();

        // Display a message with the provided information
        System.out.println("Very nice");
        System.out.println("Mr. " + name + ", you can now use your bank account " + id);

        // Clear the screen
        clearScreen();
        System.out.println("Choose the type of account:");
        System.out.println("[1] Checking account. [2] Savings account");
        int accountType = scanner.nextInt();

        switch (accountType) {
            case 1:
                System.out.println("You selected the checking account.");
                break;
            case 2:
                System.out.println("You selected the savings account.");
                break;
            default:
                System.out.println("Invalid option.");
        }

        // Present options
        System.out.println("Please, choose an option:");
        System.out.println("[1] to transfer. [2] for balance. [3] to deposit.");

        int usageOption = scanner.nextInt();

        switch (usageOption) {
            case 1:
                System.out.println("You have chosen to transfer.");
                break;
            case 2:
                System.out.println("You have chosen to check your balance.");
                break;
            case 3:
                System.out.println("You have chosen to deposit.");
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    // Method to clear the screen
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
