import java.util.Scanner;
public class Compound_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount : ");
        double principal = sc.nextDouble();
        System.out.println("Enter the rate of interest : ");
        double rate = sc.nextDouble();
        System.out.println("Enter the time period : ");
        double time = sc.nextDouble();
        System.out.println("Enter the number of times that interest is compounded per unit : ");
        double n = sc.nextDouble();
        sc.close();
        double amount = principal * Math.pow(1 + rate / n, n * time);
        double compoundInterest = amount - principal;
        System.out.println("The Compound Interest is : " + compoundInterest);
    }
}
