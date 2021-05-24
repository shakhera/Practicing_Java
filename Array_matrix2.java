package practice_java;

import java.util.Scanner;

/**
 *
 * @author SHAKHERA
 */
public class Array_matrix2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] x = new int[2][3];
        int[][] y = new int[2][3];
        int[][] add = new int[2][3];

        System.out.println("please Enter the matrix x : ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("x[%d][%d] = ", row, col);
                x[row][col] = input.nextInt();
            }
        }

        System.out.println("please Enter the matrix y : ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("y[%d][%d] = ", row, col);
                y[row][col] = input.nextInt();
            }
        }

        System.out.print("x = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + x[row][col] + " ");
            }
            System.out.println();
        }

        System.out.print("y = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + y[row][col] + " ");
            }
            System.out.println();
        }

        //adding x and y matrix
        System.out.print("x+y= ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                add[row][col] = x[row][col] + y[row][col];
                System.out.print("\t " + (add[row][col]));
                //System.out.print("\t " +(x[row][col] + y[row][col]));

            }
            System.out.println();
        }
        
        //sub of x and y matrix
        System.out.print("x+y= ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t " +(x[row][col] - y[row][col]));

            }
            System.out.println();
        }
    }
}
