import java.util.Scanner;
public class Add_Two_Numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of digits for first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter digits for first number (in reverse order, space separated): ");
        ListNode l1 = null, curr1 = null;

        // Input for first number
        for (int i = 0; i < n1; i++) {
            int val = sc.nextInt();
            if (l1 == null) {
            l1 = new ListNode(val);
            curr1 = l1;
            } else {
            curr1.next = new ListNode(val);
            curr1 = curr1.next;
            }
        }

        // Input for second number
        System.out.print("Enter number of digits for second number: ");
        int n2 = sc.nextInt();
        System.out.print("Enter digits for second number (in reverse order, space separated): ");
        ListNode l2 = null, curr2 = null;
        for (int i = 0; i < n2; i++) {
            int val = sc.nextInt();
            if (l2 == null) {
            l2 = new ListNode(val);
            curr2 = l2;
            } else {
            curr2.next = new ListNode(val);
            curr2 = curr2.next;
            }
        }
        
        ListNode result = addTwoNumbers(l1, l2);
        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        String str="";
        while(l1!=null){
            str = str+l1.val;
        }
        
        String str1="";
        while(l2!=null){
            str1 = str1+l2.val;
        }
        int num1 = Integer.parseInt(str);
        return l1;
    }
} 