import java.util.Scanner;

public class MergeStringAlternatively {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string:");
        String str2 = sc.nextLine();
        if (str1 == null || str2 == null) {
            System.out.println("Invalid input");
            return;
        }
        if (str1.isEmpty() && str2.isEmpty()) {
            System.out.println("Both strings are empty");
            return;
        }
        if (str1.isEmpty()) {
            System.out.println(str2);
            return;
        }
        if (str2.isEmpty()) {
            System.out.println(str1);
            return;
        }
        System.out.println("Merged String: " + mergeAlternately(str1, str2));
    }

    static String mergeAlternately(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;

        while (i < str1.length() || j < str2.length()) {
            if (i < str1.length()) {
                result.append(str1.charAt(i));
                i++;
            }
            if (j < str2.length()) {
                result.append(str2.charAt(j));
                j++;
            }
        }

        return result.toString();
    }
}
