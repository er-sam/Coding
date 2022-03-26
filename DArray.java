package Programs;
import java.util.Scanner;

public class DArray {
    public static void main(String[] args) {
        int a[][] = new int[4][4];
        int data;
        System.out.println("Enter data: ");

        // Scanner sc = Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                data = sc.nextInt();
                a[i][j] = data;

            }
        }


        System.out.println("New Array:");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.println(a[i][j]);

            }
        }

        sc.close();
    }
}
