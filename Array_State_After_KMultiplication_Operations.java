import java.util.*;

public class Array_State_After_KMultiplication_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int multiplier = sc.nextInt();
        if (k <= 0 || n == 0) {
            System.out.println("Invalid input");
            return;
        }
        Arrays.sort(arr);
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