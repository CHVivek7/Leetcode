import java.util.Stack;

public class Removing_Stars_From_a_String {
    public static void main(String[] args) {
        String str = "leet**cod*e";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='*'){
                stack.pop();
            }
            else{
                stack.push(str.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        System.out.println(sb.reverse().toString());
    }
}
