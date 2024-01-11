public class Employee{
    private int eid;
    private String name;
    private double salary;

    public Employee(int eid, String name, double salary) {
        this.eid = eid;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        String str = String.format("EID: %d \nName: %s \nSalary: %d\n",eid,name,salary);

        return str;
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(1001,"Sameer",50000);
        Employee e2 = new Employee(1002,"Surya",55000);
        Employee e3 = new Employee(1003,"Vignesh",40000);

        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());

    }


}