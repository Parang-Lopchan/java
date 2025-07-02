import java.util.Scanner;

public class TemConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("this is a temperature converter app.");
        System.out.println("Enter a temperature:");
        double temperature = input.nextDouble();

        System.out.println("Enter a temperature unit:[c,f]");
        String unit = input.next();

        double c,f;

        if (unit.equals("c")) {
            f = (temperature * 9 / 5) + 32;
            System.out.println("temperature in farenhait:"+f);
        } else if (unit.equals("f")) {
            c = (temperature - 32) * 5 / 9;
            System.out.println("temperature in celsius:"+c);
        }

        else {
            System.out.println("invalid input.");
        }
        input.close();

    }
}
