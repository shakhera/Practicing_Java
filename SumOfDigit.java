package practice_java;

import java.util.Scanner;

/**
 *
 * @author SHAKHERA
 */
public class SumOfDigit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any digit : ");
        int num,sum=0,rem;
        num=input.nextInt();
        
        while(num!=0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("sum of digit : "+sum);
    }
}
