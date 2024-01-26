import java.util.Scanner;

public class NumberNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        String number = sc.next();
        if(number.charAt(0)=='0'){
            System.out.println("Number should not start with zero!");
            sc.close();
            return;
        }
        else{
            numbersToNames(number);
        }

        sc.close();
    }
    public static void numbersToNames(String number){
        for (int i = 0; i < number.length(); i++) {
            switch (number.charAt(i)) {
                case '0':
                    System.out.print("Zero ");
                    break;
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;
                case '6':
                    System.out.print("Six ");
                    break;
                case '7':
                    System.out.print("Seven ");
                    break;
                case '8':
                    System.out.print("Eight ");
                    break;
                case '9':
                    System.out.print("Nine ");
                    break;

                default:
                    break;
            }
        }
    }
}
