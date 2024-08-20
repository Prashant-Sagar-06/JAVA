import java .util.Scanner;
public class Cube_Upto_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        for (int i = 1; i <= num; i++) {
            System.out.println("Cube of " + i + " is " + i * i * i);
        }
        
    }
}