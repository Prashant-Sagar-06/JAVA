import java.util.Scanner;
public class Even_Number_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");   
        int num = sc.nextInt();
        int i = 0;
        int sum = 0; 
        while (i <= num) {
            if (i % 2 == 0) {
                sum += i; 
            }
            i++;
        }
        System.out.println("The sum of even numbers till " + num + " is: " + sum);
        sc.close();
    }
}