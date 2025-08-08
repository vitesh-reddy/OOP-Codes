class Human {
    public String name;
    public int age;
    private double salary;

    Human(String N, int a, double s) {
        this.name = N;
        this.age = a;
        this.salary = s;
    }

    void compute() {
        System.out.println("\nCalled compute method with Zero Arguments");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
    }

    void compute(String N) {
        System.out.println("\nCalled compute method with 1 Argument");
        this.name = N;
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
    }

    void compute(String N, int a) {
        System.out.println("\nCalled compute method with 2 Arguments");
        this.name = N;
        System.out.println("Name : " + name);
        this.age = a;
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
    }

    void compute(String N, int a, double s) {
        System.out.println("\nCalled compute method with 3 Arguments");
        this.name = N;
        System.out.println("Name : " + name);
        this.age = a;
        System.out.println("Age : " + age);
        this.salary = s;
        System.out.println("Salary : " + salary);
    }
}

public class S20230010123_Assignment4P1 {
    public static void main(String[] args) {
        Human h = new Human("Kiran", 22, 120000.0);

        h.compute();
        h.compute("Vitesh");
        h.compute("Aditya", 19);
        h.compute("Swaroop", 20, 100000.0);
    }

}