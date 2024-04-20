import java.util.Scanner;

public class ATM_INTERFACE {
    Scanner sc = new Scanner(System.in);
    int balance = 15000;
    int withdrawal, deposit;

    public void withdrawal() {
        System.out.println("Enter the amount to be withdrawn: ");
        withdrawal = sc.nextInt();
        if (withdrawal < balance) {
            balance -= withdrawal;
            System.out.println("Amount " + withdrawal + " has been withdrawn successfully.");
            System.out.println("Current balance: " + balance);
        } else {
            System.out.println("INSUFFICIENT BALANCE");
            System.out.println("Current balance: " + balance);
        }
        System.out.println();
    }

    public void deposit() {
        System.out.println("Enter the amount to be deposited: ");
        deposit = sc.nextInt();
        System.out.println("Amount " + deposit + " has been deposited successfully.");
        balance += deposit;
        System.out.println("Current balance: " + balance);
    }

    public void showBalance() {
        System.out.println("Balance is: " + balance);
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        ATM_INTERFACE atm = new ATM_INTERFACE();
        while (true) {
            System.out.println("ENTER YOUR CHOICE");
            System.out.println("Press 1 for Withdraw");
            System.out.println("Press 2 for Deposit");
            System.out.println("Press 3 for Balance");
            System.out.println("Press 4 to Quit");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    atm.withdrawal();
                    break;
                case 2:
                    atm.deposit();
                    break;
                case 3:
                    atm.showBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("aniket");
            System.out.println("aniket");
            System.out.println("second change");
        }
    }
}