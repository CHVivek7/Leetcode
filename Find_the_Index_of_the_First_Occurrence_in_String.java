import java.util.Scanner;

public class Find_the_Index_of_the_First_Occurrence_in_String {
    public static int strStr(String s, String t) {
        int n = t.length();
        for (int i = 0; i < s.length() - n + 1; i++) {
            if (s.substring(i, i + n).equals(t)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String s = scanner.nextLine();
        System.out.print("Enter the substring to find: ");
        String t = scanner.nextLine();
        
        System.out.println(strStr(s, t));
    }
}
