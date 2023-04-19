/*
* Assignment done individually
* Name: Aiman Nabil Bin Johan (2217777)
*/

package tutooop6;
import java.util.ArrayList;
import java.util.Scanner;

public class BankLoanApplication {
    private static final Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        createAccounts(accounts);
        displayAccounts(accounts);
        authorizeLoan(accounts);
    }
    
    public static void createAccounts(ArrayList<BankAccount> accounts) {
        int choice = 0;
        do {
            System.out.println("\nSelect account to be created:");
            System.out.println("1 Savings");
            System.out.println("2 Checking");
            System.out.println("3 Quit");

            choice = input.nextInt();
            if (choice == 1) {
                System.out.print("Enter 8-digit account no: ");
                int acctNum = input.nextInt();
                System.out.print("Enter amount to be deposited in RM: ");
                double initBalance = input.nextDouble();
                SavingsAccount account = new SavingsAccount(acctNum, initBalance);
                account.addInterest();
                accounts.add(account);
            } else if (choice == 2) {
                System.out.print("Enter 8-digit account no: ");
                int acctNum = input.nextInt();
                System.out.print("Enter amount to be deposited in RM: ");
                double initBalance = input.nextDouble();
                CheckingAccount account = new CheckingAccount(acctNum, initBalance);
                accounts.add(account);
            }
        } while (choice != 3);

    }
    
    public static void displayAccounts(ArrayList<BankAccount> accounts) {
         {
        System.out.println();
        System.out.println("Processing loan now...");
        int i = 0;
        for(BankAccount account:accounts)
        {
            ++i;
            System.out.println("Account[" + i + "] "+ account);
        }
        System.out.println();
}
    }

public static void authorizeLoan(ArrayList<BankAccount> accounts)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Select which account: ");
        int selectAccount = input.nextInt();
        BankAccount account = accounts.get(selectAccount-1);
        System.out.println("Enter loan amount to be applied in RM: ");
        double loanAmount = input.nextDouble();
        if(account.hasEnoughCollateral(loanAmount))
        {
            System.out.printf("Your loan amounted RM%.2f has been approved.",loanAmount);
            System.out.println();
        }
        else
        {
            System.out.printf("Your account balance is RM:%.2f",account.getBalance());
            System.out.println("\nNot enough collateral - loan is not approved!");
        }
    }
}

    


