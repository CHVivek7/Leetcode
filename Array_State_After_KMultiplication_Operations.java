import java.util.*;

public class Array_State_After_KMultiplication_Operations {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 6};
        int k = 5;
        int multiplier = 2;

        for (int i = 0; i < k; i++) {
            int minIndex = 0;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            arr[minIndex] = arr[minIndex] * multiplier;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}