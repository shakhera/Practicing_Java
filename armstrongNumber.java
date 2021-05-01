package practice_java;

import java.util.Scanner;

/**
 *
 * @author SHAKHERA
 */
public class armstrongNumber {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any digit : ");
        int num,sum=0,rev=0,rem;
        num=input.nextInt();
        int temp=num;
        while(num!=0){
            rem=num%10;
            sum=sum+rem*rem*rem;
            num=num/10;
        }
        if(sum==temp){
            System.out.println("The Number Is Armstrong Number ");
        }
        else{
            System.out.println("The Number Is Not Armstrong Number ");
        }
        
    }
}
