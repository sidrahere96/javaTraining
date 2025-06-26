import java.util.Arrays;
import java.util.Scanner;

public class multipleof10InSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array is:"+Arrays.toString(arr));

        int i = 0, end = n - 1,s=0,c=0;
        while (c < end) {
            if(arr[s]%10==0) {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[end]=temp;
                i++;
                end--;
            }
            else {
                s++;
            }
            c++;
        }
        System.out.println("Array is:"+Arrays.toString(arr));
    }
}