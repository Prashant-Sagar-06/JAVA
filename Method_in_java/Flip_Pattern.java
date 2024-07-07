package Method_in_java;

import java.util.Scanner;

public class Flip_Pattern {
    static void Flip (int a){
        for (int i = a; i >= 1; i--) {
            for (int j = i; j>=1; j--) {
            System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of lines: ");
        int a = sc.nextInt();
        Flip(a);
        sc.close();
    }
}
