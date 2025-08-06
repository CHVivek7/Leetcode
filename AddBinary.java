import java.math.BigInteger;

public class AddBinary{
    public static void main(String[] args){
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "1011";
        BigInteger a1 = new BigInteger(a, 2);
        BigInteger b1 = new BigInteger(b, 2);
        BigInteger sum = a1.add(b1);
        System.out.println(sum.toString(2));
    }
}