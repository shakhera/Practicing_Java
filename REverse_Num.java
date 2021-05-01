
package practice_java;

import java.util.Scanner;

/**
 *
 * @author SHAKHERA
 */
public class REverse_Num {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num,rev=0,rem;
        num=input.nextInt();
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("sum of digit : "+rev);
    }
}
