package OOPs;
import java.util.Scanner;
class Phone{
    String name;
    public void ringing(String name){
        System.out.println(name + " Your phone is ringing...");
    }
    public void vibrating(String name){
        System.out.println(name + " Your phone is Vibrating...");
    }
}

public class Cell_Phone {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter yout name : ");
        String name = sc.nextLine();
        Phone work = new Phone();
        work.ringing(name);
        work.vibrating(name);
        sc.close();

    }
}
