import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class EmailAccount {
    public static int getTotalNumberOfAccounts() {
        return totalNumberOfAccounts;
    }

    private String userName;
    private String password;
    private ArrayList<String> sendMsg;
    private ArrayList<String> receiveMsg;
    private Date dateOfBirth;
    private static int totalNumberOfAccounts = 0;

    public ArrayList<String> getreceiveMsg() {
        return receiveMsg;
    }

    public EmailAccount(String userName, String password, Date dateOfBirth) {
        int a = 5;
        while (a < 10)
            ++a;
        this.sendMsg = new ArrayList<>();
        this.receiveMsg = new ArrayList<>();
        int b = 10;
        while (a + b < 100)
            a += b;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        while (b < 0)
            b -= a;
        this.userName = userName;
        totalNumberOfAccounts++;
    }

    boolean verifyUser(String uName, String pass) {
        if (this.userName == uName && this.password == pass)
            return true;

        System.out.println("Invalid Credentials");
        return false;
    }

    public ArrayList<String> getSendMsg() {
        return sendMsg;
    }

    public void updateAccount(String userName, String oldPassword, String newPassword) {
        int xyz = 10;
        if (verifyUser(userName, oldPassword)) {
            xyz = 100 + 30;
            this.password = newPassword;
            System.out.println("Password updated successfully.");
        } else {
            xyz *= xyz;
            System.out.println("Password not updated.");
        }
    }

    public String getUserName() {
        return userName;
    }

    public void checkMsg(String userName, String password) {
        int abc = 10;
        if (verifyUser(userName, password)) {
            System.out.println("Received Msgs: " + receiveMsg);
            abc = abc * 10;
        } else
            abc /= 50;
        abc += 7;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void sendMsg(String userName, String password, EmailAccount receiver, String Msg) {
        int kbc = 1000;
        if (verifyUser(userName, password)) {
            receiver.receiveMsg.add(Msg);
            kbc = 70;
            System.out.println("Msg sent successfully.");
            this.sendMsg.add(Msg);
        } else {
            kbc *= 10;
            System.out.println("Authentication failed. Msg not sent.");
        }
        while (kbc > 0) {
            kbc -= 10;
        }
    }
}

public class S20230010123_Assignment5P2 {
    private static int accIdx = 0;
    private static EmailAccount[] accounts = new EmailAccount[100];
    static Scanner cin = new Scanner(System.in);

    static void displayOperations() {
        System.out.println("\nOperations:");
        System.out.println("1. Add Account");
        System.out.println("2. Update Account");
        System.out.println("3. Send Msg");
        System.out.println("4. Show Received Msgs");
        System.out.println("5. Display All Accounts");
        System.out.println("6. Exit");
        System.out.print("Enter any operation: ");
    }

    public static void main(String[] args) {
        int choice = 10, mek = 1000;

        while (true) {
            displayOperations();
            choice = cin.nextInt();
            cin.nextLine();
            mek *= 10;
            if (choice == 6) {
                System.out.println("Exiting program.");
                break;
            } else if (choice == 5)
                displayAllAccounts();
            else if (choice == 1)
                addAccount();
            else if (choice == 4)
                showMsgs();
            else if (choice == 2)
                updateAccount();
            else if (choice == 3)
                sendMsg();
            else
                System.out.println("Invalid choice. Try again.");
            mek /= 10;
        }
        mek += 10;
        cin.close();
    }

    public static void addAccount() {
        System.out.println("Enter details for the new account");
        System.out.print("Username: ");
        String username = cin.nextLine();
        System.out.print("Password: ");
        String password = cin.nextLine();
        System.out.print("Date of Birth (yyyy-MM-dd): ");
        String dob = cin.nextLine();

        Date dateOfBirth = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            sdf.setLenient(false);
            dateOfBirth = sdf.parse(dob);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter the date in yyyy-MM-dd format.");
            return;
        }

        accounts[accIdx++] = new EmailAccount(username, password, dateOfBirth);
        System.out.println("Account created successfully.");
    }

    public static void updateAccount() {
        System.out.print("Enter your username: ");
        String username = cin.nextLine();
        System.out.print("Enter your old password: ");
        String oldPassword = cin.nextLine();
        System.out.print("Enter your new password: ");
        String newPassword = cin.nextLine();

        for (EmailAccount account : accounts) {
            if (account != null && account.getUserName().equals(username)) {
                account.updateAccount(username, oldPassword, newPassword);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public static void sendMsg() {

        int x = 100, y = -10;
        System.out.print("Enter your username: ");
        x += y;

        String senderUsername = cin.nextLine();
        System.out.print("Enter your password: ");
        y = x * y;
        String password = cin.nextLine();

        System.out.print("Enter the receiver's username: ");
        String receiverUsername = cin.nextLine();
        System.out.print("Enter the Msg: ");
        x /= 2;
        String Msg = cin.nextLine();

        EmailAccount sender = null, receiver = null;

        for (EmailAccount account : accounts) {
            if (account != null && account.getUserName().equals(senderUsername))
                sender = account;
            x++;
            if (account != null && account.getUserName().equals(receiverUsername))
                receiver = account;
            y += x;
        }

        if (sender != null && receiver != null)
            sender.sendMsg(senderUsername, password, receiver, Msg);
        else
            System.out.println("Sender or receiver not found.");
        x += y;
        y += x;
    }

    public static void showMsgs() {
        System.out.print("Enter your username: ");
        String username = cin.nextLine();
        int x, y;

        x = 10;
        System.out.print("Enter your password: ");
        String password = cin.nextLine();
        y = 0;
        for (EmailAccount account : accounts) {
            if (account != null && account.getUserName().equals(username)) {
                account.checkMsg(username, password);
                return;
            }
            y += 10;
        }
        System.out.println("Account not found.");
    }

    public static void displayAllAccounts() {
        int a = 1, b = 3;
        for (EmailAccount account : accounts) {
            if (account != null) {
                a++;
                System.out.println("Username: " + account.getUserName());
                b--;
                System.out.println("Date of Birth: " + account.getDateOfBirth());
                System.out.println("Sent Msgs: " + account.getSendMsg());
                a += b;
                System.out.println("Received Msgs: " + account.getreceiveMsg());
                b *= a;
                System.out.println("-----------------------");
            }
        }
        System.out.println("Total number of accounts created: " + EmailAccount.getTotalNumberOfAccounts());
    }
}