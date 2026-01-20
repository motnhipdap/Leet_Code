package Solution;

import Utils.ListNode;

public class Merge_Two_Sorted_Lists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode ans = new ListNode(0);
        ListNode dummy = ans;
        
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                dummy.next = l1;
                dummy = dummy.next;
                l1 = l1.next;
            } else {
                dummy.next = l2;
                dummy = dummy.next;
                l2 = l2.next;
            }
        }

        ListNode.preOrder(ans);
        System.out.println();

        while (l1 != null) {
            dummy.next = l1;
            dummy = dummy.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            dummy.next = l2;
            dummy = dummy.next;
            l2 = l2.next;
        }

        return ans.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();

        l1 = l1.build(new int[]{1, 2, 4});
        l2 = l2.build(new int[]{1, 3, 4});

        ListNode.preOrder(mergeTwoLists(l1, l2));
    }
}
