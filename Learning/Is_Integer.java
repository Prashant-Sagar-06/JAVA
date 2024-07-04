import java.util.Scanner;
public class Is_Integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if(scanner.hasNextInt()) {
            int num = scanner.nextInt();
            System.out.println("The number is: "+num);
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        scanner.close();
    }
}
