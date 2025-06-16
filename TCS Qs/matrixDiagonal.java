import java.util.Scanner;

public class matrixDiagonal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array(n:n*n):");
        int n=sc.nextInt();
        int[][] arr=new int [n][n];
        System.out.println("Enter the elements of:");
        for(int i=0;i<n;i++) {
            System.out.println(i+" ROW");
            for(int j=0;j<n;j++) {
                int ele=sc.nextInt();
                arr[i][j]=ele;
            }
        }

        System.out.println("Matrix is:");
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }

        int primaryDiagonal=0,secondaryDiagonal=0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(i==j) {
                    primaryDiagonal+=arr[i][i];
                    secondaryDiagonal+=arr[i][n-i-1];
                }
            }
        }

        System.out.println("PRIMARY DIAGONAL SUM: " + primaryDiagonal);
        System.out.println("SECONDARY DIAGONAL SUM: " + secondaryDiagonal);
        System.out.println("DIFFERENCE OF PRIMARY & SECONDARY DIAGONAL: " + (primaryDiagonal-secondaryDiagonal));
    }
}
