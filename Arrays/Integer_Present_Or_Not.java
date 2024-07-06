package Arrays;
import java.util.Scanner;
public class Integer_Present_Or_Not {
    public static void main(String[] args) {
        int [] arr = {55,66,333,22,77,88,99,11,44,111};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find : ");
        int ask = sc.nextInt();
        for (int i : arr) {
            if (ask==i) {
                System.out.println("Yes Number is in array : " + ask);
            }
            else{
                System.out.println("Number is not in array");
            }
            break;
        }
        sc.close();
    }
}
