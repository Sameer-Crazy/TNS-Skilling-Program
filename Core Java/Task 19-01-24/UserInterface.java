import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Student Id");
        int studentId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student Name");
        String studentName = sc.nextLine();
        System.out.println("Enter Department Name");
        String department = sc.nextLine();
        System.out.println("Enter Gender");
        String gender = sc.nextLine();
        System.out.println("Enter Category");
        String category = sc.nextLine();
        System.out.println("Enter College Fee");
        double collegeFee = sc.nextDouble();

        if(category.equals("DayScholar")){    
            System.out.println("Enter Bus Number");
            int busNumber = sc.nextInt();
            System.out.println("Enter Distance");
            float distance = sc.nextFloat();

            DayScholar student = new DayScholar(studentId,studentName,department,gender,category,collegeFee,busNumber,distance);
            System.out.println("Total College Fee is "+student.calculateTotalFee());
        }
        else if(category.equals("Hosteller")){    
            System.out.println("Enter the Room Number");
            int roomNumber = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the Block Name");
            char blockName = sc.nextLine().charAt(0);
            System.out.println("Enter the Room Type");
            String roomType = sc.nextLine();

            Hosteller student = new Hosteller(studentId,studentName,department,gender,category,collegeFee,roomNumber,blockName,roomType);
            System.out.println("Total College Fee is "+student.calculateTotalFee());
        }

        sc.close();
    }
}
