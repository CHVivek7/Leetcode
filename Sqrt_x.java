import java.util.Scanner;

public class Sqrt_x {
    public static int mySqrt(int x) {
        if(x==1){
            return 1;
        }
        double guess = x/2;
        double epsilon = 0.00001;
        while(Math.abs((guess*guess)-x) > epsilon){
            guess = (guess+(x/guess))/2.0;
        }
        return (int)guess;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its square root: ");
        int x = sc.nextInt();
        int result = mySqrt(x);
        System.out.println("The square root of " + x + " is approximately: " + result);
        sc.close();
    }
}
