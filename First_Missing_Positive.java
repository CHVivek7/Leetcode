import java.util.HashMap;
import java.util.Scanner;

public class First_Missing_Positive {
    public static int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : nums) {
            if(! (num <= 0))
                 hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        for(int i = 1;i < nums.length + 1; i++) {
            if(hm.get(i) == null) {
                return i;
            }
        }
        return nums.length + 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int result = firstMissingPositive(nums);
        System.out.println("The first missing positive integer is: " + result);
    }
}
