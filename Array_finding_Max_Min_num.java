package practice_java;

import java.util.Scanner;

/**
 *
 * @author SHAKHERA
 */
public class Array_finding_Max_Min_num {
    public static void main(String[] ar){
        Scanner input = new Scanner(System.in);
        int size;
        double sum=0;
        System.out.print("Enter the Array size : " );
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
        
        double max=num[0];
        for(int i=1;i<size;i++){
            if(max<num[i]){
                max=num[i];
            }
        }
        System.out.println("Maximum : "+max);
        
        double min=num[0];
        for(int i=1;i<size;i++){
            if(min>num[i]){
                min=num[i];
            }
        }
        System.out.println("Minimum : "+min);
    }
}
