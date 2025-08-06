import java.util.Scanner;

public class Palindrome_Number {
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        else{
            int i = 1;
            int res=0;
            int l=0;
            int n=x;
            while(x!=0){
                l = x%(i*10);
                res = res*10 + l;
                x=x/10;
            }
            if(n==res){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = scanner.nextInt();
        boolean result = isPalindrome(x);
        if(result){
            System.out.println(x + " is a palindrome.");
        } else {
            System.out.println(x + " is not a palindrome.");
        }
        scanner.close();
    }
}
