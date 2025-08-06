import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;
public class FindTheDifference {
    public static void main(String[] args) {
        System.out.print("Enter String 1: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print("Enter String 2: ");
        String t = sc.nextLine();
        char result = findTheDifference(s, t);
        System.out.println(result);
    }
    static char findTheDifference(String s, String t) {
        int s_sum = 0, t_sum = 0;
        for (char c : s.toCharArray()) {
            s_sum += (int) c;
        }
        for (char c : t.toCharArray()) {
            t_sum += (int) c;
        }
        return (char) (t_sum - s_sum);
    }
}
