import java.util.Arrays;
import java.util.Scanner;

public class insertionSort {
    public static void sort(int[] arr) {
        int n=arr.length;

        for(int i=1;i<n;i++) {
            int key = arr[i];
            int j=i-1;

            while(j>=0 && arr[j] > key) {
                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {
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

