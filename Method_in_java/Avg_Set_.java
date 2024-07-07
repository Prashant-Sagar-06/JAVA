package Method_in_java;
import java.util.Scanner;
public class Avg_Set_ {
    static int avg(int...args) {
        int sum = 0;
        for (int i : args) {
            sum += i;
        }
        return sum / args.length;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("The average of the elements is: " + avg(arr));
        in.close();
    }
}
