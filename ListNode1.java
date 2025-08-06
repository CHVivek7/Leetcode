import java.util.Scanner;

public class ListNode1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the first list and the second list: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        ListNode L1 = new ListNode(0); // Dummy head
        ListNode L2 = new ListNode(0); // Dummy head
        ListNode temp1 = L1;
        ListNode temp2 = L2;

        System.out.println("Enter the elements of the first list: ");
        for (int i = 0; i < n; i++) {
            temp1.next = new ListNode(sc.nextInt());
            temp1 = temp1.next;
        }

        System.out.println("Enter the elements of the second list: ");
        for (int i = 0; i < m; i++) {
            temp2.next = new ListNode(sc.nextInt());
            temp2 = temp2.next;
        }

        ListNode L3 = mergeTwoLists(L1.next, L2.next); // Skip dummy head
        printList(L3);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if (l1 != null) {
            temp.next = l1;
        } else {
            temp.next = l2;
        }
        return dummy.next;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
