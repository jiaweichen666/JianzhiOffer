package p21MergeSortedLists;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode[] listNodes1 = new ListNode[5];
        for (int i = 0; i < 5; i++) {
            listNodes1[i] = new ListNode(i+1);
        }
        for (int i = 0; i < 4; i++) {
            listNodes1[i].next = listNodes1[i + 1];
        }
        ListNode[] listNodes2 = new ListNode[5];
        for (int i = 0; i < 5; i++) {
            listNodes2[i] = new ListNode(i+6);
        }
        for (int i = 0; i < 4; i++) {
            listNodes2[i].next = listNodes2[i + 1];
        }
        ListNode head1 = listNodes1[0];
        ListNode head2 = listNodes2[0];
        ListNode newHead = solution.mergeSortedLists(head1,head2);
        ListNode p = newHead;
        while (p != null){
            System.out.println(p.val);
            p = p.next;
        }
    }
}
