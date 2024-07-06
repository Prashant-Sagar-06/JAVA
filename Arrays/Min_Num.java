package Arrays;

public class Min_Num {
    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 6, 4, 2};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The Minimum value of Array is: " + min);
    }
}
