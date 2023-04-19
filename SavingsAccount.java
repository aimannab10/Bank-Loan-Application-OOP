/*
* Assignment done individually
* Name: Aiman Nabil Bin Johan (2217777)
*/

package tutooop6;

public class SavingsAccount implements BankAccount {
    private final int acctNum;
    private double balance;
    private static final double RATE = 0.01;
    
    public SavingsAccount(int acctNum, double initBalance) {
        this.acctNum = acctNum;
        deposit(initBalance);
    }
    
    @Override
    public int getAcctNum() {
        return acctNum;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amt) {
        balance += amt;
    }

    @Override
    public boolean hasEnoughCollateral(double loanAmt) {
        return balance >= loanAmt / 2;
    }

    @Override
    public String toString() {
        return "Savings Account";
    }

    public void addInterest() {
        double interest = balance * RATE;
        balance += interest;
    }
}