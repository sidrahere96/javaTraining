import java.util.*;
public class multipleof10InReverse {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int n = scanner.nextInt();
            
            int[] arr = new int[n];
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.println(Arrays.toString(arr));
            int i=0;
            int end=arr.length-1;
            //int a=end;
            while(i<end) {
                if (arr[i] % 10 != 0) {
                    i++;
                } else {
                    int temp = arr[i];
                    for (int j=i; j<end; j++) {
                        arr[j] = arr[j+1];
                    }
                    arr[end] = temp;
                    end--;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
