import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter no. elements in array:");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements to put in the array:");
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                arr[i] = ele;
            }
            System.out.println("ARRAY IS: " + Arrays.toString(arr));
            sort(arr);
            System.out.println("SORTED ARRAY IS: " + Arrays.toString(arr));
        }
    }
}