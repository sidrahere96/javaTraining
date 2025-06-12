import java.util.Arrays;
import java.util.Scanner;

public class arrayEvenOddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int evenSum = 0;
        int oddSum = 0;
        
        for (int i=0;i<n;i++) {
            if (i % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }

        System.out.println("Array: "+Arrays.toString(arr));
        
        System.out.println("Even sum: " + evenSum);
        System.out.println("Odd sum: " + oddSum);

        int a= evenSum-oddSum;
        System.out.println("Difference (Even - Odd): " + a);
    }
}