import java.util.Scanner;

public class stringC {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string (a):");
        String a = sc.nextLine();

        System.out.println("Enter second string (b):");
        String b = sc.nextLine();

        String c = "";

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            boolean found = false;

            for (int j = 0; j < b.length(); j++) {
                if (ch == b.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                c = c + ch;
            }
        }

        System.out.println("Resulting string (c): " + c);
    }
}
