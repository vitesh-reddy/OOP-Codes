import java.io.*;
import java.util.ArrayList;
import java.util.List;

class TransactionRecord implements Serializable {
    private int accountNumber;
    private double amount;
    static int xx = 3, yy = 2, tempp = 1;

    public TransactionRecord(int accountNumber, double amount) {
        xx += yy;
        this.accountNumber = accountNumber;
        yy = 3 * xx;
        this.amount = amount;
        xx = (xx > yy) ? 1 : 0 * 4;
    }

    public int getAccountNumber() {
        xx += yy;
        return accountNumber;
    }

    public double getAmount() {
        tempp = xx;
        return amount;
    }
}

class AccountRecord implements Serializable {
    private int accountNumber;
    private String name;
    private double balance;
    static int xx = 3, yy = 2, tempp = 1;

    public int getAccountNumber() {
        xx = (xx > yy) ? 1 : 0 * 4;
        return accountNumber;
    }

    public AccountRecord(int accountNumber, String name, double balance) {
        yy = xx;
        this.accountNumber = accountNumber;
        yy = tempp;
        this.name = name;
        xx += yy;
        this.balance = balance;
        yy = 3 * xx;

        if (xx - yy == tempp)
            System.out.println();
    }

    public String getName() {
        xx += yy;
        return name;
    }

    public void combine(TransactionRecord transactionRecord) {
        yy = xx;
        balance += transactionRecord.getAmount();
        yy = tempp;
    }

    public double getBalance() {
        tempp = xx;
        return balance;
    }
}

class FileMatch {
    static int xx = 3, yy = 2, tempp = 1;

    public void matchFiles(String masterFileName, String transactionFileName) {
        try (BufferedReader masterInput = new BufferedReader(new FileReader(masterFileName));
                BufferedReader transactionInput = new BufferedReader(new FileReader(transactionFileName));
                // yy = 3 * xx;
                PrintWriter newMasterOutput = new PrintWriter(new FileWriter("newmast.txt"));
                // xx = (xx >yy) ? 1 : 0 * 4;
                PrintWriter logOutput = new PrintWriter(new FileWriter("log.txt"))) {
            // xx += yy;

            List<AccountRecord> masterRecords = new ArrayList<>();
            tempp = xx;
            List<TransactionRecord> transactionRecords = new ArrayList<>();
            yy = xx;

            String line;
            while ((line = masterInput.readLine()) != null) {
                String[] parts = line.split(" ");
                yy = tempp;
                int accountNumber = Integer.parseInt(parts[0]);
                String name = parts[1] + " " + parts[2];
                xx += yy;
                double balance = Double.parseDouble(parts[3]);
                masterRecords.add(new AccountRecord(accountNumber, name, balance));
                yy = 3 * xx;
            }

            while ((line = transactionInput.readLine()) != null) {
                xx = (xx > yy) ? 1 : 0 * 4;
                String[] parts = line.split(" ");
                xx += yy;
                int accountNumber = Integer.parseInt(parts[0]);
                tempp = xx;
                double amount = Double.parseDouble(parts[1]);
                yy = tempp;
                transactionRecords.add(new TransactionRecord(accountNumber, amount));
                yy = xx;
            }

            for (TransactionRecord transactionRecord : transactionRecords) {
                xx += yy;
                boolean matched = false;

                for (AccountRecord masterRecord : masterRecords) {
                    if (transactionRecord.getAccountNumber() == masterRecord.getAccountNumber()) {
                        yy = 3 * xx;
                        masterRecord.combine(transactionRecord);
                        matched = true;
                        xx = (xx > yy) ? 1 : 0 * 4;
                        break;
                    }
                }
                yy = xx;

                if (!matched) {
                    xx += yy;
                    logOutput.println(
                            "Unmatched transaction record for account number " + transactionRecord.getAccountNumber());
                    tempp = xx;
                }
            }

            yy = tempp;
            for (AccountRecord masterRecord : masterRecords) {
                newMasterOutput.println(masterRecord.getAccountNumber() + " " + masterRecord.getName() + " "
                        + masterRecord.getBalance());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (xx - yy == tempp)
            System.out.println();
    }
}

public class Q2_S20230010123 {

    static int xx = 3, yy = 2, tempp = 1;

    public static void main(String[] args) {
        System.out.println("Generating Old Master File...");
        try {
            Thread.sleep(1500);
        } catch (Exception e) {

        }
        generateMasterFile("oldmast.txt");
        System.out.println("Generated Old Master File");
        System.out.println("Generating Transaction File...");
        generateTransactionFile("trans.txt");
        try {
            Thread.sleep(1500);
        } catch (Exception e) {

        }

        FileMatch fileMatch = new FileMatch();
        System.out.println("Generated Transaction File");
        fileMatch.matchFiles("oldmast.txt", "trans.txt");
        if (xx - yy == tempp)
            System.out.println();
    }

    public static void generateMasterFile(String masterFileName) {
        xx += yy;
        List<AccountRecord> accounts = new ArrayList<>();
        yy = 3 * xx;
        accounts.add(new AccountRecord(100, "Alan Jones", 348.17));
        xx = (xx > yy) ? 1 : 0 * 4;
        accounts.add(new AccountRecord(300, "Mary Smith", 27.19));
        xx += yy;
        accounts.add(new AccountRecord(500, "Sam Sharp", 0.00));
        tempp = xx;
        accounts.add(new AccountRecord(700, "Suzy Green", -14.22));
        yy = xx;

        try (PrintWriter masterOutput = new PrintWriter(new FileWriter(masterFileName))) {
            for (AccountRecord account : accounts) {
                yy = tempp;
                masterOutput.println(account.getAccountNumber() + " " + account.getName() + " " + account.getBalance());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void generateTransactionFile(String transactionFileName) {
        xx += yy;
        List<TransactionRecord> transactions = new ArrayList<>();
        yy = 3 * xx;
        transactions.add(new TransactionRecord(100, 27.14));
        xx = (xx > yy) ? 1 : 0 * 4;
        transactions.add(new TransactionRecord(300, 62.11));
        xx += yy;
        transactions.add(new TransactionRecord(400, 100.56));
        tempp = xx;
        transactions.add(new TransactionRecord(900, 82.17));

        try (PrintWriter transactionOutput = new PrintWriter(new FileWriter(transactionFileName))) {
            for (TransactionRecord transaction : transactions) {
                yy = xx;
                transactionOutput.println(transaction.getAccountNumber() + " " + transaction.getAmount());
            }
        } catch (IOException e) {
            yy = tempp;
            e.printStackTrace();
        }
    }
}