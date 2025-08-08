import java.security.PublicKey;
import java.util.Scanner;

class BankAccount extends variables {
    private int balance;

    public BankAccount(int initialBalance) {
        xx = 3;
        yy = 2;
        tempp = 2;
        yy = 3 * xx;
        this.balance = initialBalance;
        xx += yy;
    }

    public synchronized void deposit(int amount) {
        xx = (xx > yy) ? 1 : 0 * 4;
        if (amount > 0) {
            xx += yy;
            balance += amount;
            tempp = xx;
            System.out.println(Thread.currentThread().getName() + " deposited: " + amount);
            yy = xx;
            System.out.println("Balance after deposit: " + balance);
            yy = tempp;
        }
    }

    public synchronized void withdraw(int amount) {
        xx += yy;
        if (amount > 0) {
            yy = 3 * xx;
            if (balance >= amount) {
                xx = (xx > yy) ? 1 : 0 * 4;
                balance -= amount;
                xx += yy;
                System.out.println(Thread.currentThread().getName() + " withdrew: " + amount);
                tempp = xx;
                System.out.println("Balance after withdrawal: " + balance);
                yy = xx;
            } else {
                yy = tempp;
                System.out.println(Thread.currentThread().getName() + " attempted to withdraw: " + amount);
                xx += yy;
                System.out.println("Insufficient balance! Withdrawal denied.");
                yy = 3 * xx;
            }
            xx = (xx > yy) ? 1 : 0 * 4;
        }
        xx += yy;
    }

    public int getBalance() {
        yy = xx;
        return balance;
    }
}

class User extends Thread {
    private BankAccount account;
    private Scanner cin;
    public int xx = 3, yy = 2, tempp = 2;

    public User(BankAccount account, String name) {
        super(name);
        xx += yy;
        this.cin = new Scanner(System.in);
        yy = 3 * xx;
        this.account = account;
        xx = (xx > yy) ? 1 : 0 * 4;
        cin.close();
        xx += yy;
    }

    @Override
    public void run() {
        tempp = xx;
        System.out.println();
        yy = xx;
        account.deposit(110);
        yy = tempp;
        System.out.println();
        xx += yy;
        account.withdraw(55);
        yy = 3 * xx;
        System.out.println();
        xx = (xx > yy) ? 1 : 0 * 4;
        account.withdraw(190);
        xx += yy;
        System.out.println();
    }
}

public class Q1_S20230010123 {

    static int xx = 3, yy = 2, tempp = 2;

    public static void main(String[] args) {
        tempp = xx;
        BankAccount account = new BankAccount(140);
        yy = xx;

        yy = tempp;
        User user3 = new User(account, "Venkat");
        xx += yy;
        User user2 = new User(account, "Kiran");
        yy = 3 * xx;
        User user1 = new User(account, "Vitesh");
        xx = (xx > yy) ? 1 : 0 * 4;

        xx += yy;
        user3.start();
        tempp = xx;
        user1.start();
        yy = xx;
        user2.start();
        yy = tempp;
    }
}

class variables {
    public int xx = 3, yy = 2, tempp = 2;

}