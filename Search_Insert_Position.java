import java.util.Scanner;
public class Search_Insert_Position {
    public static int searchInsert(int[] nums, int target) {
        if(nums[nums.length-1]<target){
            return nums.length;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            if(nums[i]>target){
                return i;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array (sorted): ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.print("Enter the target element to find its insert position: ");
        int target = scanner.nextInt();
        int result = searchInsert(nums, target);
        System.out.println("Insert position: " + result);
    }
}
