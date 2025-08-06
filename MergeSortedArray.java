import java.util.Arrays;
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0}; // arr1 needs to have enough space to hold elements from arr2
        int[] arr2 = {2,5,6};
        merge(arr1, 3, arr2, 3);
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