import java.math.BigInteger;

public class Add_Two_Numbers_II {
    public static void main(String[] args){
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(3);
        
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        
        ListNode result = addTwoNumbers(l1, l2);
        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode ptr = l1;
        String num1 = "";
        while(ptr != null){
            num1 += ptr.val;
            ptr = ptr.next;
        }
        ptr = l2;
        String num2 = "";
        while(ptr != null){
            num2 += ptr.val;
            ptr = ptr.next;
        }
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        BigInteger sum = a.add(b);
        String sumStr = sum.toString();
        ListNode result = new ListNode(sumStr.charAt(0) - '0');
        ptr = result;
        for(int i = 1; i < sumStr.length(); i++){
            ptr.next = new ListNode(sumStr.charAt(i) - '0');
            ptr = ptr.next;
        }
        return result;
    }
} 