import java.util.*;

public class UserInterface {
    public static void main(String[] args) {
        Products cart = new Products();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1.Add\n2.Display\n3.Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the product");
                    String product = sc.nextLine();
                    cart.addProductToList(product);
                    break;
                case 2:
                    ArrayList<String> productList = cart.getProductList();
                    if (productList.isEmpty()) {
                        System.out.println("The list is empty");
                    } else {
                        cart.sortProductList();
                        for (String item : productList) {
                            System.out.println(item);
                        }
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
