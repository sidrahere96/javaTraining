import java.util.Arrays;
import java.util.Scanner;

//BINARY SEARCH WITH RECURSION
public class binarySearchRecursion {
    public static int search(int[] arr, int key, int low, int high) {
        if (low > high) return -1; 
        int mid = (low + high) / 2;
        if (key == arr[mid]) 
            return mid + 1;
        else if (key < arr[mid]) 
            return search(arr, key, low, mid - 1); 
        else 
            return search(arr, key, mid + 1, high); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. elements in array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements to put in the array:");
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            arr[i] = ele;
        }
        Arrays.sort(arr);
        System.out.println("SORTED ARRAY IS: " + Arrays.toString(arr));
        System.out.print("Enter the element to search:");
        int key = sc.nextInt();

        int result = search(arr, key, 0, n - 1);

        if (result != -1)
            System.out.println("ELEMENT FOUND AT: " + result);
        else
            System.out.println("~ELEMENT NOT FOUND~");
        
    }
}