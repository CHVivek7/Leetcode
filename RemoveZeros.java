public class RemoveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int n = nums.length;
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=0;
        }
        int k=0;
        for(int i:nums){
            if(i!=0){
                arr[k]=i;
                k++;
            }
        }
        System.out.print("[");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
            if(i<n-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
