import java.util.Scanner;
public class Kilometer_To_Miles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in Kilometers: ");
        double km = scanner.nextDouble();
        double miles = km * 0.621371;
        System.out.println("The distance in miles is: "+miles); 
        scanner.close();    

    }
}
