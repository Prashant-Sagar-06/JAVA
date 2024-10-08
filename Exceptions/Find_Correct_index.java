package Exceptions;

class MaxTriesExceededException extends Exception {
    public MaxTriesExceededException(String message) {
        super(message);
    }
}

class customException extends Exception {
    public customException(String message) {
        super(message);
    }
}

public class Find_Correct_index {
    public static void main(String[] args) throws MaxTriesExceededException ,customException{
        int[] numbers = {1, 2, 3, 4, 5};
        int maxTries = 5;
        int tryCount = 0;
        int index = -1;

        while (tryCount < maxTries && (index < 0 || index >= numbers.length)) {
            try {
                System.out.print("Enter an index: ");
                index = Integer.parseInt(System.console().readLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid index.");
            }
            tryCount++;
        }

        if (index >= 0 && index < numbers.length) {
            System.out.println("The number at index " + index + " is: " + numbers[index]);
        } else {
            throw new customException("Bhai nikal boht hua");
        }
    }
}
