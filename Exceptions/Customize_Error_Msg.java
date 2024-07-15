package Exceptions;

public class Customize_Error_Msg {
    public static void main(String[] args) {
        // Arithmetic Exception
        int y = 5;
        int z = 0;
        try {
            int result = y / z;
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("HaHa! You can't divide by zero!");
        }
        //illegal argument exception
        try {
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println("The 6th number is: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("HeHe! You are trying to access an element that doesn't exist!");
        }
    }
}
