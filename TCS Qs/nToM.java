//PROBLEM STATEMENT:
    //Two positive numbers as input(m<n;0<m<999 ;1<n<=999)
    //Print numbers from m to n in decreasing order such that the
    //numbers has leading zeroes to match width of n
// Example: if m=5 and n=12, output should be 12, 11, 10, 09, 08, 07, 06, 05

import java.util.Scanner;

public class nToM {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int countn = String.valueOf(n).length();

        if(m<n){
            for (int i = n; i >= m; i--) {
                /*int number = 5;
                String formatted = String.format("%03d", number); // Result: "005" */
                String formattedNumber = String.format("%0" + countn + "d", i);
                System.out.print(formattedNumber);
               // System.out.print(i);
                if (i > m) {
                    System.out.print(", ");
                }
            }
        } else {
            System.out.println("Invalid input: m should be less than n.");
        }
    }
}