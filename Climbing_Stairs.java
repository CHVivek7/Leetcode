import java.util.Scanner;

public class Climbing_Stairs {
    public static int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of stairs: ");
        int n = scanner.nextInt();
        int result = climbStairs(n);
        System.out.println("Number of ways to climb " + n + " stairs: " + result);
        scanner.close();
    }
}
