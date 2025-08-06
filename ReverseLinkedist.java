import java.util.*;
public class ReverseLinkedist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            if (n <= 0) {
                return;
            }
            ListNode head = new ListNode(scanner.nextInt());
            ListNode current = head;
            for (int i = 1; i < n; i++) {
                int val = scanner.nextInt();
                current.next = new ListNode(val);
                current = current.next;
            }
            ListNode newHead = reverseList(head);
            printList(newHead);
    }
    public static ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        ListNode current = head;
        while (current != null) {
            stack.push(current);
            current = current.next;
        }
        ListNode newHead = stack.pop();
        current = newHead;
        while (!stack.isEmpty()) {
            current.next = stack.pop();
            current = current.next;
        }
        current.next = null;
        return newHead;
    }
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
    
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}