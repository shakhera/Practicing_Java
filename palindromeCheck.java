
package practice_java;

import java.util.Scanner;

/**
 *
 * @author SHAKHERA
 */
public class palindromeCheck {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any digit : ");
        int num,rev=0,rem;
        num=input.nextInt();
        int temp=num;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(rev==temp){
            System.out.println("The Number Is Palindrome ");
        }
        else{
            System.out.println("The Number Is Not Palindrome ");
        }
        
    }
}
