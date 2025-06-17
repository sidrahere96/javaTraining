//quick sort using recursion

import java.util.Arrays;
import java.util.Scanner;

public class quickSort {
    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int l,int r) {
        int pivot = arr[r]; 
        int i = (l - 1); 

        for (int j = l; j < r; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = temp;

        return i + 1;
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
        quicksort(arr,0,n-1);
        System.out.println("SORTED ARRAY IS: "+Arrays.toString(arr));
    }
}
