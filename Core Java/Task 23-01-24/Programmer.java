public class Programmer extends Employee {
    private double baseSal;

    public double getBaseSal() {
        return baseSal;
    }

    public void setBaseSal(double baseSal) {
        this.baseSal = baseSal;
    }

    public Programmer(int empId, String name, double baseSal) {
        super(empId, name);
        this.baseSal = baseSal;
    }

    @Override
    public void calculateSalary() {
        double allowance = baseSal*0.55;
        double totalSal = baseSal + allowance;
        System.out.println("Pay Slip\n-------------");
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Designation: Programmer");
        System.out.println("Total Sal: " + totalSal);
        System.out.println();
    }

}
