import java.util.Scanner;

public class ATM_INTERFACE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 15000, withdraw, deposit, transfer;
        System.out.println("ENTER YOUR CHOICE");
        System.out.println("Press 1 for Withdraw");
        System.out.println("Press 2 for Deposit");
        System.out.println("Press 3 for Transfer ");
        System.out.println("Press 4 to Quit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the amount to be withdraw");
                withdraw = sc.nextInt();
                if (withdraw < balance) {
                    balance = balance - withdraw;
                    System.out.println("Amount " + withdraw + " has been withdrawn sucessfully.");
                    System.out.print("Current balance : " + balance);
                } else {
                    System.out.println("INSUFFICIENT BALANCE");
                    System.out.print("Current balance : " + balance);
                }
                System.out.println();
                break;
            case 2:
                System.out.println("Enter the amout to be deposit");
                deposit = sc.nextInt();
                System.out.println("Amount " + deposit + " has been deposited sucessfully.");
                balance = balance + deposit;
                System.out.println("current balance : " + balance);
                break;
            case 3:
                System.out.println("Enter the bank details to tarnsfer");
                System.out.println("Enter the benificiary name ");
                String str = sc.nextLine();
                System.out.println("Enter the name of the bank");
                String bank = sc.nextLine();
                System.out.println("Enter the amount to be transferred");
                transfer = sc.nextInt();
                if (transfer < balance) {
                    balance = balance - transfer;
                    System.out.println("Transfer was sucessfully done.");
                    System.out.print("Current balance : " + balance);
                } else {
                    System.out.println("INSUFFICIENT BALANCE");
                    System.out.print("Current balance : " + balance);
                }
                System.out.println();
                break;
            case 4:
                System.exit(0);
        }
    }
}