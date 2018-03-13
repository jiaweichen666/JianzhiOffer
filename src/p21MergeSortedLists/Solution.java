package p21MergeSortedLists;

public class Solution {
    public ListNode mergeSortedLists(ListNode head1,ListNode head2){
        if (head1 == null)
            return head2;
        else if (head2 == null)
            return head1;
        ListNode newHead = null;
        if (head1.val < head2.val){
            newHead = head1;
            newHead.next = mergeSortedLists(head1.next,head2);
            return newHead;
        }else{
            newHead = head2;
            newHead.next = mergeSortedLists(head1,head2.next);
            return newHead;
        }
    }
}
