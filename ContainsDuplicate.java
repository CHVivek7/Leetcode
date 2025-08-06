import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                System.out.println("True");
                break;
            }
            set.add(num);
        }
        System.out.println("False");
    }
}
