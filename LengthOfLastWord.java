import java.util.Scanner;
public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s){
        int count = 0;
        int i = s.length()-1;
        for(;i>=0;i--){
            if(s.charAt(i) == ' '){
                if(count == 0){
                    continue;
                }
                break;
            }
            count++;
        }
        return count;
    }
}
