import java.util.Scanner;
public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            int num2 = num*i;
            System.out.println(num +" X "+ i + " = "+ num2 );
        }
        sc.close();
    }
}