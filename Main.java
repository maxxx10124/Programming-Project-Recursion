/** 
 *@author Yuqi Max Zhang 
 *@class_name CISC 190 
 */
import java.util.Scanner;
public class Main {
    public static int gcd(int m, int n){
        if(n > m){
            int temp  = m;
            m = n;
            n = temp;
        }
        if(m % n == 0){
            return n;
        }
        else{
            return gcd(n, m % n);
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int m = s.nextInt();
        System.out.print("Enter the second number: ");
        int n = s.nextInt();
        System.out.print("The GCD of " + m + " and " + n + " is " + gcd(m,n));
    }
}
