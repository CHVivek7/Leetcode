import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array:");
        int n1Size = sc.nextInt();
        System.out.println("Enter the size of second array:");
        int n2Size = sc.nextInt();
        int[] n1 = new int[n1Size];
        int[] n2 = new int[n2Size];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1Size; i++) {
            n1[i] = sc.nextInt();
        }
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2Size; i++) {
            n2[i] = sc.nextInt();
        }
        int[] result = intersection(n1, n2);
        for (int i : result) {
            System.out.println(i);
        }
    }
    public static int[] intersection(int[] n1, int[] n2)
    {
        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int i : n1) {
            list.add(i);
        }
        for (int i : n2) {
            if (list.contains(i)) {
                result.add(i);
                list.remove(list.indexOf(i));
            }
        }
        
        int[] r = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            r[i] = result.get(i);
        }
        return r;
    }
}