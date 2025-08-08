import java.util.Scanner;

class Human {
    String name;
    int age;
    char gender;
    double height;
    String color;
    double weight;
    String city;

    static Scanner cin = new Scanner(System.in);

    Human(String name) {
        System.out.println("\n1 Parameter Constructor Called\n");
        this.name = name;
        System.out.println("Enter the Details of " + name);

        System.out.println("Enter Age : ");
        age = cin.nextInt();
        cin.nextLine();

        System.out.println("Enter Gender : ");
        gender = cin.next().charAt(0);

        System.out.println("Enter Height : ");
        height = cin.nextDouble();
        cin.nextLine();

        System.out.println("Enter Color : ");
        color = cin.nextLine();

        System.out.println("Enter Weight : ");
        weight = cin.nextDouble();
        cin.nextLine();

        System.out.println("Enter City : ");
        city = cin.nextLine();

    }

    Human(String name, int age) {
        System.out.println("\n2 Parameter Constructor Called\n");
        this.name = name;
        this.age = age;

        System.out.println("Enter the Details of " + name);
        System.out.println("Enter Gender : ");
        gender = cin.next().charAt(0);

        System.out.println("Enter Height : ");
        height = cin.nextDouble();
        cin.nextLine();

        System.out.println("Enter Color : ");
        color = cin.nextLine();

        System.out.println("Enter Weight : ");
        weight = cin.nextDouble();
        cin.nextLine();

        System.out.println("Enter City : ");
        city = cin.nextLine();

    }

    Human(String name, int age, double height) {
        System.out.println("\n3 Parameter Constructor Called\n");
        this.name = name;
        this.age = age;
        this.height = height;

        System.out.println("Enter Gender : ");
        gender = cin.next().charAt(0);
        cin.nextLine();

        System.out.println("Enter Color : ");
        color = cin.nextLine();

        System.out.println("Enter Weight : ");
        weight = cin.nextDouble();
        cin.nextLine();

        System.out.println("Enter City : ");
        city = cin.nextLine();

    }

    Human() {
        System.out.println("\nUnparameterized Constructor Called\n");

        System.out.println("Enter Name : ");
        name = cin.nextLine();

        System.out.println("Enter Age : ");
        age = cin.nextInt();

        System.out.println("Enter Gender : ");
        gender = cin.next().charAt(0);

        System.out.println("Enter Height : ");
        height = cin.nextDouble();
        cin.nextLine();

        System.out.println("Enter Color : ");
        color = cin.nextLine();

        System.out.println("Enter Weight : ");
        weight = cin.nextDouble();
        cin.nextLine();

        System.out.println("Enter City : ");
        city = cin.nextLine();

    }

    public void displayHuman() {
        System.out.println("\nDetails of the Human as follows");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("Height : " + height);
        System.out.println("Color : " + color);
        System.out.println("Weight : " + weight);
        System.out.println("City : " + city);
    }
}

public class S20230010123_Assignment3P2 {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.displayHuman();

        System.out.println("\n");
        Human h2 = new Human("Kiran");
        h2.displayHuman();

        System.out.println("\n");
        Human h3 = new Human("John", 20);
        h3.displayHuman();

        System.out.println("\n");
        Human h4 = new Human("Mohsin", 25, 180);
        h4.displayHuman();
    }
}
