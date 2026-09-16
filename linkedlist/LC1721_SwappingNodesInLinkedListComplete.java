package linkedlist;

public class LC1721_SwappingNodesInLinkedListComplete {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        ListNode second = head;
        ListNode kth = head;

        for (int i = 1; i < k; i++) {
            kth = kth.next;
        }

        first = kth;
        ListNode temp = kth;

        while (temp.next != null) {
            temp = temp.next;
            second = second.next;
        }

        int val = first.val;
        first.val = second.val;
        second.val = val;

        return head;
    }

    public static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = swapNodes(head, 2);
        print(head);
    }
}
