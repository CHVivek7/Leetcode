import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(ispar(s));
    }
    public static boolean ispar(String s) {  
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stk.push(s.charAt(i)); 
            } 
            else {
                if (!stk.empty() && 
                    ((stk.peek() == '(' && s.charAt(i) == ')') ||
                     (stk.peek() == '{' && s.charAt(i) == '}') ||
                     (stk.peek() == '[' && s.charAt(i) == ']'))) {
                    stk.pop(); 
                }
                else {
                    return false; 
                }
            }
        }
        return stk.empty();
    }
}