package JavaVideo;

import java.util.Random;
import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("please input yours number");
            int guessNumber = scan.nextInt();
            if (guessNumber > number) {
                System.out.println("Tt is a bit larger");

            } else if (guessNumber < number) {
                System.out.println("it is slightly small");

            } else {
                System.out.println("yes");
                break;
            }

        }
    }
}