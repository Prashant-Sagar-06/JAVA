package OOPs;
import java.util.Scanner;
    class Square{
        int side;
        public int area(int side){
            System.out.println("The area of Square is : " + side*side);
            return side*side;
        }
        public int peri(int side){
            System.out.println("The Perimeter of Square is : " + 4*side);
            return 4*side;
        }
    }
public class Shape {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter side of Square : ");
        int side = sc.nextInt();
        Square calc = new Square();
        calc.area(side);
        calc.peri(side);
        sc.close();
    }
}
