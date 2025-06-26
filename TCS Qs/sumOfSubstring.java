//array with length n and an integer k find max sum of elements 
//from num and the subarray should not contain at most k distinct elements
import java.lang.*;
import java.util.*;
public class sumOfSubstring {
    public static int findMaxSum(int[] arr, int k) {
        
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int n = scanner.nextInt();
            
            int[] arr = new int[n];
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.println(Arrays.toString(arr));

            System.out.print("Enter the value of k: ");
            int k = scanner.nextInt();

            int maxSum = findMaxSum(arr, k);
            System.out.println("Maximum sum of subarray with at most " + k + " distinct elements: " + maxSum);
        }
    }
}
