import java.util.Arrays;
import java.util.Scanner;

public class mergeSort {
    public static void sort(int[] arr, int l, int r) {//main divide function
        if (l < r) {
            int m = (l + r) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
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
        sort(arr,0,n-1);
        System.out.println("SORTED ARRAY IS: "+Arrays.toString(arr));
    }
}