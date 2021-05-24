package practice_java;

import java.util.Scanner;

/**
 *
 * @author SHAKHERA
 */
public class Array_matrix1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] x = new int[2][3];
        int[][] y = new int[2][3];

        System.out.print("please Enter the matrix x : ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                 System.out.printf("x[%d][%d] = ", row, col);
                x[row][col] = input.nextInt();
            }
        }
        
        System.out.print("please Enter the matrix y : ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("y[%d][%d] = ", row, col);
                y[row][col] = input.nextInt();
            }
        }
        
        System.out.println("x matrix is : ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(x[row][col]+" ");
            }
            System.out.println();
        }

        
        System.out.println("y matrix is : ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(y[row][col]+" ");
            }
            System.out.println();
        }
    }
}
