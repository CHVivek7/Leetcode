public class Two_Sum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
    public static int[] twoSum(int[] arr,int target){
        int[] res = new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }
        }
        return new int[0];
    }
}
