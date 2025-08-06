public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);
        for (int i : result) {
            System.out.print(i + " ");
            }
    }
    private static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        for(int i = 0; i < n; i++) {
            output[i] = 1;
            for(int j = 0; j < n; j++) {
                if(i != j) {
                    output[i] *= nums[j];
                }
            }
        }
        return output;
    }

        
}
