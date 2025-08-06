import java.math.BigInteger;
import java.util.Scanner;

public class Factorial_trailingZeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n>0)
        {
            count+=Math.ceil(n/5);
            n=n/5;
        }
        System.out.println(count);
    }
}
