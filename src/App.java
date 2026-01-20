import Solution.AddTwoNumbers;
import Utils.ListNode;

public class App {
    public static void main(String[] args) throws Exception {
        ListNode n1 = new ListNode();
        ListNode n2 = new ListNode();

        for (int i = 0; i < 3; i++) {
            n1.val = i;
            n2.val = i;
            n1.next = new ListNode();
            n2.next = new ListNode();
            n1 = n1.next;
            n2 = n2.next;
        }

        AddTwoNumbers.solution(n1, n2);
    }
}
