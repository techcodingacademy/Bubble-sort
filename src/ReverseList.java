public class ReverseList {

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }

    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.data + (head.next != null ? " -> " : ""));
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ReverseList reverseList = new ReverseList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original list:");
        reverseList.printList(head);

        ListNode reversed = reverseList.reverseList(head);
        System.out.println("Reversed list:");
        reverseList.printList(reversed);
    }
}