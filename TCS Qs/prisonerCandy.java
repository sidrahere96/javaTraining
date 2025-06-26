import java.util.Scanner;

public class prisonerCandy {
    public static void main(String[] args) {
        int lastPrisoner = 0; // Declare lastPrisoner here so it's accessible throughout main
        int[] arrPrisoner = null; // Declare arrPrisoner here
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of Prisoner: ");
            int prisoner=scanner.nextInt();
            System.out.print("Enter the number of Candies: ");
            int totalCandy=scanner.nextInt();
            System.out.print("Enter chair number of first prisoner with totalCandy: ");
            int firstCandy=scanner.nextInt();
            arrPrisoner=new int[prisoner];
            int candy=1;
            //TO FIND THE PRISONER WHO HAS THE AWFUL CANDY AND CANDIES WITH EACH ONE WITH CHAIR NUMBER AND THE MAXIMUM CANDY WITH ALL PRISONERS
            for(int i=0;i<prisoner;i++) {
                arrPrisoner[i]=0;
            }
            for(int i=0;i<prisoner;i++) {
                if(i==firstCandy-1) {
                    arrPrisoner[i]=totalCandy; 
                    lastPrisoner=i; 
                } else {
                    arrPrisoner[i]=0; 
                }
            }
            // Distributing candies
            for(int i=0;i<totalCandy;i++) {
                arrPrisoner[(firstCandy-1+i)%prisoner]++; 
                lastPrisoner=(firstCandy-1+i)%prisoner; 
            }
            System.out.println("Candies with each prisoner:");
            for(int i=0;i<prisoner;i++) {
                System.out.println("Prisoner " + (i+1) + " has " + arrPrisoner[i] + " candies.");
            }
            for(int i=0;i<prisoner;i++) {
                if(arrPrisoner[i]==totalCandy) {
                    lastPrisoner=i+1; 
                    break; 
                }
            }
            System.out.println("AWFUL CANDY IS WITH CHAIR NUMBER: " + lastPrisoner);
            int maxCandy = 0;
            for(int i=0;i<prisoner;i++) {
                if(arrPrisoner[i] > maxCandy) {
                    maxCandy = arrPrisoner[i]; 
                }
            }
            System.out.println("Maximum candy with all prisoners is: " + maxCandy);

            int maxCandyPrisoner = 0;
            for(int i=0;i<prisoner;i++) {
                if(arrPrisoner[i] == maxCandy) {
                    maxCandyPrisoner = i + 1; 
                    break; 
                }
            }
            System.out.println("Maximum candy is with chair number: " + maxCandyPrisoner);
            
        //     for(int i=0;i<totalCandy;i++) {
        //         for(int j=firstCandy-1;j<prisoner;j++) {
        //             arrPrisoner[j]=candy;
        //             lastPrisoner=j;
        //         }
        //         for(int j=0;j<firstCandy;j++) {
        //             arrPrisoner[j]=candy;
        //             lastPrisoner=j;
        //         }
        //     }
        // System.out.println("AWFUL CANDY IS WITH CHAIR NUMBER: "+lastPrisoner);
    }
    }
}