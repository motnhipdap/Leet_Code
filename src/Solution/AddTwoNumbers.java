package Solution;

import Utils.ListNode;

public class AddTwoNumbers {
    public static ListNode solution(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null)
            return null;

        ListNode n1 = l1;
        ListNode n2 = l2;

        int h = 0;

        ListNode res = new ListNode();
        ListNode dummy = res;

        while (n1 != null || n2 != null || h != 0) {

            int sum = h;
            if (n1 != null) {
                sum += n1.val;
                n1 = n1.next;
            }
            if (n2 != null) {
                sum += n2.val;
                n2 = n2.next;
            }

            res.next = new ListNode(sum % 10);
            res = res.next;
            h = sum / 10;
        }

        return dummy.next;
    }

    public static void main(String[] args) throws Exception {
        ListNode n1 = new ListNode();
        ListNode n2 = new ListNode();

        var n3 = n1;
        var n4 = n2;

        for (int i = 0; i < 3; i++) {
            n1.val = i;
            n2.val = i;
            n1.next = new ListNode();
            n2.next = new ListNode();
            n1 = n1.next;
            n2 = n2.next;
        }

        AddTwoNumbers.solution(n3, n4);
    }
}
