#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct employees
{
    char *Name;
    char *EmployeeID;
    float basicSalary;
    int allowancePercentage;
} Employee;

int employeesCnt = -1;

void calculateSalary(Employee *employee);
void listEmployees(Employee *employee);
void getEmployeeData(Employee employeeData, int idx);
void searchEmployeebyID(Employee *employee);
void createEmployee(Employee *employee);

void calculateSalary(Employee *employee)
{
    char *EmpID = (char *)calloc(1000, 1);
    char dummy;
    printf("Enter the Employee ID to get Salary : \n");
    scanf("%c", &dummy);
    gets(EmpID);
    double salary;

    for (int i = 0; i <= employeesCnt; ++i)
        if (!strcmp(EmpID, employee[i].EmployeeID))
        {
            double basic = employee[i].basicSalary;
            int allowance = employee[i].allowancePercentage;
            salary = basic + (basic * allowance);
            printf("Salary of Employee of ID %s is %.3lf\n", EmpID, salary);
            return;
        }
    printf("\nSorry, Employee with ID %s is Not Found\n", EmpID);
};
void createEmployee(Employee *employee)
{
    if (employeesCnt + 1 >= 10)
    {
        printf("Max Employee Count (10) Reached\n");
        return;
    }
    char dummy;
    int i = ++employeesCnt;

    employee[i].Name = (char *)calloc(1000, 1);
    employee[i].EmployeeID = (char *)calloc(1000, 1);
    printf("Enter Following Details to Create Employee Data\n");
    printf("Employee Name : ");
    scanf("%c", &dummy);
    gets(employee[i].Name);

    printf("Employee ID: ");
    gets(employee[i].EmployeeID);

    printf("Employee Basic Salary : ");
    scanf("%f", &employee[i].basicSalary);

    printf("Employee Allowance Percentage : ");
    scanf("%d", &employee[i].allowancePercentage);
};
void searchEmployeebyID(Employee *employee)
{
    char *EmpID = (char *)calloc(1000, 1);
    char dummy;
    printf("Enter the Employee ID to Search : \n");
    scanf("%c", &dummy);
    gets(EmpID);

    for (int i = 0; i <= employeesCnt; ++i)
        if (!strcmp(EmpID, employee[i].EmployeeID))
        {
            getEmployeeData(employee[i], i);
            return;
        }

    printf("\nSorry, Employee of ID %s is Not Found\n", EmpID);
};

void getEmployeeData(Employee employeeData, int idx)
{
    printf("Employee Name        : %s\n", employeeData.Name);
    printf("Employee ID          : %s\n", employeeData.EmployeeID);
    printf("Employee BasicSalary : %.3f\n", employeeData.basicSalary);
    printf("Employee Allowance Percentage : %d\n", employeeData.allowancePercentage);
}

void listEmployees(Employee *employee)
{
    for (int i = 0; i <= employeesCnt; ++i)
    {
        printf("\nEmployee No %d\n", i + 1);
        getEmployeeData(employee[i], i);
    }
};
int main()
{
    printf("\nEnter any integer from 1 to 4 to execute respective operation\n");
    printf("\n1.Create Employee \n2.Search Employee by ID \n3.Calculate Salary \nList Employees\n");

    Employee *employee = (Employee *)malloc(10 * sizeof(Employee));
    while (1)
    {
        int operation;
        printf("\nEnter Operation No or -1 to exit\n");
        scanf("%d", &operation);

        switch (operation)
        {
        case 1:
            createEmployee(employee);
            break;
        case 2:
            searchEmployeebyID(employee);
            break;
        case 3:
            calculateSalary(employee);
            break;
        case 4:
            listEmployees(employee);
            break;
        default:
            return 0;
        }
    }

    return 0;
}
