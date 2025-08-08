import java.util.Scanner;

class Employee {
    public String Name;
    public int EmpID;
    public double basicSalary;
    public int allowance;
    public boolean loan;
    public float leaves;
    public String courses[];

    public void DisplayEmployeebyRecords() {
        System.out.println("\nDetails of Employee with ID " + EmpID + " :");
        System.out.println("Name: " + Name + "");
        System.out.println("Basic Salary: " + basicSalary + "");
        System.out.println("Allowance Percentage: " + allowance + "");
        System.out.println("Loan Eligibility: " + loan + "");
        System.out.println("No of Leaves: " + leaves + "");
        displaycourses();
    }

    public void calculateSalary() {
        System.out
                .println("Salary of Employee of ID " + EmpID + " is " + (basicSalary + (basicSalary * allowance)) + "");
    }

    public void ShowNoOfLeaves() {
        System.out.println("No of Leaves of Employee of ID " + EmpID + "are " + leaves + "");
    }

    public void coursenames() {
        Scanner cin = new Scanner(System.in);
        System.out.print("enter no.of courses: ");
        int numCourses = cin.nextInt();
        cin.nextLine();
        courses = new String[numCourses];
        for (int i = 0; i < numCourses; i++) {
            System.out.print("enter the name of course " + (i + 1) + ": ");
            courses[i] = cin.nextLine();
            cin.nextLine();
        }

        cin.close();
    }

    public void displaycourses() {
        System.out.println("courses taken by " + Name + ":");
        for (String course : courses)
            System.out.println("- " + course);
        System.out.println();
    }

};

class S20230010123_Assignment2 {
    public static Scanner cin = new Scanner(System.in);
    public static Employee emp[] = new Employee[10];

    public static int cnt = 0;

    public static void listEmployees() {

        if (cnt == 0) {
            System.out.println("Employees Count is Zero");
            return;
        }

        for (int i = 0; i < cnt; ++i) {
            emp[i].DisplayEmployeebyRecords();
        }
    }

    static void createEmployee() {
        if (cnt == 9) {
            System.out.println("Max Employee Count Reached\n");
            return;
        }

        emp[cnt] = new Employee();
        System.out.println("Enter name: ");
        cin.nextLine();

        emp[cnt].Name = cin.nextLine();
        System.out.println("Enter EmpID: ");
        emp[cnt].EmpID = cin.nextInt();
        cin.nextLine();

        System.out.println("Enter basic salary: ");
        emp[cnt].basicSalary = cin.nextDouble();
        cin.nextLine();

        System.out.println("Enter allowance percentage: ");
        emp[cnt].allowance = cin.nextInt();
        cin.nextLine();

        System.out.println("Enter Loan Eligibility (Enter true or false): ");
        emp[cnt].loan = cin.nextBoolean();
        cin.nextLine();

        System.out.println("Enter no of leaves: ");
        emp[cnt].leaves = cin.nextFloat();
        cin.nextLine();

        emp[cnt].coursenames();

        ++cnt;
    }

    public static Employee getEmpBYID(int id) {
        for (int i = 0; i < cnt; ++i)
            if (id == emp[i].EmpID)
                return emp[i];

        System.out.println("Employee with ID " + id + " doesn't Exist");
        return null;
    }

    public static void main(String[] args) {
        // Scanner cin = new Scanner(System.in);

        System.out.println("Enter number to execute respective operation\n");
        System.out.println("1.create Employee");
        System.out.println("2.Display Employee Details by ID");
        System.out.println("3.Calculate Employee Salary");
        System.out.println("4.Display all employees details");
        System.out.println("5.Show no of leaves");

        while (true) {
            int operation;
            System.out.println("\nChoose any Operation");
            operation = cin.nextInt();

            int empid;
            Employee curr;

            switch (operation) {
                case 1:
                    createEmployee();
                    break;

                case 2:
                    System.out.println("Enter Employee ID to get Details");
                    empid = cin.nextInt();
                    curr = getEmpBYID(empid);
                    if (curr == null)
                        break;

                    curr.DisplayEmployeebyRecords();
                    break;

                case 3:
                    System.out.println("Enter Employee ID to get Details");
                    empid = cin.nextInt();
                    curr = getEmpBYID(empid);
                    if (curr == null)
                        break;

                    curr.calculateSalary();
                    break;

                case 4:
                    listEmployees();
                    break;

                case 5:
                    System.out.println("Enter Employee ID to get Details");
                    empid = cin.nextInt();
                    curr = getEmpBYID(empid);
                    if (curr == null)
                        break;

                    System.out.println("No of Leaves of employee of ID " + empid + " are " + curr.leaves);
                    break;

                default:
                    cin.close();
                    return;
            }
        }

    }

}