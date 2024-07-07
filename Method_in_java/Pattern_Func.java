package Method_in_java;
import java.util.Scanner;
public class Pattern_Func {
    static void pattern(int a){
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of lines: ");
        int a = sc.nextInt();
        pattern(a);
        sc.close();
    }
}
