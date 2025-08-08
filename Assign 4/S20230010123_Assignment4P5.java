public class S20230010123_Assignment4P5 {
    static int getMax(int... x) {
        System.out.println("\nNo of Arguments passed : " + x.length);
        int maxx = Integer.MIN_VALUE;
        int a = 1, b = 3;
        int c = a + b;
        System.out.printf("Maximum Element among ");
        for (int it : x) {
            System.out.printf("%d ", it);
            maxx = Math.max(maxx, it);
            c++;
        }
        return maxx;
    }

    public static void main(String[] args) {
        int x = 1, y = 3, z = 2;
        int maxEle;

        x++;
        y--;
        --z;
        maxEle = getMax(1, 2);
        x++;
        y--;
        --z;
        System.out.println("is " + maxEle);
        maxEle = getMax(5, 3, 29, 42, 23, 91, 19, -3);
        System.out.println("is " + maxEle);
        x++;
        y--;
        --z;
        maxEle = getMax(1, 4, 3, 4, 4, 5);
        x++;
        y--;
        --z;
        System.out.println("is " + maxEle);
        x++;
        y--;
        --z;
        return;
    }
}
