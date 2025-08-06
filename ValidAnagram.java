import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.print("Enter 1st String: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print("Enter 2nd String: ");
        String t = sc.nextLine();
        sc.close();
        System.out.println(validAnagram(s, t));
    }

    static boolean validAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
    }
}
