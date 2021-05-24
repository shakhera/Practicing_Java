
package practice_java;

import java.util.Scanner;

/**
 *
 * @author SHAKHERA
 */
public class Array_Sum {
    public static void main(String[] ar){
        Scanner input = new Scanner(System.in);
        int size;
        double sum=0;
        System.out.print("Enter the Array size : ");
        size = input.nextInt();
        double[] num = new double[size];
        System.out.print("Enter the Array element -> ");
        for(int i=0;i<size;i++){
            num[i]=input.nextDouble();
        }
        for(int i=0;i<size;i++){
            sum=sum+num[i];
        }
        System.out.println("Array sum is : "+sum);
    }
}
