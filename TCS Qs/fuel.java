/*## **Problem Statement**
Vijay, an industrialist, recently opened a **fuel industry** with `N` different **categories of fuel**, each stored in **fixed-size containers**.  
Each fuel container has:
- A **price** (cost to buy).
- A **volume** (fuel it holds).

Hari, a **fuel merchant**, has a **limited budget `K`** and wants to **buy fuel to maximize the total volume**.  
Hari **cannot buy more than one container** of any fuel category.

Find the **maximum overall volume of fuel** that Hari can purchase within his budget `K`.*/

import java.util.*;

public class fuel {
    
    public static int maxVolume(int N, int K, int[] prices, int[] volumes,int visited[]) {
        int max=-1;
        int index=0;
        for(int i=0;i<volumes.length;i++) {
            if(visited[i]!=i) {
                if(volumes[i]>max) {
                    max=volumes[i];
                    index=i;
                }
            }
        }
        visited[index]=index;
        return index;
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of fuel category:");
        int N = sc.nextInt();//->fuel category
        System.out.print("Enter available money unit:");
        int K = sc.nextInt();//->avaiable money unit
        int[] visited=new int[N];
        int[] prices = new int[N];
        int[] volumes = new int[N];
        System.out.println("Enter price for each fuel category:");
        for (int i = 0; i < N; i++) {
            System.out.print("Enter price of fuel category "+(i+1)+":");
            prices[i] = sc.nextInt();
        }
        System.out.println("Enter volume for each fuel category:");
        for (int i = 0; i < N; i++) {
            System.out.print("Enter volume of fuel category "+(i+1)+":");
            volumes[i] = sc.nextInt();
        }
        int C=0,totalVolumes=0;
        //System.out.println(maxVolume(N, K, prices, volumes));
        while(K>0 && C<volumes.length){
            int lg=maxVolume(N,K,prices,volumes,visited);
            if(prices[lg]<=K){
                K-=prices[lg];
                totalVolumes+=volumes[lg];
            }
            C++;
        }
        System.out.println("Total Volumes that can be purchased in budget is:"+totalVolumes);
    }
}