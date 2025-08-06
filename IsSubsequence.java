import java.util.Scanner;

public class IsSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.print("Enter a Subsequence: ");
        String sub = sc.nextLine();
        
        if (isSubsequence(str, sub)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }

    public static boolean isSubsequence(String str, String sub) {
        int i = 0, j = 0;
        while (i < str.length() && j < sub.length()) {
            if (str.charAt(i) == sub.charAt(j)) {
                i++;
            }
            j++;
        }
        return j == sub.length();
    }
}