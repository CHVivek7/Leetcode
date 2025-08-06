import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Difference_of_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array:");
        int n1 = sc.nextInt();
        System.out.println("Enter the size of the second array:");
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(findDifference(arr1, arr2));
    }

    public static List<List<Integer>> findDifference(int[] arr1, int[] arr2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for (int i : arr1) {
            if (!l1.contains(i)) l1.add(i);
        }
        for (int i : arr2) {
            if (!l2.contains(i)) l2.add(i);
        }
        List<Integer> l1Copy = new ArrayList<>(l1);
        List<Integer> l2Copy = new ArrayList<>(l2);
        l1.removeAll(l2Copy);
        l2.removeAll(l1Copy);
        List<List<Integer>> res = new ArrayList<>();
        res.add(l1);
        res.add(l2);
        return res;
    }
}
