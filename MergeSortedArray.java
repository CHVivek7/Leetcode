import java.util.Arrays;
import java.util.Scanner;
public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arr1: ");
        int m = sc.nextInt();
        System.out.println("Enter the size of arr2: ");
        int n = sc.nextInt();
        int[] arr1 = new int[m+n];
        int[] arr2 = new int[n];
        System.out.println("Enter the elements of arr1: ");
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of arr2: ");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        merge(arr1, m, arr2, n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;     // nums1's index (the actual nums)
        int j = n - 1;     // nums2's index
        int k = m + n - 1; // nums1's index (the next filled position)

        while (j >= 0){
            if (i >= 0 && nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];
            else
            nums1[k--] = nums2[j--];
        }
        System.out.println(Arrays.toString(nums1));
    }
}