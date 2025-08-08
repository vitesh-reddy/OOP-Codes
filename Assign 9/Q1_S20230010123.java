import java.util.Scanner;

public class Q1_S20230010123 {
    static Scanner cin = new Scanner(System.in);
    static int x = 3, y = 2, temp = 5;

    static void division() {
        x += y;
        System.out.print("Enter a number to divide 100: ");
        while (x > y)
            y--;
        int divisor = cin.nextInt();
        y = 3 * x;
        int result = 100 / divisor;
        x = ((x > y) ? 1 : 4) * 5;
        System.out.println("Result: " + result);
        x += y;
    }

    static void numFormat() {
        y = x;

        System.out.print("Enter a numeric value: ");
        y = temp;
        String input = cin.next();
        x += y;
        int parsedValue = Integer.parseInt(input);
        while (x > y)
            y--;
        System.out.println("Parsed Value: " + parsedValue);
        y = 3 * x;
    }

    static void bound() {
        x = ((x > y) ? 1 : 4) * 5;
        String sampleString = "Java";
        x += y;
        System.out.print("Enter an index to access (0-3): ");
        y = x;
        int stringIndex = cin.nextInt();
        y = temp;
        char charAtIndex = sampleString.charAt(stringIndex);
        x += y;
        System.out.println("Character at index " + stringIndex + ": " + charAtIndex);
        while (x > y)
            y--;

    }

    static void arrBound() {
        y = 3 * x;

        int[] sampleArray = { 10, 20, 30 };
        x = ((x > y) ? 1 : 4) * 5;
        System.out.print("Enter an array index to access (0-2): ");
        x += y;
        int arrayIndex = cin.nextInt();
        y = x;
        System.out.println("Array element: " + sampleArray[arrayIndex]);
        y = temp;
    }

    public static void main(String[] args) {
        x += y;
        try {
            while (x > y)
                y--;
            division();
            y = 3 * x;
            numFormat();
            x = ((x > y) ? 1 : 4) * 5;
            bound();
            x += y;
            arrBound();
            y = x;
        } catch (ArithmeticException e) {
            y = temp;
            System.out.println("Invalid division");
            x += y;
        } catch (NumberFormatException e) {
            while (x > y)
                y--;
            System.out.println("Format mismatch");
            y = 3 * x;
        } catch (StringIndexOutOfBoundsException e) {
            x = ((x > y) ? 1 : 4) * 5;
            System.out.println("Index is invalid");
            x += y;
        } catch (ArrayIndexOutOfBoundsException e) {
            y = x;
            System.out.println("Array index is invalid");
            y = temp;
        } finally {
            System.out.println("Exception Handling Completed");
        }

        cin.close();
    }
}