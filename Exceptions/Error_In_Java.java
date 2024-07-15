package Exceptions;

public class Error_In_Java {
    public static void main(String[] args) {
        // Syntax Error
        int x = 10;
        System.out.println("The value of x is: " + x);
        
        // Logic Error
        int y = 5;
        int z = 0;
        int result = y / z;
        System.out.println("The result is: " + result);
        
        // Runtime Error
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("The 6th number is: " + numbers[5]);
    }
}
