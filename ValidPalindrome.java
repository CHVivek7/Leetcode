import java.util.Scanner;

public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = sc.nextLine();
        String cleanedString = string.replaceAll("[^a-zA-Z]", "").toLowerCase(); 
        System.out.println(isPalindrome(cleanedString));
    }  
        

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
