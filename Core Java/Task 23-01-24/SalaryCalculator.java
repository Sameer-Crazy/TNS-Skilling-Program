import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of Employees");
        int n = sc.nextInt();
        sc.nextLine();

        Employee[] employees = new Employee[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter Employee ID");
            int empId = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Employee Name");
            String name = sc.nextLine();
            System.out.println("Enter Employee Designation");
            String designation = sc.nextLine();
            if(designation.equals("Generic")){
                employees[i] = new Employee(empId, name);
            }
            else if(designation.equals("Manager")){
                System.out.println("Enter Base Salary");
                int baseSal = sc.nextInt();
                sc.nextLine();
                employees[i] = new Manager(empId, name, baseSal);
            }
            else if(designation.equals("Programmer")){
                System.out.println("Enter Base Salary");
                int baseSal = sc.nextInt();
                sc.nextLine();
                employees[i] = new Programmer(empId, name, baseSal);
            }
        }

        System.out.println("\nPrinting Payslip for all the employees....\n");

        for(int i=0;i<employees.length;i++){
            employees[i].calculateSalary();
        }

        sc.close();
    }
}
