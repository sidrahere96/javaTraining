/*# Palindrome Check

## **Problem Statement**
Write a function `isPalindrome` to check whether the given string `inputStr` is a **palindrome** or not.

A string is a **palindrome** if it reads the same **forward and backward**.

- The function should **return `1`** if the string is a palindrome, **otherwise return `0`**.
- **Case-sensitive check** (uppercase and lowercase letters are treated differently).
- **No extra array should be used**.
- The function should **not modify the input string**.
 */

import java.util.Scanner;

public class palindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String to check Palindrome:");
        String a = sc.nextLine();
        int result = isPalindrome(a);
        System.out.println(result);
    }

    public static int isPalindrome(String inputStr) {
        int i = 0;
        int len = inputStr.length();
        while (i < len/2) {
            if (inputStr.charAt(i) != inputStr.charAt(len-1)) {
                return 0;
            }
            i++;
            len--;
        }
        return 1;
    }
}
