public class Transformed_array {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; ++i) {
            ans[i] = nums[i] != 0 ? nums[(i + nums[i] % n + n) % n] : 0;
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {3,-2,1,1};
        int[] res = new Transformed_array().constructTransformedArray(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
