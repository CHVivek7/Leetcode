import java.util.Scanner;

public class Adding_Spaces_to_a_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "LeetcodeHelpsMeLearn";
        int[] spaces = {8, 13, 15};
        StringBuilder res = new StringBuilder();
        int lastIndex = 0;

        for (int space : spaces) {
            res.append(str, lastIndex, space).append(" ");
            lastIndex = space;
        }
        res.append(str.substring(lastIndex));

        System.out.println(res.toString());
    }
}