package Method_in_java;
import java.util.Scanner;
public class Celsius_to_Farheniet {
    static float cel_to_far(float a){
        return (a*9/5)+32;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        float celsius = in.nextFloat();
        System.out.println("Temperature in Celsius: "+celsius);
        System.out.println("Temperature in Farheniet: "+cel_to_far(celsius));
        in.close();
    }
}
