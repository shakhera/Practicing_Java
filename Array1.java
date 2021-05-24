
package practice_java;

import java.util.Scanner;

/**
 *
 * @author SHAKHERA
 */
public class Array1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Array size : ");
        int num = input.nextInt();
        double[] number = new double[num]; //declaration & creation
        double sum=0;
        System.out.print("please Enter the Array : ");
            
//        number[0]=input.nextDouble();
//        number[1]=input.nextDouble();
//        number[2]=input.nextDouble();
//        number[3]=input.nextDouble();
//        number[4]=input.nextDouble();
        for(int i=0;i<num;i++){
            number[i]=input.nextDouble();
        }
    
//        sum = number[0]+ number[1] + number[2] + number[3]+ number[4];
//        System.out.println("Sum of Array are : "+sum);
        for(int i=0;i<num;i++){
            sum=sum+number[i];
        }
     System.out.println("Sum of Array are : "+sum);
     System.out.println("Average of the Array : "+sum/num);
    }
}
