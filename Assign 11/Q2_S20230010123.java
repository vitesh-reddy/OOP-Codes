/*
 Test case
1
abcd
123
A
1
efg
456
B
1
xyz
789
C

 */

import java.util.*;

class Book {
    String title;
    String author;
    String isbn;

    public Book(String isbn, String title, String author) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String toString() {
        String a = "\n\nISBN: " + isbn;
        String b = " \nTitle: " + title;
        String c = " \nAuthor: " + author;
        return a + b + c;
    }

    public Book(String author) {
        this.author = author;
    }
}

class Library {
    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.isbn, book);
    }

    public void removeBook(String isbn) {
        Book book = books.get(isbn);
        if (book != null) {
            books.remove(isbn);
            System.out.println("Book Removed.\n");
        } else
            System.out.println("Book not found.\n");

    }

    public String findBookByISBN(String isbn) {
        Book book = books.get(isbn);
        if (book == null)
            return "Book Not Found..!";

        return book.toString();
    }

    public List<Book> listAllBooks() {
        List<Book> sortedBooks = new ArrayList<>(books.values());
        sortedBooks.sort(Comparator.comparing(b -> b.isbn));
        return sortedBooks;
    }
}

// Main class for testing
public class Q2_S20230010123 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Library library = new Library();
        boolean flag = true;
        while (flag) {
            System.out.println("\n1. Add New Book");
            System.out.println("2. Find book by ISBN");
            System.out.println("3. Remove Book by ISBN");
            System.out.println("4. Show all books");
            System.out.println("other to Exit\n");

            String isbn, title, author;

            int choice;
            choice = cin.nextInt();
            cin.nextLine();

            switch (choice) {
                case 1:
                    System.out.printf("Enter Book Title : ");
                    title = cin.nextLine();
                    System.out.printf("Enter book ISBN : ");
                    isbn = cin.nextLine();
                    System.out.printf("Enter book Author : ");
                    author = cin.nextLine();

                    library.addBook(new Book(isbn, title, author));
                    System.out.println("Book Added\n");
                    break;
                case 2:
                    System.out.printf("Enter Book ISBN to find : ");
                    isbn = cin.nextLine();
                    System.out.println(library.findBookByISBN(isbn));

                    break;
                case 3:
                    System.out.printf("Enter Book ISBN to Remove that book : ");
                    isbn = cin.nextLine();
                    library.removeBook(isbn);

                    break;
                case 4:
                    System.out.println("All Books: \n" + library.listAllBooks());
                    break;
                default:
                    flag = false;
                    break;
            }
        }
        cin.close();
    }
}