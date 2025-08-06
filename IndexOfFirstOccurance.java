import java.util.*;
public class IndexOfFirstOccurance {
    public static void main(String[] args) {
        System.out.print("Enter String 1: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print("Enter String 2: ");
        String t = sc.nextLine();
        int result = indexOfFirstOccurance(s, t);
        System.out.println(result);
    }
    static int indexOfFirstOccurance(String s, String t) {
        int n = t.length();
        for (int i = 0; i < s.length() - n + 1; i++) {
            if (s.substring(i, i + n).equals(t)) {
                return i;
            }
        }
        return -1;
    }
}
