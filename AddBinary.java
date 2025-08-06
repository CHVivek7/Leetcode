import java.math.BigInteger;
import java.util.Scanner;

public class AddBinary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first binary number: ");
        String a = sc.nextLine();
        System.out.print("Enter second binary number: ");
        String b = sc.nextLine();
        BigInteger a1 = new BigInteger(a, 2);
        BigInteger b1 = new BigInteger(b, 2);
        BigInteger sum = a1.add(b1);
        System.out.println(sum.toString(2));
    }
}