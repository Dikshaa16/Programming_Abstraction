package linkedlist;

public class LC0086_PartitionListComplete {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode(0);
        ListNode greater = new ListNode(0);
        ListNode lessPtr = less;
        ListNode greaterPtr = greater;

        while (head != null) {
            if (head.val < x) {
                lessPtr.next = head;
                lessPtr = lessPtr.next;
            } else {
                greaterPtr.next = head;
                greaterPtr = greaterPtr.next;
            }
            head = head.next;
        }

        greaterPtr.next = null;
        lessPtr.next = greater.next;

        return less.next;
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
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);

        head = partition(head, 3);
        print(head);
    }
}
