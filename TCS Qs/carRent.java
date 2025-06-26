import java.util.*;

public class carRent {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)) {
            System.out.print("ENTER THE COST FOR 1st n HOURS: ");
            int R1=sc.nextInt();
            System.out.print("Enter Number of hours charged at R1 rate: ");
            int N=sc.nextInt();
            System.out.print("");
            System.out.print("ENTER THE COST FOR next n HOURS: ");
            int R2=sc.nextInt();
            System.out.print("ENTER TOTAL TIME: ");
            int totalTime=sc.nextInt();
            int n;
            if(totalTime%60!=0){
                n = totalTime/60;
                n += 1;
            }
            else {
                n = totalTime;
            }
            int cost = N * R1;
            n -= N;
            if(n > N){
                cost += (n * R2);
            }
            System.out.println(cost);
        }
    }
}

