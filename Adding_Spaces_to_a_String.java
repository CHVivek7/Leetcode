import java.util.Scanner;

public class Adding_Spaces_to_a_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Original String: " + str);
        int[] spaces  = new int[str.length()];
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaces[count++] = i;
            }
        }
        if (count == 0) {
            System.out.println("No spaces found in the string.");
            return;
        }
        System.out.println("Spaces found at indices: ");
        StringBuilder res = new StringBuilder();
        int lastIndex = 0;
        for (int i = 0; i < count; i++) {
            int space = spaces[i];
            res.append(str, lastIndex, space).append(" ");
            lastIndex = space;
        }
        res.append(str.substring(lastIndex));

        System.out.println(res.toString());
    }
}