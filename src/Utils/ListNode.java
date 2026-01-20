package Utils;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode build(int[] a) {
        ListNode dummy = new ListNode(a[0]);
        ListNode cur = dummy;

        for (int x : a) {
            cur.next = new ListNode(x);
            cur = cur.next;
        }
        return dummy.next;
    }


    public static void preOrder(ListNode head) {
        if (head == null) {
            return;
        }
        System.out.print(head.val);
        preOrder(head.next);
    }

}