import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Enter scale (C/F): ");
        char scale = sc.next().toUpperCase().charAt(0);
        if (scale == 'C') {
            double f = (temp * 9/5) + 32;
            System.out.println("Temperature in Fahrenheit: " + f);
        } else if (scale == 'F') {
            double c = (temp - 32) * 5/9;
            System.out.println("Temperature in Celsius: " + c);
        } else {
            System.out.println("Invalid scale entered.");
        }
    }
}
