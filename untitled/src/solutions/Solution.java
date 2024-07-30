package solutions;

public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, null);
        ListNode head1 = new ListNode(0, null);
        ListNode head2 = new ListNode(1, null);

        head.next = head1;
        head1.next = head2;

        int result = getDecimalValue(head);
        System.out.println(result);
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    }

    public static int getDecimalValue(ListNode head) {

    }
}
