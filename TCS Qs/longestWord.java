//returnning longest word in the input string without extra array using while loop
import java.util.*;

public class longestWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A STRING: ");
        String str=sc.nextLine();
        // String[] words = str.split(" ");
        // String longest = "";
        // for (String word : words) {
        //     if (word.length() > longest.length()) {
        //     longest = word;
        //     }
        // }
        // System.out.println("Longest word: " + longest);
        
        int index = 0,maxLen = 0,maxStart = 0,currLen = 0,currStart = 0;
        while (index <= str.length()) {
            if (index < str.length() && str.charAt(index) != ' ') {
                if (currLen == 0) currStart = index;
                currLen++;
            } else {
                if (currLen > maxLen) {
                    maxLen = currLen;
                    maxStart = currStart;
                }
                currLen = 0;
            }
            index++;
        }
        if (maxLen > 0) {
            //System.out.println("Longest word: " + str.substring(maxStart, maxStart + maxLen));
            System.out.print("LONGEST WORD: ");
            for(int i=maxStart;i<=maxLen;i++) {
                System.out.print(str.charAt(i));
            }
        } else {
            System.out.println("No words found.");
        }
        /* 
        int maxLen = 0;
        int maxStart = 0;
        int currLen = 0;
        int currStart = 0;

        for (int i = 0; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) != ' ') {
                if (currLen == 0) currStart = i;
                currLen++;
            } else {
                if (currLen > maxLen) {
                    maxLen = currLen;
                    maxStart = currStart;
                }
                currLen = 0;
            }
        }
        if (maxLen > 0) {
            String longest = str.substring(maxStart, maxStart + maxLen);
            System.out.println("Longest word: " + longest);
        } else {
            System.out.println("No words found.");
        } */
    }
}
