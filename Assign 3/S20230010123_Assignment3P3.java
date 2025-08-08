import java.util.Scanner;

class account {
    int Number;
    String Name;
    String Password;
    double Balance;

    account(int Number, String Name, String Password, double Balance) {
        this.Number = Number;
        this.Name = Name;
        this.Password = Password;
        this.Balance = Balance;
    }

    account() {

    }

    public void displayAccount() {
        System.out.println("Login Successfull");
        System.out.println("Account No : " + Number);
        System.out.println("Name : " + Name);
        System.out.println("Balance : " + Balance);
    }

    public int getAccNo() {
        return Number;
    }

    public void credit(double amount) {
        Balance += amount;
    }

    public void debit(double amount) {
        if (Balance < amount) {
            System.out.println("Insufficient Balance");
            return;
        }
        Balance -= amount;
    }

    public boolean verifyUser(String pass) {
        return (pass == Password);
    }

    public double getBalance() {
        return Balance;
    }
}

public class S20230010123_Assignment3P3 {
    static int cnt = 0;
    static account[] accounts = new account[5];
    static Scanner cin = new Scanner(System.in);

    static void createAcc() {
        int Number;
        String Name;
        String Password;
        double Balance;

        System.out.println("Enter Account Details");
        System.out.println("Enter Account Number");
        Number = cin.nextInt();
        cin.nextLine();

        System.out.println("Enter Account Holder Name");
        Name = cin.nextLine();

        System.out.println("Enter Password");
        Password = cin.nextLine();

        System.out.println("Enter Amount to Initial Credit");
        Balance = cin.nextDouble();

        accounts[cnt++] = new account(Number, Name, Password, Balance);
    }

    static void creditAmount() {
        System.out.println("Enter Account No to credit");
        int accNo = cin.nextInt();
        account acc = null;
        for (int i = 0; i <= cnt; ++i)
        if (accNo == accounts[i].getAccNo())
        acc = accounts[i];
        
        if (acc == null) {
            System.out.println("Account Not found");
            return;
        }
        
        cin.nextLine();
        String pass = cin.nextLine();
        if (!acc.verifyUser(pass)) {
            System.out.println("Wrong Password\n");
            return;
        }

        double amount = cin.nextDouble();

        acc.credit(amount);
        System.out.println("Balance : " + acc.getBalance());
    }

    static void DebitAmount() {
        System.out.println("Enter Account No to credit");
        int accNo = cin.nextInt();
        account acc = null;
        for (int i = 0; i <= cnt; ++i)
            if (accNo == accounts[i].getAccNo())
                acc = accounts[i];

        if (acc == null) {
            System.out.println("Account Not found");
            return;
        }

        String pass = cin.nextLine();
        if (!acc.verifyUser(pass)) {
            System.out.println("Wrong Password\n");
            return;
        }

        double amount = cin.nextDouble();

        acc.credit(amount);
        System.out.println("Balance : " + acc.getBalance());
    }

    static void getAccBalance() {
        System.out.println("Enter Account No check Balance");
        int accNo = cin.nextInt();
        account acc = null;
        for (int i = 0; i < cnt; ++i)
            if (accNo == accounts[i].getAccNo()) {
                acc = accounts[i];
                break;
            }
        if (acc == null) {
            System.out.println("Account Not found");
            return;
        }

        String pass = cin.nextLine();
        if (!acc.verifyUser(pass)) {
            System.out.println("Wrong Password\n");
            return;
        }

        System.out.println("Balance : " + acc.getBalance());
    }

    static void accLogin() {
        System.out.println("Enter Account No check Balance");
        int accNo = cin.nextInt();
        account acc = null;
        for (int i = 0; i <= cnt; ++i)
            if (accNo == accounts[i].getAccNo())
                acc = accounts[i];

        if (acc == null) {
            System.out.println("Account Not found");
            return;
        }

        String pass = cin.nextLine();
        if (!acc.verifyUser(pass)) {
            System.out.println("Wrong Password\n");
            return;
        }

        acc.displayAccount();
    }

    public static void main(String[] args) {

        System.out.println("Enter");
        System.out.println("1 Account Creation");
        System.out.println("2 Account Balance Checking");
        System.out.println("3 Credit and Debit Operation");

        while (true) {
            System.out.println("Choose an Operation");
            int op = cin.nextInt();
            // cin.nextLine();

            switch (op) {
                case 1:
                    if (cnt >= 5) {
                        System.out.println("Max accounts Limit Reached");
                        break;
                    }
                    createAcc();

                    break;
                case 2:
                    getAccBalance();
                    break;
                case 3:

                    System.out.println("Enter 1 to credit or 2 to debit");
                    int a = cin.nextInt();
                    if (a == 2)
                        DebitAmount();
                    else if (a == 1)
                        creditAmount();
                    break;
                case 4:
                    accLogin();
                    break;

                default:
                    break;
            }
        }
        // cin.close();
    }
}
