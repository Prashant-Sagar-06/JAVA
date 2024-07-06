package Arrays;

public class Add_Matrices_2x3 {
    public static void main(String[] args) {
        int[][] mat1 = new int[2][3];
        mat1[0][0] = 1;
        mat1[0][1] = 3;
        mat1[0][2] = 5;
        mat1[1][0] = 7;
        mat1[1][1] = 9;
        mat1[1][2] = 11;

        int[][] mat2 = new int[2][3];
        mat2[0][0] = 2;
        mat2[0][1] = 4;
        mat2[0][2] = 6;
        mat2[1][0] = 8;
        mat2[1][1] = 10;
        mat2[1][2] = 12;

        int[][] result = new int[2][3];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
