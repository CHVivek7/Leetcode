public class Check_If_N_and_Its_Double {
    public static void main(String[] args) {
        int[] arr = {3,1,7,11};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]*2==arr[j] || arr[j]*2==arr[i]){
                    System.out.println("True");
                    return;
                }
            }
        }
        System.out.println("False");
    }
}
