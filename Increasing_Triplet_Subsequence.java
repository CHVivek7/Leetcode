public class Increasing_Triplet_Subsequence {
    public static void main(String[] args) {
        int[] nums = {20,100,10,12,5,13};
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
