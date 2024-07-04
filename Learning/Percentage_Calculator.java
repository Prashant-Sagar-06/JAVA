import java.util.Scanner;

public class Percentage_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the total marks: ");
        double totalMarks = scanner.nextDouble();
        
        System.out.print("Enter the obtained marks: ");
        double obtainedMarks = scanner.nextDouble();
        
        double percentage = (obtainedMarks / totalMarks) * 100;
        
        System.out.println("Percentage: " + percentage + "%");
        
        scanner.close();
    }
}