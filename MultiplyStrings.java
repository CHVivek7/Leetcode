import java.math.BigInteger;
public class MultiplyStrings {

    public static void main(String[] args) {
        String num1 = "123456789";
        String num2 = "987654321";
        System.out.println(multiply(num1, num2));
    }

    

    public static String multiply(String num1, String num2) {
        return "" +new BigInteger(num1).multiply(new BigInteger(num2));
    }
}