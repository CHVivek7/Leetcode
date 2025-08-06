import java.util.Scanner;

public class Number_1Bits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        int count = 0;
        String binary = Integer.toBinaryString(n);
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
            }
        }
        System.out.println("Number of 1 bits in the binary representation of " + n + " is: " + count);
    }
}
