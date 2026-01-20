package Solution;

import Utils.ListNode;

public class Remove_Nth_Node_From_End_Of_List {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        for (int i = 0; i <= n; i++)
            fast = fast.next;

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };

        ListNode head = new ListNode();
        head = head.build(a);
        ListNode res = removeNthFromEnd(head, 2);
        ListNode.preOrder(res);
    }
}
