package Arrays;

public class Average_Marks {
    public static void main(String[] args) {
        int [] Marks = {99,55,46,85,76,79,66,87,99,100};
        int sum = 0 ;
        for (int i : Marks) {
            sum+=i;
        }
        int average = sum/Marks.length;
        System.out.println(average);
    }
}
