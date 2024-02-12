import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Country country = new Country();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1.Add\n2.Search\n3.Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the country name");
                    String countryName = sc.nextLine();
                    System.out.println("Enter the capital name");
                    String capitalName = sc.nextLine();
                    country.add(countryName, capitalName);
                    break;
                case 2:
                    if(country.getCountryMap().isEmpty()){
                        System.out.println("The map is empty");
                    }
                    else{
                        System.out.println("Enter the country name");
                        String searchCountry = sc.nextLine();
                        System.out.println(country.search(searchCountry));
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using the application");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        } while (choice != 3);

        sc.close();
    }
}
