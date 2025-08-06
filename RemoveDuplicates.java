import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 2,2, 3, 4, 5, 5, 6, 7, 8, 9, 9};
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.contains(num)){
                set.add(num);
            }
        }
        
        nums = new int[set.size()];
        for(int i = 0; i < nums.length; i++){
            nums[i] = set.toArray()[i];
        }
        for(int num : nums){
            System.out.print(num + " ");
        }   
    }
}
