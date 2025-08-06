import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] n1 = {1, 2, 2, 1};
        int[] n2 = {2, 2};
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