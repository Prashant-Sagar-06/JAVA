package Arrays;

public class Sorted_Array {
    public static void main(String[] args) {
        int [] arr = {5,6,88,1,99,65,27};
        int [] sorted_arr = new int[arr.length];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sorted_arr[i] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (sorted_arr[i] > sorted_arr[j]) {
                    int temp = sorted_arr[i];
                    sorted_arr[i] = sorted_arr[j];
                    sorted_arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(sorted_arr[i] + " ");
        }
        
    }
    
}
