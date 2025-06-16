import java.util.Arrays;
import java.util.Scanner;

public class linearSearch {
    public static int search(int[] arr, int key,int n) {
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                return (i+1);
            }
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

        System.out.println("ARRAY IS: "+Arrays.toString(arr));
        System.out.print("Enter the element to search:");
        int key=sc.nextInt();

        int result=search(arr,key,n);

        if(result!=-1)
            System.out.println("ELEMENT FOUND AT: "+result);
        else
            System.out.println("~ELEMENT NOT FOUND~");
        
    }
}
