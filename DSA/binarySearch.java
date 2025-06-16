import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    public static int search(int[] arr, int key,int n) {
        int low=0;
        int high=n-1;
        while(low<high) {
            int mid=(low+high)/2;
            if(key==arr[mid]) {
                return (mid+1);
            } else if (key < arr[mid]) {
                high=mid+1;
            } else 
                low=mid+1;
        }
        return -1;
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
        Arrays.sort(arr);
        System.out.println("SORTED ARRAY IS: "+Arrays.toString(arr));
        System.out.print("Enter the element to search:");
        int key=sc.nextInt();

        int result=search(arr,key,n);

        if(result!=-1)
            System.out.println("ELEMENT FOUND AT: "+result);
        else
            System.out.println("~ELEMENT NOT FOUND~");
        
    }
}
