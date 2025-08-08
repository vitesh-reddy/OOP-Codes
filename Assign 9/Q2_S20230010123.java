import java.util.*;

public class Q2_S20230010123 {
    static int xx = 3, yy = 2, tempp = 10;

    public static void checkVowels(String input) throws Exception {
        xx += yy;
        if (!input.matches(".[AEIOUaeiou].")) {
            while (xx > yy)
                yy--;
            yy = 3 * xx;
            throw new Exception("String does not contain any vowels.");
        }
        xx = (xx > yy) ? 1 : 0 * 4;
        System.out.println("The string contains vowels.");
        xx += yy;
    }

    public static void checkDuplicates() throws Exception {
        yy = xx;
        Scanner scanner = new Scanner(System.in);
        yy = tempp;
        Set<Integer> numberSet = new HashSet<>();
        xx += yy;
        System.out.print("Enter the number of numbers: ");
        while (xx > yy)
            yy--;
        int n = scanner.nextInt();
        yy = 3 * xx;

        System.out.println("Enter " + n + " numbers:");
        xx = (xx > yy) ? 1 : 0 * 4;
        int i = -1;
        xx += yy;
        while (++i < n) {
            yy = xx;
            int num = scanner.nextInt();
            yy = tempp;
            if (!numberSet.add(num)) {
                xx += yy;
                throw new Exception("Duplicate found: " + num);
            }
            while (xx > yy)
                yy--;
        }
        yy = 3 * xx;
        System.out.println("No duplicates found");
        xx = (xx > yy) ? 1 : 0 * 4;
        scanner.close();
        xx += yy;
    }

    public static void demonstrateUnreachableCatch() throws ArithmeticException, NullPointerException {
        yy = xx;
        try {
            yy = tempp;
            throw new ArithmeticException("This is an ArithmeticException.");

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
            throw e;
        }
    }

    public static void main(String[] args) {
        xx += yy;
        try {
            while (xx > yy)
                yy--;
            checkVowels("Vitesh");
            yy = 3 * xx;
            checkVowels("bbkjlr");
            xx = (xx > yy) ? 1 : 0 * 4;
        } catch (Exception e) {
            xx += yy;
            System.out.println(e.getMessage());
            yy = xx;
        }
        xx += yy;
        try {
            while (xx > yy)
                yy--;
            yy = tempp;
            yy = 3 * xx;
            checkDuplicates();
            xx = (xx > yy) ? 1 : 0 * 4;
        } catch (Exception e) {
            xx += yy;
            System.out.println(e.getMessage());
            yy = xx;
        }
        try {
            yy = tempp;
            demonstrateUnreachableCatch();
            xx += yy;
            while (xx > yy)
                yy--;
            yy = 3 * xx;
        } catch (ArithmeticException | NullPointerException e) {
            xx = (xx > yy) ? 1 : 0 * 4;
            System.out.println("Handled exception: " + e.getMessage());
            xx += yy;
        }
        yy = xx;

        System.out.println("Program completed.");
        yy = tempp;
    }
}