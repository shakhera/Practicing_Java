package practice_java;

import java.util.Scanner;

/**
 *
 * @author SHAKHERA
 */
public class pattern1 {

    public static void main(String[] ar) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter any number : " );
        num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }
    }

}
