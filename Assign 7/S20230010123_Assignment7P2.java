import java.util.Scanner;

public class S20230010123_Assignment7P2 {
    public static void main(String[] args) {
        LibraryManagementSystem.lms();
    }
}

class Book {
    protected String title;
    protected String author;
    protected double price;

    public Book(Scanner cin) {
        System.out.println("\nEnter Details of Book");
        System.out.printf("Enter Title : ");
        String title = cin.nextLine();
        System.out.printf("Enter Author : ");
        String author = cin.nextLine();
        System.out.printf("Enter Price : ");
        double price = cin.nextDouble();
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("\nEBook Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public Book(String title, String author, double price) {
        this.price = price;
        this.author = author;
        this.title = title;
    }
}

final class PrintedBook extends Book {
    private int numberOfPages;

    public PrintedBook(Scanner cin) {
        super(cin);
        System.out.printf("Enter Number of Pages : ");
        int nop = cin.nextInt();
        this.numberOfPages = nop;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Number of Pages: " + numberOfPages);
    }

    public PrintedBook(String title, String author, double price, int numberOfPages) {
        super(title, author, price);
        this.numberOfPages = numberOfPages;
    }

}

class EBook extends Book {
    private double fileSize;

    public EBook(String title, String author, double price, double fileSize) {
        super(title, author, price);
        this.fileSize = fileSize;
    }

    public EBook(Scanner cin) {
        super(cin);
        System.out.printf("Enter FileSize : ");
        double filesize = cin.nextDouble();
        this.fileSize = filesize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("File Size: " + fileSize + " MB");
    }
}

class LibraryManagementSystem {
    public static void lms() {
        Scanner cin = new Scanner(System.in);

        EBook ebook = new EBook(cin);
        ebook.displayInfo();

        cin.nextLine();
        PrintedBook printedBook = new PrintedBook(cin);
        System.out.println("\nPrintedBook Details:");
        printedBook.displayInfo();
        cin.close();
    }

}
