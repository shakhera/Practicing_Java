package practice_java;

import java.util.Scanner;

/**
 *
 * @author SHAKHERA
 */
public class prime_m_to_n {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0, totalPrime=0;
        System.out.print("Enter the initial value : ");
        int m = input.nextInt();
        System.out.print("Enter the last value : ");
        int n = input.nextInt();
        for (int i = m; i <= n; i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0){
                System.out.println(i);
                totalPrime++;
            }
            count = 0;
        }
        System.out.println("Total Prime number = " +totalPrime);

    }
}
