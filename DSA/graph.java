import java.util.Scanner;

class Graph {
    public int vertices;
    public int[][] matrix;
    public Graph(int n) {
        if(n<=0) {
            System.out.println("Invalid input for number of vertices.");
            return;
        }   
        vertices = n;
        matrix = new int[vertices][vertices];
    }

    public void addEdge(int src,int dest) {
        matrix[src][dest]=1;
        matrix[dest][src]=1;
    }

    public void display() {
        System.out.println("Matrix is:");
            for(int i=0;i<vertices;i++) {
                for(int j=0;j<vertices;j++) {
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println(" ");
            }
    }
}

public class graph {    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the dimension of matrix:");
        int n=sc.nextInt();
        Graph g=new Graph(n);
        System.out.print("ENTER No. of elements you want to enter:");
        int ele=sc.nextInt();
        int row,col;
        for(int a=0;a<ele;a++) {
            System.out.print("    ENTER ELEMENTS:");
            int b=sc.nextInt(); 
            System.out.print("    ENTER its row:");
            row=sc.nextInt();
            System.out.print("    ENTER its colomn:");
            col=sc.nextInt();
            g.addEdge(row, col);
        }

        g.display();
    }
}