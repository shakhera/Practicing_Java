
package practice_java;

import java.util.Scanner;

/**
 *
 * @author SHAKHERA
 */
public class multiplication_table {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m,n,mul;
        System.out.print("Enter initial : ");
        m=input.nextInt();
        System.out.print("Enter final value : ");
        n=input.nextInt();
        for(int i=m; i<=n;i++){
            for(int j=1; j<=10;j++)
            System.out.println( i + " X "+ j +" = " + i*j);
        }
    }
    
}
