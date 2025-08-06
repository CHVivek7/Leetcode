public class a {
    public static void main(String[] args) {
        int n = 6;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            String s = Integer.toBinaryString(i);
            int sum = 0; 
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    sum += 2;
                } else if (s.charAt(j) == '0') {
                    sum += 1;
                }
            }

            if (sum % 2 == 1) {
                count++;
            }
        }

        System.out.println(count);
    }
}