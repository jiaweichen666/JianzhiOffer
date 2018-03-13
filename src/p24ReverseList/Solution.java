package p24ReverseList;

public class Solution {
    public ListNode reverseList(ListNode head){
        ListNode pNode = head;
        ListNode reversedListHead = null;
        ListNode pPre = null;
        while(pNode != null){
            ListNode pNext = pNode.next;
            if(pNext == null){
                reversedListHead = pNode;
            }
            pNode.next = pPre;
            pPre = pNode;
            pNode = pNext;
        }
        return reversedListHead;
    }
}
