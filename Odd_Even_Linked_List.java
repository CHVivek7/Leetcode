import java.util.Scanner;

public class Odd_Even_Linked_List {
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
        head = oddEvenList(head);
        printList(head);
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
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
