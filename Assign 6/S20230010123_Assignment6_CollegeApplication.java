/*
 * For Succesfull running please rename the file to CollegeApplication.java
 * Name : KL Vitesh Reddy
 * Roll No : S20230010123
*/

import java.util.*;

class Person {

    public Person(String name, String aadharNo, String gender, String dateOfBirth) {
        this.name = name;
        this.aadharNo = aadharNo;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        System.out.println("Person named " + name + " of Age " + calculateAge() + " is created");
    }

    public int calculateAge() {
        String[] dobParts = dateOfBirth.split("-");
        int birthYear = Integer.parseInt(dobParts[2]);
        Calendar now = Calendar.getInstance();
        int currentYear = now.get(Calendar.YEAR);
        int age = currentYear - birthYear;
        return age;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String aadharNo;

    public String getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(String aadharNo) {
        this.aadharNo = aadharNo;
    }

    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private String dateOfBirth;

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}

class Student extends Person {

    public void admitStudent(String name, String aadharNo, String gender, String dateOfBirth, String instituteName) {
        setInstituteName(instituteName);
        setDateOfBirth(dateOfBirth);
        setName(name);
        System.out.println(getName() + " is admitted to " + getInstituteName());
        setAadharNo(aadharNo);
        setGender(gender);
    }

    public Student(String name, String aadharNo, String gender, String dateOfBirth, String rollNo,
            String instituteName) {
        super(name, aadharNo, gender, dateOfBirth);
        this.rollNo = rollNo;
        this.instituteName = instituteName;
    }

    public void enrollStudent(String dept, String specialization, String[] subjects, String rollNo) {
        setDept(dept);
        setSpecialization(specialization);
        System.out.println(getName() + " is enrolled in the " + getDept() + " department in " + getSpecialization()
                + " Specialization");
        setRollNo(rollNo);
        setSubjects(subjects);
    }

    private String rollNo;

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    private String instituteName;

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    private String dept;

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    private String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    private String[] subjects;

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    private int grades;

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }
}

class Faculty extends Person {

    public void assignFaculty(String dept, String specialization, String subject, int salary) {
        setDept(dept);
        setSpecialization(specialization);
        System.out
                .println(getName() + " sir assigned to " + dept + " department in " + specialization + "Specialization"
                        + " to " + subject + " subject");
        setSubject(subject);
        setSalary(salary);
    }

    public void joinFaculty(String name, String aadharNo, String gender, String dateOfBirth, String empId,
            String instituteName) {
        setInstituteName(instituteName);
        setEmpId(empId);
        setAadharNo(aadharNo);
        setName(name);
        System.out.println(getName() + " joined into " + getInstituteName() + "Institute");
        setDateOfBirth(dateOfBirth);
        setGender(gender);
    }

    public Faculty(String name, String aadharNo, String gender, String dateOfBirth, String empId,
            String instituteName) {
        super(name, aadharNo, gender, dateOfBirth);
        this.empId = empId;
        this.instituteName = instituteName;
        System.out.println(name + " joined Institute with Emp ID: " + empId);
    }

    public void assignGrades(Student student, int grade) {
        student.setGrades(grade);
        System.out.println(getName() + " sir gave " + grade + " grade points to " + student.getName());
    }

    private String empId;

    public String getEmpId() {
        return empId;
    }

    private String dept;

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    private String instituteName;

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    private String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

public class CollegeApplication {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        Student std[] = new Student[2];
        Faculty fac[] = new Faculty[2];

        for (int i = 0; i < 2; ++i) {
            System.out.println();
            System.out.println("Enter Person " + (i + 1) + " Details :");
            System.out.print("Name: ");
            String stdName = cin.nextLine();
            System.out.print("Roll No: ");
            String stdRollNo = cin.nextLine();
            System.out.print("Gender (M/F): ");
            String stdGender = cin.nextLine();
            System.out.print("Date of Birth (dd-mm-yyyy): ");
            String stdDob = cin.nextLine();
            System.out.print("Institute Name: ");
            String stdInst = cin.nextLine();
            System.out.print("Aadhar Card No: ");
            String stdAadhar = cin.nextLine();

            std[i] = new Student(stdName, stdAadhar, stdGender, stdDob, stdRollNo,
                    stdInst);

            System.out.println();
            System.out.print("Student Department: ");
            String stdDept = cin.nextLine();
            System.out.print("Specialization: ");
            String stdSpecialization = cin.nextLine();
            System.out.print("Subjects (comma-separated): ");
            String[] stdSubjects = cin.nextLine().split(",");
            std[i].enrollStudent(stdDept, stdSpecialization, stdSubjects, stdRollNo);

            System.out.println();
            System.out.println("Enter Faculty " + (i + 1) + " details :");
            System.out.print("Faculty Name: ");
            String facName = cin.nextLine();
            System.out.print("Faculty ID: ");
            String facEmpId = cin.nextLine();
            System.out.print("Institute Name: ");
            String facInst = cin.nextLine();
            System.out.print("Gender (M/F): ");
            String facGender = cin.nextLine();
            System.out.print("Date of Birth (dd-mm-yyyy): ");
            String facDob = cin.nextLine();
            System.out.print("Aadhar Card No: ");
            String facAadhar = cin.nextLine();

            fac[i] = new Faculty(facName, facAadhar, facGender, facDob, facEmpId,
                    facInst);

            System.out.println();
            System.out.print("Faculty Department: ");
            String facDept = cin.nextLine();
            System.out.print("Specialization: ");
            String facSpec = cin.nextLine();
            System.out.print("Subject: ");
            String facSubject = cin.nextLine();
            System.out.print("Salary: ");
            int facSalary = cin.nextInt();
            cin.nextLine();
            fac[i].assignFaculty(facDept, facSpec, facSubject, facSalary);

            System.out.println();
            System.out.println("Assign grades:");
            System.out.print("Grade for Student " + (i + 1) + " : ");
            int grade = cin.nextInt();
            fac[i].assignGrades(std[i], grade);
            System.out.println();
            cin.nextLine();
        }
        cin.close();
    }
}
