    //alice introduced new online game with n levels
    //each day she introduces a level on random but not necessarily increasing
    //a level cannot be launched twice
    //player can play higher level than the one they have completed
    //player gets one reward for each level completed
    //you need to maximize the number of rewards you can get by playing as many levels as possible
    //goal is to find the maximum rewards you can earn based on launch order
    //input should be the number of levels and the launch order of levels
    
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of levels: ");
        int n = scanner.nextInt();
        
        int[] levels = new int[n];
        System.out.println("Enter the launch order of levels:");
        for (int i = 0; i < n; i++) {
            levels[i] = scanner.nextInt();
        }
        
        int rewards = 0;
        int lastCompletedLevel = -1; 
        
        for (int i = 0; i < n; i++) {
            if (levels[i] > lastCompletedLevel) {
                rewards++;
                lastCompletedLevel = levels[i]; 
            }
        }
        
        System.out.println("Maximum rewards you can earn: " + rewards);
    }
}
