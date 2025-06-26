//it should print the numbers in the given range which are not divisible by 10 or 11 
//and whose reverse is greater than or equal to the number itself and the display the sum of all numbers.

import java.util.*;
public class sumOfAdjacent {

    public static int checkValid(int a) {
        if(a%10 != 0 || a%11 !=0) {
            if(reverse(a)>=a) { 
                System.out.println(" ");
                return a;
            } 
            else
                return reverse(a);
        }
        return 0;
    }

    public static int reverse(int a) {
        int digit;
        int n=a;
        int reverse=0;
        while(a!=0) {
            digit=a%10;
            reverse*=10+digit;
        }
        if (reverse==n) return reverse;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the interval:");
        System.out.print("Start number:");
        int start=sc.nextInt();
        System.out.print("End number:");
        int end=sc.nextInt();
        int sum=0;
        for(int i=start;i<=end;i++) {
            sum+=checkValid(i);
        }
        System.out.println(sum);
    }
}
