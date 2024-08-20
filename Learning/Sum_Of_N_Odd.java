import java.util.Scanner;
public class Sum_Of_N_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd number is: " + i);
                sum += i;
            }
        }
        System.out.println("Sum of first 10 odd numbers is: " + sum);
        sc.close();
    }
}
