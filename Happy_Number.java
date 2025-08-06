import java.util.*;
import java.io.*;
import java.math.*;
public class Happy_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isHappy(n));
    }
    static List<Integer> arr = new ArrayList<>();
    public static boolean isHappy(int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum += rem*rem;
            n = n/10;
        }
        if(sum == 1){
            return true;
        }
        if(arr.contains(sum)){
            return false;
        }
        arr.add(sum);
        return isHappy(sum);
    }
}
