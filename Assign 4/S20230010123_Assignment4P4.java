class operations {
    int x;
    int y;

    public int getX() {
        System.out.println("\nCalled a method without parameters but with return type\n");
        return x;
    }

    operations() {
        x = 1;
        y = 2;
    }

    public int add(int a, int b) {
        System.out.println("\nCalled a method with two parameters and a return type");
        return a + b;
    }

    operations(int x) {
        this.x = x;
        this.y = 2;
    }

    public void printMessage() {
        System.out.println("\nCalled a method without parameters and return type");
        System.out.println("Hello, World!");
    }

    public static int multiply(int a, int b) {
        System.out.println("\nCalled a method with two parameters and a return type");
        return a * b;
    }

    operations(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setValues(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void displayValues() {
        System.out.println("\nCalled a method that can access instance variables");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

public class S20230010123_Assignment4P4 {
    public static void main(String[] args) {
        operations op = new operations();

        int x = 5, y = 3;
        op.setValues(x, y);

        op.add(x, y);
        op.printMessage();
        operations.multiply(x, y);
        op.setValues(x, y);
        op.displayValues();
        op.getX();

    }
}
