package practice_java;

import java.util.Scanner;

/**
 *
 * @author SHAKHERA
 */
public class factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, fact = 1;
        System.out.print("Enter any positive value : ");
        num = input.nextInt();
        
        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.print("Factorial of" + num + "is : " + fact);
    }
}
