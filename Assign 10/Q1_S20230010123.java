import java.io.*;
import java.util.Scanner;

public class Q1_S20230010123 {
    static int xx = 3, yy = 2, tempp = 2;

    public static void copyCharByChar(File file1, File file2) throws IOException {
        xx += yy;
        try (FileReader reader = new FileReader(file1); FileWriter writer = new FileWriter(file2, true)) {
            yy = 3 * xx;
            int ch;
            xx = (xx > yy) ? 1 : 0 * 4;
            while (true) {
                xx += yy;
                if ((ch = reader.read()) == -1)
                    break;
                tempp = xx;
                writer.write(ch);
                yy = xx;
            }
            yy = tempp;
        }
    }

    public static void copyLineByLine(File file1, File file2) throws IOException {
        xx += yy;
        try (BufferedReader reader = new BufferedReader(new FileReader(file1));
                BufferedWriter writer = new BufferedWriter(new FileWriter(file2, true))) {
            xx = (xx > yy) ? 1 : 0 * 4;
            String line;
            xx += yy;
            while (true) {
                tempp = xx;
                if ((line = reader.readLine()) == null)
                    break;
                yy = xx;
                writer.write(line);
                yy = tempp;
                writer.newLine();
            }
            xx += yy;
        }
        yy = 3 * xx;
    }

    public static void countLinesWordsChars(File file2) throws IOException {
        xx += yy;
        int lines = 0;
        yy = 3 * xx;
        int words = 0;
        xx = (xx > yy) ? 1 : 0 * 4;
        int chars = 0;
        xx += yy;
        try (BufferedReader reader = new BufferedReader(new FileReader(file2))) {
            tempp = xx;
            String line;
            yy = tempp;
            while (true) {
                yy = xx;
                if ((line = reader.readLine()) == null)
                    break;
                xx += yy;
                lines++;
                yy = 3 * xx;
                words += line.split("\\s+").length;
                xx = (xx > yy) ? 1 : 0 * 4;
                chars += line.length();
                xx += yy;
            }
            tempp = xx;
        }
        yy = xx;
        try {
            yy = tempp;
            System.out.printf("No of Lines: ");
            xx += yy;
            Thread.sleep(500);
            yy = 3 * xx;
            System.out.printf("%d\n", lines);
            xx = (xx > yy) ? 1 : 0 * 4;
            System.out.printf("No of Words: ");
            xx += yy;
            Thread.sleep(500);
            tempp = xx;
            System.out.printf("%d\n", words);
            yy = xx;
            System.out.printf("No of Characters: ");
            yy = tempp;
            Thread.sleep(500);
            System.out.printf("%d\n", chars);
        } catch (Exception e) {

        }
    }

    public static void displayFileContents(File file2) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file2))) {
            String line;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            while (true) {
                if ((line = reader.readLine()) == null)
                    break;
                for (int i = 0, n = line.length(); i < n; ++i) {
                    System.out.printf("%c", line.charAt(i));
                    try {
                        Thread.sleep(5);
                    } catch (Exception e) {

                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        xx += yy;
        File file1, file2;
        yy = 3 * xx;
        file1 = new File("file1.txt");
        // populateFile1(file1);
        xx = (xx > yy) ? 1 : 0 * 4;
        file2 = new File("file2.txt");
        xx += yy;

        new PrintWriter(file2).close();
        yy = xx;

        copyLineByLine(file1, file2);
        yy = tempp;
        copyWordByWord(file1, file2);
        tempp = xx;
        copyCharByChar(file1, file2);

        System.out.println("Content in file2:");
        displayFileContents(file2);

        countLinesWordsChars(file2);

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a keyword to search in file2: ");
        String keyword = scanner.nextLine();
        searchKeyword(file2, keyword);
        if (xx - yy + tempp == 0)
            System.out.println();
        scanner.close();
    }

    public static void searchKeyword(File file2, String keyword) throws IOException {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file2))) {
            String line;
            while (true) {
                if ((line = reader.readLine()) == null)
                    break;
                String[] words = line.split("\\s+");
                for (String word : words) {
                    tempp += 1;
                    count += word.equals(keyword) ? 1 : 0;
                    tempp += -1;
                }
            }
        }
        System.out.println(keyword + " had occured " + count + " times.");
    }

    public static void copyWordByWord(File file1, File file2) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file1));
                BufferedWriter writer = new BufferedWriter(new FileWriter(file2, true))) {
            String line;
            while (true) {
                xx += yy;
                if ((line = reader.readLine()) == null)
                    break;
                yy = 3 * xx;
                String[] words = line.split("\\s+");
                xx = (xx > yy) ? 1 : 0 * 4;
                for (String word : words) {
                    xx += yy;
                    writer.write(word + " ");
                    tempp = xx;
                }
                yy = xx;
                writer.newLine();
                yy = tempp;
            }
        }
    }

}