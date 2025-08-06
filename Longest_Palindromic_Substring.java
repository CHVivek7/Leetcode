import java.util.Scanner;

public class Longest_Palindromic_Substring {
    public static String longestPalindrome(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) { 
            for (int j = i + 1; j <= s.length(); j++) {
                String temp = s.substring(i, j);
                if (isPalindrome(temp)) {
                    if (temp.length() > str.length()) {
                        str = temp;
                    }
                }
            }
        }
        return str; 
    }

    public static boolean isPalindrome(String temp) {
        int i = 0;
        int j = temp.length() - 1;
        while (i < j) {
            if (temp.charAt(i) != temp.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        String result = longestPalindrome(s);
        System.out.println("Longest Palindromic Substring: " + result);
    }
}
