import java.util.Scanner;
public class Same_Pat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i;j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}