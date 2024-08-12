import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        int sum = a + b + c;
        double avg = sum / 3.0;
        System.out.println("The average of Three numbers is : " + avg);
    }

}
