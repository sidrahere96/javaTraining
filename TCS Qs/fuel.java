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
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of fuel category:");
        int N = sc.nextInt();//->fuel category
        System.out.print("Enter available money unit:");
        int K = sc.nextInt();//->avaiable money unit
        
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
        
        System.out.println(maxVolume(N, K, prices, volumes));
    }
    
    public static int maxVolume(int N, int K, int[] prices, int[] volumes) {
        //->BELOW CODE AS PER THE QS
        // int totalVolume=0;
        // for(int i=0;i<volumes.length;i++) {
        //         if(prices[i] <= K) {
        //             totalVolume += volumes[i];
        //             K -= prices[i]; 
        //         }
        // }
        //return totalVolume;

        //->BELOW CODE AS PER CHANGES:
        //need to take the maximum volume of fuel first that can be bought within the budget K
        int[][] visited = new int[N + 1][K + 1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= K; j++) {
                if (i == 0 || j == 0) {
                    visited[i][j] = 0;
                } else if (prices[i - 1] <= j) {
                    visited[i][j] = Math.max(visited[i - 1][j], volumes[i - 1] + visited[i - 1][j - prices[i - 1]]);
                } else {
                    visited[i][j] = visited[i - 1][j];
                }
            }
        }
        return visited[N][K];
    }
}