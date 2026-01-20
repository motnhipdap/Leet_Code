package Solution;

import Utils.ListNode;

public class Swap_Nodes_in_Pairs {
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null
                || head.next.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        while (prev.next != null && prev.next.next != null) {
            ListNode first = prev.next;
            ListNode second = prev.next.next;

            first.next = second.next;

            prev.next = second;
            second.next = first;
            prev = first;
        }

        return dummy.next;

    }
}
