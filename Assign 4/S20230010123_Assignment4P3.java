import java.util.Scanner;
import java.text.DecimalFormat;

class circle {
    double radius;
    double area;

    public double calculateArea(double r) {
        int a = 1, b = 3;
        int c = a + b;
        return Math.PI * Math.pow(r, 2);
    }

    circle(double r) {
        int a = 1, b = 3;
        int c = a + b;
        this.radius = r;
        this.area = this.calculateArea(r);
    }

    public double getArea() {
        return area;
    }
}

public class S20230010123_Assignment4P3 {
    static String pattern = "0000000.##";

    public static String areaFormatter(double area) {
        DecimalFormat formatter = new DecimalFormat(pattern);
        return formatter.format(area);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = 1, b = 3;
        int k = a + b;
        System.out.print("\nEnter radius : ");
        circle c = new circle(cin.nextDouble());
        a = 1;
        b = 3;
        k = a + b;
        System.out.println("Area of circle : " + c.getArea());
        System.out.println("Formatted Area : " + areaFormatter(c.getArea()));

        cin.close();
    }
}
