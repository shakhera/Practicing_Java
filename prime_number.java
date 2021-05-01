package practice_java;
import java.util.Scanner;
/**
 *
 * @author SHAKHERA
 */
public class prime_number {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num, count=0;
        System.out.print("Enter the value : ");
        num = input.nextInt();
        for(int i=2;i<num;i++){
            if(num%i==0){
                count++;
                break;
            }
        }
        if(count==0)
            System.out.print("Prime Number");
        else
            System.out.print("Not Prime Number");
    }
}
