import java.util.Scanner;
import java.time.DayOfWeek;
public class Week_Day {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Number from 1 to 7 : ");
        int num = sc.nextInt();
        switch(num){
            case 1:
                System.out.println("Day is : "+DayOfWeek.MONDAY);
                break;
            case 2:
                System.out.println("Day is : "+DayOfWeek.TUESDAY);
                break;
            case 3:
                System.out.println("Day is : "+DayOfWeek.WEDNESDAY);
                break;
            case 4:
                System.out.println("Day is : "+DayOfWeek.THURSDAY);
                break;
            case 5:
                System.out.println("Day is : "+DayOfWeek.FRIDAY);
                break;
            case 6:
                System.out.println("Day is : "+DayOfWeek.SATURDAY);
                break;
            case 7:
                System.out.println("Day is : "+DayOfWeek.SUNDAY);
                break;
            default:
                System.out.println("Invalid Input");
        }
        sc.close();
    }
}