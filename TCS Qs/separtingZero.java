import java.util.Arrays;
import java.util.Scanner;

class separtingZero {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int n = scanner.nextInt();
            
            int[] arr = new int[n];
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println("ARRAY IS:"+Arrays.toString(arr));
            // int counter=0;
            // for(int i=0;i<n;i++) {
            //     if(arr[i]!=0) {
            //         arr[counter]=arr[i];
            //         counter++;
            //     }
            // }

            // for(int i=counter;i<n;i++) {
            //     arr[i]=0;
            // }
            int i=0;
            int j=0;
            while(i<n) {
                if (j<n) {
                    if(arr[j] != 0) {
                        arr[i]=arr[j];
                        i++;
                        j++;
                    }
                    else j++;
                }
                else {
                    arr[i]=0;
                    i++;
                }

            }
            System.out.println("ARRAY IS:"+Arrays.toString(arr));
    }
}
}