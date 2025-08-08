abstract class BankAccount {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.balance = balance;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public abstract void deposit(double amount);

    public BankAccount() {
        this.balance = -1;
        this.accountHolder = "-1";
        this.accountNumber = "-1";

    }

    public abstract void withdraw(double amount);

    public BankAccount(double balance) {
        this.balance = balance;
        this.accountHolder = "-1";
        this.accountNumber = "-1";

    }

    public double getBalance() {
        double b = this.balance;
        return b;
    }

    public BankAccount(String accountHolder) {
        this.balance = -1;
        this.accountHolder = accountHolder;
        this.accountNumber = "-1";

    }

    public void getAccountDetails() {
        System.out.println("Details of the Account :");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

interface InterestBearing {
    void calculateInterest(double rate);

    double INTEREST_RATE = 0.05;
}

class SavingsAccount extends BankAccount implements InterestBearing {

    public void deposit(double amount) {
        System.out.println("$" + amount + " has been deposited to savings accout");
        balance += amount;
        System.out.println("Remaining balance : " + getBalance());
    }

    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void withdraw(double amount) {
        if (balance < amount)
            System.out.println("Insufficient balance in Savings Account.");
        else if (balance >= amount) {
            System.out.println("$" + amount + " has been Withdrawn from Savings Account");
            balance -= amount;
        }
    }

    public SavingsAccount(double balance) {
        super(balance);
    }

    public void calculateInterest(double rate) {
        double rrate = (rate * 100);
        System.out.println("Interest Earned: $" + (balance * rate) + " at rate: " + rrate + "%");
    }

    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double overdraftLimit) {
        super(accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    public void deposit(double amount) {
        System.out.println("$" + amount + " has been Withdrawn from Current Account");
        balance += amount;
        System.out.println("Remaining balance : " + getBalance());
    }

    public CurrentAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (balance >= amount - overdraftLimit) {
            balance -= amount;
            System.out.println("$" + amount + " has been deposited to Current accout");
            System.out.println("Remaining balance : " + getBalance());
        } else if (overdraftLimit <= amount - balance)
            System.out.println("Overdraft limit exceeded.");
    }

    public CurrentAccount(double balance, double overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        double odl = overdraftLimit;
        return odl;
    }
}

class Bank {
    public void performTransaction(BankAccount account) {
        account.deposit(1000);
        account.withdraw(500);
    }
}

public class S20230010123_Assignment8P2 {
    public static void main(String[] args) {
        System.out.println();
        int xx = 3, yy = 2;
        Bank bank = new Bank();
        xx += yy;

        SavingsAccount savingsAccount = new SavingsAccount("ABC123", "Vitesh", 5000);
        while (xx > yy)
            yy--;
        yy = 3 * xx;
        System.out.println("Performing transactions for Savings Account:");
        xx = (xx > yy) ? 1 : 0 * 4;
        bank.performTransaction(savingsAccount);
        xx += yy;
        savingsAccount.calculateInterest(InterestBearing.INTEREST_RATE);
        int tempp = xx;

        System.out.println("\nPerforming transactions for Current Account:");
        yy = xx;
        CurrentAccount currentAccount = new CurrentAccount("XYZ789", "Kiran", 750, 7000);
        bank.performTransaction(currentAccount);
        yy = tempp;
    }
}
