import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Roman_to_Integer {
    public static void main(String[] args) {
        System.out.print("Enter the Roman number: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String str){
        Map<Character, Integer> roman  = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        int sum = 0;
        for(int i=0;i<str.length()-1;i++){
            if(roman.get(str.charAt((i)))>=roman.get(str.charAt(i+1))){
                sum+=roman.get(str.charAt(i));
            }
            else{
                sum-=roman.get(str.charAt(i));

            }
        }
        return sum+roman.get(str.charAt(str.length()-1));
    }
}
