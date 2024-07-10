package Method_in_java;

import java.util.Random;
import java.util.Scanner;

public class Guessing_No {

    public static void game() {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int computer = rand.nextInt(10);
        System.out.println("Enter the Number (You have 3 chances : 0-9) : ");
        for (int i = 0; i < 3; i++) {
            int ask = sc.nextInt();
            if (computer == ask) {
                System.out.println("You win!");
                sc.close();
                return;
            } else if (computer > ask) {
                System.out.println("The number is bigger");
            } else if (computer < ask) {
                System.out.println("The number is smaller");
            }
        }
        System.out.println("You lose! The correct number is " + computer);
        sc.close();
    }

    public static void main(String[] args) {
        game();
    }
}
