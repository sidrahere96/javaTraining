import java.lang.*;
import java.util.*;

public class magicalNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a 3 digit number(x):");
        int num=sc.nextInt();
        int a=num,f,next,result=0;
        int temp=num,count=0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        System.out.println(count);
        int p=(int)Math.pow(10,(count-1));
        int t=p/10;
        while(a>0) {
            f=a/p;
            if(t>0)
                next=(a%p)/t;
            else
                next=num/(count-1);
            if(f%2==0)
                result=result*10+(f);
            else{
                int ans=(f+next);
                ans%=10;   
                result=result*10+(ans);
            }
            a=a%p;
            p/=10;
            t/=10;
        }
        System.out.println("RESULT IS:"+result);
    }
}
