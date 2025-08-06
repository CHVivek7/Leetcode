import java.util.*;
public class ArithmeticProgressionSequence {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements in the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(isArithmeticProgression(arr));

    }
    static boolean isArithmeticProgression(int[] arr){
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for(int i = 1; i < arr.length - 1; i++){
            if(arr[i+1] - arr[i] != diff){
                return false;
            }
        }
        return true;
    }
}
