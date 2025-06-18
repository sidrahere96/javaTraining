import java.util.*;

public class nthSmallest {
    public static int small(int lastMin,int[] arr) {
        int min=-1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>lastMin) {
                min=arr[i];
                break;
            }
        }

        for(int i=0;i<arr.length;i++) {
            if(min>arr[i] && arr[i]>lastMin) 
                min=arr[i];
        }
        return min;
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
            
            System.out.print("Enter the nth smallest number to search: ");
            int nth=scanner.nextInt();
            if(nth>arr.length)
                System.out.println("IT IS OUT OF BOUND!");
            else {
                int s=0,ans=-1;
                int counter=0;
                while(counter < nth) {
                    s=small(ans,arr);
                    ans=s;
                    counter++;
                }
                System.out.println("nth smallest is: "+ans);
            }
        }
    }
}
