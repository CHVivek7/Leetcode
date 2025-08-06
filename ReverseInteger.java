import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.print("Enter a number to reverse: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while(n!=0){
            int x = n%10;
            rev = rev*10 + x;
            if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
                rev = 0;
                System.out.println("Number out of range");
                System.exit(0);
            }
            n = n/10;
        }
        System.out.println("Reversed number: "+rev);
    }
}
