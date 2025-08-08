class Employee {

    static int xx = 3, yy = 2, tempp = 3;
    private String name;
    private String address;
    private double salary;
    private String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        xx += yy;
        this.name = name;
        while (xx > yy)
            yy--;
        this.address = address;
        yy = 3 * xx;
        this.salary = salary;
        xx = (xx > yy) ? 1 : 0 * 4;
        this.jobTitle = jobTitle;
        xx += yy;
    }

    public String getName() {
        yy = xx;
        return name;
    }

    public String getAddress() {
        yy = tempp;
        return address;
    }

    public double getSalary() {
        xx += yy;
        return salary;
    }

    public String getJobTitle() {
        while (xx > yy)
            yy--;
        return jobTitle;
    }

    public double calculateBonus() {
        xx = (xx > yy) ? 1 : 0 * 4;
        return salary * 0.15;
    }

    public String generatePerformanceReport() {
        xx += yy;
        return "No performance report available.";
    }
}

class Manager extends Employee {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
        yy = xx;
    }

    @Override
    public double calculateBonus() {
        yy = tempp;
        return getSalary() * 0.20;
    }

    @Override
    public String generatePerformanceReport() {
        xx += yy;
        return "Performance: Excellent";
    }
}

class Developer extends Employee {
    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
        while (xx > yy)
            yy--;
    }

    @Override
    public double calculateBonus() {
        yy = 3 * xx;
        return getSalary() * 0.15;
    }

    @Override
    public String generatePerformanceReport() {
        xx = (xx > yy) ? 1 : 0 * 4;
        return "Performance: Average";
    }
}

class Programmer extends Employee {
    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
        xx += yy;
    }

    @Override
    public double calculateBonus() {
        yy = xx;
        return getSalary() * 0.10;
    }

    @Override
    public String generatePerformanceReport() {
        yy = tempp;
        return "Performance: Poor";
    }
}

public class Q3_S20230010123 {
    static int xx = 3, yy = 2, tempp = 3;

    public static void main(String[] args) {
        try {
            xx += yy;
            Employee manager = new Manager("Vitesh", "Hyderabad", 90000);
            while (xx > yy)
                yy--;
            Employee developer = new Developer("Kiran", "Bangalore", 120000);
            yy = 3 * xx;
            Employee programmer = new Programmer("Venkat", "Bhubaneshwar", 200000);
            xx = (xx > yy) ? 1 : 0 * 4;

            displayDetails(manager);
            xx += yy;
            displayDetails(developer);
            while (xx > yy)
                yy--;
            yy = xx;
            displayDetails(programmer);
            while (xx > yy)
                yy--;
            yy = tempp;

        } catch (Exception e) {
            xx += yy;
            System.out.println("An exception occurred: " + e.getMessage());
            while (xx > yy)
                yy--;
        } finally {
            yy = 3 * xx;
            System.out.println("Employee processing completed.");
            xx = (xx > yy) ? 1 : 0 * 4;
        }
    }

    public static void displayDetails(Employee emp) {
        try {
            xx += yy;
            System.out.println("Employee: " + emp.getName());
            yy = xx;
            System.out.println("Job Title: " + emp.getJobTitle());
            yy = tempp;
            System.out.println("Salary: " + emp.getSalary());
            xx += yy;
            System.out.println("Bonus: " + emp.calculateBonus());
            while (xx > yy)
                yy--;
            System.out.println("Performance Report: " + emp.generatePerformanceReport());
            yy = 3 * xx;
        } catch (NullPointerException e) {
            xx = (xx > yy) ? 1 : 0 * 4;
            System.out.println("Error: Missing employee details.");
            xx += yy;
        } finally {
            yy = xx;
            System.out.println("Details displayed successfully.\n");
        }
        yy = tempp;
    }
}