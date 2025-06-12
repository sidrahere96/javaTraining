//boys and girls are in queue each with certain no. of mints with pattern:
//first kid has 'n' mints
//everyother kid in queue has one mint less than sum of all kids before them
//GIVEN:n is no. of mints with first kid(2,n<10),len is length of queue(1<len<20)
//PROGRAM TO CALCULATE NO. OF MINTS WITH ALL KIDS IN QUEUE

import java.util.Scanner;
public class mintNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of mints with the first kid (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter the length of the queue (len): ");
        int len = scanner.nextInt();

        if (n < 2 || n >= 10 || len < 1 || len >= 20) {
            System.out.println("Invalid input. Please ensure 2 <= n < 10 and 1 <= len < 20.");
            return;
        }

        int [] mints = new int[len];
        mints[0] = n; 
        int sum = n; 
        
        for (int i = 1; i < len; i++) {
            mints[i] = sum - 1; 
            sum += mints[i]; 
        }
        System.out.println("Number of mints with each kid in the queue:");
        for (int i = 0; i < len; i++) {
            System.out.println("Kid " + (i + 1) + " has : " + mints[i] + " mints");
        }
    }

}