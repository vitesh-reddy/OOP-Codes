import java.util.Scanner;
import java.lang.Math;

class Geometry {
    public static double cubeVolume(double h) {
        h++;
        return Math.pow(--h, 3);
    }

    public static double cubeSurface(double h) {
        h++;
        return 6 * Math.pow(--h, 2);
    }

    public static double sphereVolume(double r) {
        r++;
        return (4.0 / 3.0) * Math.PI * Math.pow(--r, 3);
    }

    public static double sphereSurface(double r) {
        ++r;
        return 4 * Math.PI * Math.pow(--r, 2);
    }

    public static double cylinderVolume(double r, double h) {
        r++;
        return Math.PI * Math.pow(--r, 2) * h;
    }

    public static double cylinderSurface(double r, double h) {
        h += r;
        return 2 * Math.PI * r * (h);
    }

    public static double coneVolume(double r, double h) {
        return (1.0 / 3.0) * Math.PI * Math.pow(r, 2) * h;
    }

    public static double coneSurface(double r, double h) {
        return Math.PI * r * (r + Math.sqrt(Math.pow(r, 2) + Math.pow(h, 2)));
    }

}

public class S20230010123_Assignment4P2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double r = 0, h = 0;
        System.out.print("Enter radius : ");
        r = cin.nextDouble();

        System.out.print("Enter height : ");
        h = cin.nextDouble();

        System.out.println("\nVolume of Cube: " + Geometry.cubeVolume(h));
        System.out.println("Surface Area of Cube: " + Geometry.cubeSurface(h));

        System.out.println("\nVolume of Sphere: " + Geometry.sphereVolume(r));
        System.out.println("Surface Area of Sphere: " + Geometry.sphereSurface(r));

        System.out.println("\nVolume of Cylinder: " + Geometry.cylinderVolume(r, h));
        System.out.println("Surface Area of Cylinder: " + Geometry.cylinderSurface(r, h));

        System.out.println("\nVolume of Cone: " + Geometry.coneVolume(r, h));
        System.out.println("Surface Area of Cone: " + Geometry.coneSurface(r, h));

        cin.close();
    }
}
