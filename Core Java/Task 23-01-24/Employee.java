public class Employee {
    protected int empId;
    protected String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void calculateSalary(){
        System.out.println("Pay Slip\n-------------");
        System.out.println("Employee ID: "+empId);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Designation: Generic Employee");
        System.out.println("Employee Sal: 20000");
        System.out.println();
    };

}