
package practice_java;

import java.util.Scanner;

/**
 *
 * @author SHAKHERA
 */
public class Array_2D {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Array row : ");
        int row = input.nextInt();
        System.out.print("Enter Array col : ");
        
        int col = input.nextInt();
        int[][] number = new int[row][col]; //declaration & creation
        double sum=0;
        System.out.print("please Enter the 2D Array : ");
            

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                number[i][j]=input.nextInt();
            }
            
        }

         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
              System.out.print(number[i][j]);
              System.out.print(" ");
            } 
            System.out.println();
        }
    }
}
