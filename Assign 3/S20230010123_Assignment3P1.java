class student {
    int rollNo;
    String name;
    double grade;
    int yearofStudy;
    String branch;

    student() {
        this.rollNo = 123;
        this.name = "Vitesh";
        this.grade = 9.4;
        this.yearofStudy = 2023;
        this.branch = "CSE";
    }

    student(int rollNo, String name, double grade, int yearofStudy, String branch) {
        this.rollNo = rollNo;
        this.name = name;
        this.grade = grade;
        this.yearofStudy = yearofStudy;
        this.branch = branch;
    }

    public void setStudent(int rollNo, String name, double grade, int yearofStudy, String branch) {
        this.rollNo = rollNo;
        this.name = name;
        this.grade = grade;
        this.yearofStudy = yearofStudy;
        this.branch = branch;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public int getYearofStudy() {
        return yearofStudy;
    }

    public String getBranch() {
        return branch;
    }
}

public class S20230010123_Assignment3P1 {
    static void displayDetails(student std) {
        System.out.println("Name :" + std.getName());
        System.out.println("RollNo : " + std.getRollNo());
        System.out.println("Grade : " + std.getGrade());
        System.out.println("Year of Study : " + std.getYearofStudy());
        System.out.println("Branch : " + std.getBranch() + "\n");
    }

    public static void main(String[] args) {
        student std1 = new student();
        std1.setStudent(123, "Vitesh", 8.8, 2023, "CSE");
        System.out.println("Details of Student 1");
        displayDetails(std1);
        student std2 = new student();
        std2.setStudent(54, "John Micheal", 9.0, 2022, "CSE");
        System.out.println("Details of Student 2");
        displayDetails(std2);

        student std3 = new student();
        std3.setStudent(288, "Venu Gopal", 8.5, 2020, "ECE");
        System.out.println("Details of Student 3");
        displayDetails(std3);

        if (std1.getGrade() > std2.getGrade() && std1.getGrade() > std3.getGrade()) {
            System.out.println("\n" + std1.getName() + " got Highest GPA (" + std1.getGrade() + ")\n");
            displayDetails(std1);
        } else if (std2.getGrade() > std1.getGrade() && std2.getGrade() > std3.getGrade()) {
            System.out.println("\n" + std2.getName() + " got Highest GPA (" + std2.getGrade() + ")\n");
            displayDetails(std2);
        } else {
            System.out.println("\n" + std3.getName() + " got Highest GPA (" + std3.getGrade() + ")\n");
            displayDetails(std3);
        }
    }
}
