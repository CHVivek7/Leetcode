import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Merge_k_Sorted_Lists {
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null ) {
            // Handle empty input list
            return null;
        }
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            while(lists[i]!=null){
                arr.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }

        if(arr.isEmpty()){
            return null;
        }
        Collections.sort(arr);
        ListNode head = new ListNode(arr.get(0));
        ListNode current = head;

        for (int i = 1; i < arr.size(); i++) {
            current.next = new ListNode(arr.get(i));
            current = current.next;
        }

        return head;
    }
    public static void main(String[] args) {
        // Example usage
        ListNode[] lists = new ListNode[3];
        lists[0] = new ListNode(1, new ListNode(4, new ListNode(5)));
        lists[1] = new ListNode(1, new ListNode(3, new ListNode(4)));
        lists[2] = new ListNode(2, new ListNode(6));

        ListNode mergedList = mergeKLists(lists);
        printList(mergedList);
    }

    // Utility method to print the linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print("->");
            }
            node = node.next;
        }
        System.out.println();
    }
}
