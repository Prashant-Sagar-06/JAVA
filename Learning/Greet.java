import java.util.Scanner;
public class Greet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.println("Hello"+" "+name+" "+"Have a nice day!");
        scanner.close();

    }
}
