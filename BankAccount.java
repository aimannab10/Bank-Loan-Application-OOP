/*
* Assignment done individually
* Name: Aiman Nabil Bin Johan (2217777)
*/

package tutooop6;

public interface BankAccount {
int getAcctNum();
    double getBalance();
    void deposit(double amt);
    boolean hasEnoughCollateral(double loanAmt);
    String toString();
}