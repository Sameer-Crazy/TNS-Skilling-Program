import java.util.Scanner;

public class OxygenPlants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the room (in m)");
        int roomLength = sc.nextInt();
        if(roomLength<=0){
            System.out.println("Invalid length");
            sc.close();
            return;
        }

        System.out.println("Enter the breadth of the room (in m)");
        int roomBreadth = sc.nextInt();
        if(roomBreadth<=0){
            System.out.println("Invalid breadth");
            sc.close();
            return;
        }

        System.out.println("Enter the plant area of single plant (in cm2)");
        double plantArea = sc.nextDouble();
        if(plantArea<=0){
            System.out.println("Invalid plant area");
            sc.close();
            return;
        }

        plantArea = plantArea/(100*100);
        int roomArea = roomLength*roomBreadth;
        int totalPlants = (int)((roomArea/plantArea)/10)*10;
        double oxygenAmount = totalPlants*0.9;

        System.out.println("Total number of plants is "+totalPlants);
        System.out.printf("Total oxygen production is %.2f litres",oxygenAmount);

        sc.close();
    }
}