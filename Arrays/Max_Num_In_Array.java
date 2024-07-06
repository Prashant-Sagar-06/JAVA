package Arrays;

public class Max_Num_In_Array {
    public static void main(String[] args) {
        int [] arr = {5,7,3,8,9,4};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            } else {
                continue;
            }
        } System.out.println("The maximum number in the array is: " + max);}
}
