import java.util.*;
import java.lang.*;
import java.io.*;
/**
 * median_of_Two_Sorted_arrays
 */
public class median_of_Two_Sorted_arrays {

    public static void main(String[] args) {
        int[] arr1 = {1,6, 3};
        int[] arr2 = {2,2,3,5,5};
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