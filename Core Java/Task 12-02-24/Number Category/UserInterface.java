import java.util.Scanner;

public class UserInterface {

    public static NumberCategory checkAmicable() {

        return (num1, num2) -> {
            int sumDivisorsNum1 = 0;
            int sumDivisorsNum2 = 0;
            for (int i = 1; i <= num1 / 2; i++) {
                if (num1 % i == 0)
                    sumDivisorsNum1 += i;
            }
            for (int i = 1; i <= num2 / 2; i++) {
                if (num2 % i == 0)
                    sumDivisorsNum2 += i;
            }
            if (sumDivisorsNum1 == num2 && sumDivisorsNum2 == num1)
                return true;
            else
                return false;
        };
    }

    public static NumberCategory checkPalindrome() {

        return (num1, num2) -> {
            int product = num1 * num2;
            int temp = product;
            int reversedNum = 0;
            while (temp != 0) {
                int remainder = temp % 10;
                reversedNum = reversedNum * 10 + remainder;
                temp /= 10;
            }
            if (product == reversedNum)
                return true;
            else
                return false;
        };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int product = num1*num2;

        NumberCategory amicableChecker = UserInterface.checkAmicable();
        boolean amicableResult = amicableChecker.checkNumberCategory(num1, num2);
        if(amicableResult)
            System.out.println(num1+" and "+num2+" are amicable numbers");
        else
            System.out.println(num1+" and "+num2+" are not amicable numbers");

        NumberCategory palindromeChecker = UserInterface.checkPalindrome();
        boolean palindromeResult = palindromeChecker.checkNumberCategory(num1, num2);
        if(palindromeResult)
            System.out.println("Their Product "+product+" do produces a Palindrome");
        else
            System.out.println("Their Product "+product+" does not produce a Palindrome");

        sc.close();
    }
}
