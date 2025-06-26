import java.util.*;

public class rotatingArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();            
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter number of elements you want to shift: ");
        int nd=scanner.nextInt();
        int i=0;
        while(nd>0) {
            if(i<n) {
                //swap
                int temp=arr[i];
                arr[i]=arr[n-1];
                arr[n-1]=temp;
                //n--;
                i++;
            }
            else {
                nd--;
                i=0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
