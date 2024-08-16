import java.util.Scanner;
public class Value_FInd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of x: ");
        int x = sc.nextInt();
        int y = (int) (Math.pow(x, 5)-1/5*x*x+3*Math.sqrt(x));
        sc.close();
        System.out.println("The Value of y is: "+y);
        
    }

}
