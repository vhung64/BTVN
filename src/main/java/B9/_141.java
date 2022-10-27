package B9;

public class _141 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;
        System.out.println(hasCycle(node1));
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        ListNode node1 = head;
        ListNode node2 = head;
        while (node2.next != null && node2.next.next != null){
            node1 = node1.next;
            node2 = node2.next.next;
            if (node1 == node2)
                return true;
        }
        return false;
    }
}
