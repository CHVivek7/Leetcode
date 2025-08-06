import java.util.*;
import java.lang.*;
import java.io.*;
/**
 * median_of_Two_Sorted_arrays
 */
public class median_of_Two_Sorted_arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first sorted array:");
        String[] arr1Input = sc.nextLine().split(" ");
        System.out.println("Enter the second sorted array:");
        String[] arr2Input = sc.nextLine().split(" ");
        int[] arr1 = Arrays.stream(arr1Input).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(arr2Input).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        int[] mergedArray = new int[arr1.length + arr2.length];
        
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);
        Arrays.sort(mergedArray);
        System.out.println(Arrays.toString(mergedArray));
        int n = mergedArray.length;
        if (n % 2 == 0) {
            System.out.println((mergedArray[n/2] + mergedArray[n/2 - 1]) / 2.0);
        } else {
            System.out.println(mergedArray[n/2]);
            
        }
    }
}