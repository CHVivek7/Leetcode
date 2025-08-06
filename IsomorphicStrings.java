import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        sc.close(); // Closing scanner to prevent resource leak

        if (s.length() != t.length()) {
            System.out.println(false);
            return;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(sArr[i])) {
                if (map.get(sArr[i]) != tArr[i]) {
                    System.out.println(false);
                    return; // Return to exit on mismatch
                }
            } else {
                if (map.containsValue(tArr[i])) {
                    System.out.println(false);
                    return; // Return to exit on duplicate mapping
                }
                map.put(sArr[i], tArr[i]);
            }
        }
        System.out.println(true);
    }
}
