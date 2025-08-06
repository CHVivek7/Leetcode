public class Swap_Nodes_in_Pairs {
    public static ListNode swapPairs(ListNode head) {
        // Create a dummy node that points to the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        // Loop through the list in pairs
        while (current.next != null && current.next.next != null) {
            // Nodes to swap
            ListNode first = current.next;
            ListNode second = current.next.next;

            // Swap the nodes
            first.next = second.next;
            second.next = first;
            current.next = second;

            // Move to the next pair
            current = first;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode swappedHead = swapPairs(head);
        printList(swappedHead);
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
