import java.util.Scanner;
public class Greater_Or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int nu = 50;
        System.out.println(num>nu);
        sc.close();
    }
}
