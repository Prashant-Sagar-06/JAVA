package Arrays;

public class Sum_Of_Five_Arrays {
    public static void main(String[] args) {
        float [] arr = {10.5f,85.9f,66.3f,55.4f,99.9f};
        float result = 0;
        for (float f : arr) {
            result+=f;
        }
        System.out.println(result);
    }
}
