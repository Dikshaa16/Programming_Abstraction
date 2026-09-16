package circularlinkedlist;

public class JosephusProblemCLLComplete {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int josephus(int n, int k) {
        Node head = new Node(1);
        Node prev = head;
        for (int i = 2; i <= n; i++) {
            prev.next = new Node(i);
            prev = prev.next;
        }
        prev.next = head;

        Node curr = head;
        while (curr.next != curr) {
            for (int i = 1; i < k - 1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
            curr = curr.next;
        }

        return curr.data;
    }

    public static void main(String[] args) {
        int n = 7;
        int k = 3;
        System.out.println("The survivor is: " + josephus(n, k));
    }
}
