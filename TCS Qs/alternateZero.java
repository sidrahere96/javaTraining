//to put alternate 0s in an array with given numbers along with zeros with number
// and need to include that zero's of array also to print the array with alternate 0s
import java.util.Arrays;
import java.util.Scanner;
public class alternateZero {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] arr={4,2,0,1,5,0,0};
            int n = arr.length-1;
            if (n == 0) {
                System.out.println("Resulting array: []");
                return;
            }
            System.out.println("Original array: " + Arrays.toString(arr));
            int nzcounter=0,zcounter=0;
            int len = arr.length;
            //solving the problem such that output is:[7,0,8,0,3,0,2] without using two for loops and no extra array
            for(int i=0;i<len;i++) {
                if(arr[i]!=0) nzcounter++;
                else zcounter++;
            }
            int i = 0,j=0;
            while (j < len) {
                if(arr[j]!=0) {
                    arr[i]=arr[j];
                    i++;
                    j++;
                }
                else j++;
            }
            i--;
            int e=len-1;
            while (e>0) {
                if(e%2==0) {
                    arr[e]=arr[i];
                    e--;
                    i--;
                }
                else {
                    arr[e]=0;
                    e--;
                }
            }
            System.out.println("Resulting array: " + Arrays.toString(arr));
        }
    }
}

