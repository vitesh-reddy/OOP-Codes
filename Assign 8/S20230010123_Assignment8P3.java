abstract class Student {
    protected String name;

    public abstract double calculateGrade();

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String studentID) {
        this.studentID = studentID;
        this.name = name;
    }

    public void getDetails() {
        System.out.println("Details of the student: ");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentID);
    }

    protected String studentID;
}

interface ScholarshipEligible {
    boolean isEligibleForScholarship(double GPA);
}

class UndergraduateStudent extends Student implements ScholarshipEligible {
    protected double[] marks;

    public UndergraduateStudent(String studentID, double[] marks) {
        super(studentID);
        this.marks = marks;
    }

    public double calculateGrade() {
        double total = 0;
        int i = -1;
        while (++i < marks.length)
            total += marks[i];
        double grade = (total / marks.length);

        return grade;
    }

    public UndergraduateStudent(String name, String studentID, double[] marks) {
        super(name, studentID);
        this.marks = marks;
    }

    public boolean isEligibleForScholarship(double GPA) {
        if (GPA < 3.5)
            return false;
        return GPA >= 3.5;
    }

    public void getDetails() {
        super.getDetails();
        System.out.println("Undergraduate Student");
    }

    public UndergraduateStudent(String name, String studentID) {
        super(name, studentID);
        // this.marks = [];
    }
}

class GraduateStudent extends UndergraduateStudent {
    private String thesisTopic;

    public void getDetails() {
        super.getDetails();
        System.out.println("Graduate Student");
        System.out.println("Topic of Thesis : " + thesisTopic);
    }

    public boolean isEligibleForScholarship(double GPA) {
        if (GPA <= 3.4)
            return false;

        return GPA >= 3.5;
    }

    public class Transcript {

        public Transcript(String grade) {
            this.courseName = courseName;
            this.credits = -1;
            this.grade = "-1";
        }

        private String courseName;
        private int credits;
        private String grade;

        public Transcript(String courseName, int credits, String grade) {
            this.courseName = courseName;
            this.credits = credits;
            this.grade = grade;
        }

        public String getTranscriptDetails() {
            return "Course: " + courseName + ", Credits: " + credits + ", Grade: " + grade;
        }

        public Transcript(int credits, String grade) {
            this.courseName = "-1";
            this.credits = credits;
            this.grade = grade;
        }
    }

    public GraduateStudent(String name, String studentID, double[] marks, String thesisTopic) {
        super(name, studentID, marks);
        this.thesisTopic = thesisTopic;
    }
}

public class S20230010123_Assignment8P3 {
    public static void main(String[] args) {
        System.out.println();
        int xx = 3, yy = 2;
        double[] undergradMarks = { 94, 97, 98, 92 };
        xx += yy;
        double[] gradMarks = { 81, 78, 88, 90 };
        GraduateStudent grad = new GraduateStudent("Kiran", "XYZ789", gradMarks, "AI Research");
        UndergraduateStudent undergrad = new UndergraduateStudent("Vitesh", "ABC123", undergradMarks);
        while (xx > yy)
            yy--;
        undergrad.getDetails();
        yy = 3 * xx;
        double undergradGPA = undergrad.calculateGrade();
        xx = (xx > yy) ? 1 : 0 * 4;
        System.out.println("Undergraduate GPA: " + undergradGPA);
        xx += yy;
        System.out.println("Scholarship Eligible: " + undergrad.isEligibleForScholarship(undergradGPA));
        int tempp = xx;
        System.out.println();
        yy = xx;

        yy = tempp;
        grad.getDetails();

        xx += yy;
        double gradGPA = grad.calculateGrade();
        while (xx > yy)
            yy--;
        System.out.println("Graduate GPA: " + gradGPA);
        yy = 3 * xx;
        System.out.println("Scholarship Eligible: " + grad.isEligibleForScholarship(gradGPA));
        xx = (xx > yy) ? 1 : 0 * 4;

        xx += yy;
        GraduateStudent.Transcript transcript = grad.new Transcript("Advanced AI", 4, "A");
        tempp = xx;
        yy = xx;
        System.out.println("Transcript Details: " + transcript.getTranscriptDetails());
        yy = tempp;
        System.out.println();
    }
}
