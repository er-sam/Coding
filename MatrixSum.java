import java.util.Scanner;

/**
 * MatrixSum
 */
public class MatrixSum {
    public static void main(String[] args) {
        int row, col, data;
        Scanner in = new Scanner(System.in); // input
        System.out.println("Matrix Addition\n..........................\n");
        System.out.println("Enter row & column: ");
        row = in.nextInt(); // input
        col = in.nextInt(); // input

        int mat1[][] = new int[row][col];  //array of matrix one
        int mat2[][] = new int[row][col];  //array of matrix two
        int sum[][] = new int [row][col];  //array of sum

        System.out.println("Enter data in Matrix one:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                data = in.nextInt();
                mat1[i][j] = data;
            }
        }

        System.out.println("Enter data in Matrix two:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                data = in.nextInt();
                mat2[i][j] = data;
            }
        }


        //Sum of matrix\
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = (mat1[i][j] + mat2[i][j]); 
            }
        }



        //printing sum
        System.out.println("Sum of Matrix:\n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(sum[i][j]+"\t");
            }
        }

        in.close();
    }
}