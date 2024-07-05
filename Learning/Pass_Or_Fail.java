import java.util.Scanner;
public class Pass_Or_Fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks in subject 1st (out of 100) : ");
        int Marks = sc.nextInt();
        System.out.println("Enter Marks in subject 2nd (out of 100) : ");
        int Marks2 = sc.nextInt();
        System.out.println("Enter Marks in subject 3rd (out of 100) : ");
        int Marks3 = sc.nextInt();
        int total_Marks = Marks+Marks2+Marks3;
        System.out.print("Total Marks : ");
        System.out.println(total_Marks);
        float perc = total_Marks*100/300;
        System.out.println("Your Percentage : ");
        System.out.println(perc);
        if (perc < 33) {
            System.out.println("Fail");
        }
        else if (perc >= 33 && perc < 40 ) {
            System.out.println("Do Hard Work");
        }
        else {
            System.out.println("Pass");
        }
        sc.close();
    }
    }
