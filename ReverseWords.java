import java.util.Scanner;
public class ReverseWords {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = s.nextLine();
        String[] words = str.split(" ");
        String rev = "";
        for(int i=words.length-1;i>=0;i--){
            rev+=words[i]+" ";
        }
        System.out.println(rev);
    }
}
