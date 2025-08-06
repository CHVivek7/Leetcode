import java.util.Scanner;

public class RotatingArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rotations");
        int rotations = sc.nextInt();
        int i=0;
        int j=arr.length-1;
        for(int k=0;k<rotations;k++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}