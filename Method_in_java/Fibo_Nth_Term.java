package Method_in_java;
import java.util.Scanner;
public class Fibo_Nth_Term {
    static int fibo(int a){
        if (a <= 1) {
            return a;
        }
        int first = 0;
        int second = 1;
        int result = 0;
        for (int i = 2; i <= a; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        fibo(n);
        in.close();
    }
}
