import java.util.Scanner;
public class Increasing_Triplet_Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        if (nums.length < 3) {
            System.out.println("false");
            return;
        }

        for(int i=1;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[i]){
                    for(int k=j+1;k<nums.length;k++){
                        if(nums[k]>nums[j]){
                            System.out.println("true");
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("false");
    }
}
