package Method_in_java;
import java.util.Scanner;
public class Sum_Of_Nat_Num {
    static  int sum (int a){
        int res = 0;
        for (int i = 0; i<=a; i++) {
            res+=i;
        }
        System.out.println(res);
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int total = sc.nextInt();
        sum(total);
        sc.close();
    }
}