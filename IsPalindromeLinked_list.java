public class IsPalindromeLinked_list {
    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        System.out.println(isPalindrome(head)); // Output: Yes
    }

    public static String isPalindrome(ListNode head) {
        if (head == null) {
            return "No";
        }

        StringBuilder res = new StringBuilder();
        ListNode temp = head;
        while (temp != null) {
            res.append(temp.val).append(" ");
            temp = temp.next;
        }
        String original = res.toString().trim();
        String reversed = new StringBuilder(original).reverse().toString();

        if (original.equals(reversed)) {
            return "Yes";
        } else {
            return "No";
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
