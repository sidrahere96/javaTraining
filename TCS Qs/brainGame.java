import java.util.Scanner;

public class brainGame {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("ENTER THE NUMBER TO REPLACE: ");
            int num=scanner.nextInt();
            if(num>=1 && num<=1000000) {
                int result=0;
                int[] arr={9,8,7,6,5,4,3,2,1,0};
                int p=1;
                while(num!=0) {
                    int digit=num%10;
                    int newNum=arr[digit];
                    result=(newNum*p)+result;
                    p*=10;
                    num/=10;
                }
                System.out.println("REPLACED NUMBER: "+result);
            }
            else
                System.out.println("WRONG INPUT!");
        }
    }
}