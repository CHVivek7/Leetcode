import java.util.Scanner;
public class MonotonicArray {
    public static void main(String[] args){
        System.out.print("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(isMonotonic(arr));
    }
    static boolean isMonotonic(int[] arr){
        if(arr[0]<=arr[arr.length-1]){
            for(int i=0; i<arr.length-1; i++){
                if(arr[i]>arr[i+1]){
                    return false;
                }
            }
        }
        else{
            for(int i=0; i<arr.length-1; i++){
                if(arr[i]<arr[i+1]){
                    return false;
                }
            }
        }
        return true;
    }
}
