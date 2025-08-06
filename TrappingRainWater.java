public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr ={3,0,1,0,4,0,2};
        int n = arr.length;
        int water =0;
        for(int i=0;i<n-1;i++){
            int left = arr[i];
            for(int j=0;j<i;j++){
                left = Math.max(left,arr[j]);
            }
            int right = arr[i];
            for(int j=i+1;j<n;j++){
                right = Math.max(right,arr[j]);
            }
            water += Math.min(left,right)-arr[i];
        }
        System.out.println(water);
    }
}
