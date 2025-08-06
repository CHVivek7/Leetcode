import java.util.LinkedHashMap;
import java.util.Map;

public class First_Unique_Character_in_String {
    public static void main(String[] args) {
        String s = "aadadaacd";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return s.indexOf(entry.getKey());
            }
        }
        return -1;
    }
}
