import java.util.Scanner;
public class Remove_nth_node {
    public static void main(String[] args) {
        int val;
        ListNode next;
        ListNode head = new ListNode();
        ListNode temp = head;
        System.out.print("Enter the size of the linked list : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of the node : ");
            int x = sc.nextInt();
            next = new ListNode(x);
            temp.next = next;
            temp = next;
        }
        System.out.print("Enter the value of the node to be removed : ");
        int y = sc.nextInt();
        int c=0;
        ListNode result = removeNthFromEnd(head, y);
        while (result != null) {
            c++;
            System.out.println(result.val);
            result = result.next;
        }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int c = 0;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        if (c == 1) {
            return null;
        }
        if (c == n) {
            return head.next;
        }
        temp = head;
        for (int i = 0; i < c - n - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
