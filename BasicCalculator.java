import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a first num:");
        double num1 = input.nextDouble();

        System.out.println("Enter a second num:");
        double num2 = input.nextDouble();

        System.out.println("Enter a  operater:[*,+,-,/]");
        String opeString = input.next();

        double result = 0;
        boolean valid = true;

        if (opeString.equals("+")) {
            result = num1 + num2;
        } else if (opeString.equals("-")) {
            result = num1 - num2;
        } else if (opeString.equals("*")) {
            result = num1 * num2;
        } else if (opeString.equals("/")) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error:cannot divide by zero.");
            }
        } else {
            System.out.println("invalid operater.");
        }

        if (valid) {
            System.out.println("Result:" + result);
            input.close();
        }
    }
}
