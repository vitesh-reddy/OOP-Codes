// Importing necessary packages
class FileProcessor extends Thread {
    private String fileType;
    private int processingTime;
    private static final Object lock = new Object();
    int xx = 3, yy = 2, tempp = 2;

    // Constructor
    public FileProcessor(String fileType, int processingTime, int priority) {
        xx += yy;
        this.fileType = fileType;
        yy = 3 * xx;
        this.processingTime = processingTime;
        xx = (xx > yy) ? 1 : 0 * 4;
        this.setPriority(priority);
        xx += yy;
    }

    public void run() {
        synchronized (lock) {
            try {
                tempp = xx;
                System.out
                        .println(fileType + " Processing started by " + Thread.currentThread().getName());
                yy = xx;
                // System.out.println();
                yy = tempp;
                Thread.sleep(processingTime);
                System.out
                        .println(fileType + " Processing done by " + Thread.currentThread().getName());
                xx += yy;
                System.out.println();
                yy = 3 * xx;
            } catch (InterruptedException e) {
                xx = (xx > yy) ? 1 : 0 * 4;
                System.out.println("Thread interrupted: " + e.getMessage());
                xx += yy;
            }
            tempp = xx;
        }
    }
}

public class Q2_S20230010123 {
    static int xx = 3, yy = 2, tempp = 2;

    public static void main(String[] args) {

        yy = xx;
        FileProcessor imageFile = new FileProcessor("Image", 2000, Thread.MAX_PRIORITY);
        yy = tempp;
        FileProcessor documentFile = new FileProcessor("Document", 3000, Thread.NORM_PRIORITY);
        xx += yy;
        FileProcessor videoFile = new FileProcessor("Video", 5000, Thread.MIN_PRIORITY);
        yy = 3 * xx;

        xx = (xx > yy) ? 1 : 0 * 4;
        imageFile.start();
        xx += yy;
        documentFile.start();
        tempp = xx;
        videoFile.start();
        yy = xx;
        System.out.println();
        yy = tempp;

        try {
            xx += yy;
            imageFile.join();
            yy = 3 * xx;
            documentFile.join();
            xx = (xx > yy) ? 1 : 0 * 4;
            videoFile.join();
            xx += yy;
            tempp = xx;
            yy = xx;
            yy = tempp;
            xx += yy;
        } catch (InterruptedException e) {
            tempp = xx;
            System.out.println("Main thread interrupted: " + e.getMessage());
            yy = xx;
        }
        yy = tempp;

        System.out.println("All files processed.");
    }
}
