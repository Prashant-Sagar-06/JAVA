import java.util.Scanner;
import java.util.Random;
public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int computer = rand.nextInt(3);
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissors : ");
        int user = sc.nextInt();
        if (user == computer) {
            System.out.println("It's a tie!");
        } else if (user == 0 && computer == 2 || user == 1 && computer == 0 || user == 2 && computer == 1) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
        if (user == 0) {
            System.out.println("You chose Rock");
        } else if (user == 1) {
            System.out.println("You chose Paper");
        } else {
            System.out.println("You chose Scissors");
        }
        if (computer == 0) {
            System.out.println("Computer chose Rock");
        } else if (computer == 1) {
            System.out.println("Computer chose Paper");
        } else {
            System.out.println("Computer chose Scissors");
        }
        sc.close();
    }
}
