import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int userNum;
        int count = 0;
        int gaussNumber = random.nextInt(100) + 1;

        do {
            System.out.println("Enter a number:");
            userNum = input.nextInt();
            count++;

            if (userNum > gaussNumber) {
                System.out.println("Too high number! try again.");
            } else if (userNum < gaussNumber) {
                System.out.println("Too low ! try again.");
            } else {
                System.out.println("congratulation! you guessed it in  " + count + "  counts");
            }
        } while (userNum != gaussNumber);
        input.close();

    }
}
