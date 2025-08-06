public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        String str = Integer.toString(num);
        str = (new StringBuilder(str)).reverse().toString();
        if (str.equals(Integer.toString(num))) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
