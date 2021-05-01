package practice_java;

import java.util.Scanner;

/**
 *
 * @author SHAKHERA
 */
public class fibonacci_series {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int num;
        num=input.nextInt();
        int a=0,b=1,c;
        System.out.print(a+"  "+b);
        for(int i=3;i<=num;i++){
            c=a+b;
            System.out.print("  " +c);
            a=b;
            b=c;
        }
        System.out.print("\n");
    }
}
