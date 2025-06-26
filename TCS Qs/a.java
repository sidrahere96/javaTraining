import java.util.Scanner;

public class a{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String n = sc.nextLine();
        String Long="";
        int count=0;
        String maxStr="";
        int maxC=0;
        int i=0;
        String str="";
        while(i<n.length()){
            if(n.charAt(i) !=' '){
                str+=Character.toString(n.charAt(i));
                count++;
                System.out.println(str);
                System.out.println(count);
            }else if(n.charAt(i) ==' '){
                System.out.println("else part");
                if(count>maxC){
                    maxC=count;
                    Long=str;
                    System.out.println(Long);
                    count=0;
                    str="";
                }
            }
            i++;
        }

        System.out.println(Long);

    }
}