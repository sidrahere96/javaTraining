import java.util.*;
//input is 5 it should give 16 8 4 2 1
public class numberSequence {
    public static void sequence(int a) {
        System.out.print(a + " ");
        if (a == 1) {
            return;
        }
        if (a % 2 == 0) {
            sequence(a / 2);
        } else {
            sequence(a * 3 + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a digit:");
        int num=sc.nextInt();
        sequence(num);
    }
}
