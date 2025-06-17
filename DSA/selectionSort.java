import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. elements in array:");
        int n=sc.nextInt();
        int[] arr=new int [n];
        System.out.println("Enter the elements to put in the array:");
        for(int i=0;i<n;i++){
            int ele=sc.nextInt();
            arr[i]=ele;
        }
        System.out.println("ARRAY IS: "+Arrays.toString(arr));
        sort(arr);
        System.out.println("SORTED ARRAY IS: "+Arrays.toString(arr));
    }
}