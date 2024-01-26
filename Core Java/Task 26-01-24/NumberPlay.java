import java.util.Scanner;

public class NumberPlay {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if (num < 10 || num > 99) {
            System.out.println("Invalid Number!");
            sc.close();
            return;
        } 
        else {
            int firstDigit = num / 10;
            int secondDigit = num % 10;
            if (num > 50) {
                System.out.println(firstDigit - secondDigit);
            } else {
                System.out.println(secondDigit - firstDigit);
            }
        }

        sc.close();

    }
}
