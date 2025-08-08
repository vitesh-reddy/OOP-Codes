import java.time.LocalDate;

class Date {

    public int getDay() {
        return day;
    }

    public void setYear(long year) {
        this.year = year;
    }

    Long year;
    String month;
    int day;

    public String getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Date() {
        LocalDate date = LocalDate.now();
        this.year = (long) (date.getYear());
        this.month = (String) date.getMonth().name();
        this.day = (int) date.getDayOfMonth();
    }

    void display() {
        System.out.println("\n\nToday date is : " + day + " " + month + " " + year +
                "\n");
    }

    public long getYear() {
        return year;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Date(String dob) {
        this.day = Integer.parseUnsignedInt(dob.substring(0, 2));
        this.month = dob.substring(3, 5);
        this.year = (long) Integer.parseUnsignedInt(dob.substring(6, 10));
    }
};

public class S20230010123_Assignment5P1 {
    public static void main(String[] args) {
        Date d = new Date();
        d.display();
    }
};
