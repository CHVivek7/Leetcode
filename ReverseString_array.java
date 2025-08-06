public class ReverseString_array {
    public static void main(String[] args) {
        char[] arr = {'h','e','l','l','o'};
                int start = 0;  
                int end = arr.length - 1;  
        
                while (start < end) {  
                    // Swap characters at start and end  
                    char temp = arr[start];  
                    arr[start] = arr[end];  
                    arr[end] = temp;  
                    
                    // Move towards the middle  
                    start++;  
                    end--;  
                }
            
            System.out.println(arr);
    }
}
