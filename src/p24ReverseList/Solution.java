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
    public ListNode reverseList_recursive(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        else {
            ListNode newHead = reverseList_recursive(head.next);//递归找到最后一个节点作为newHead
            head.next.next = head;//head节点的下一节点的next指针指向head，相当于逆序。
            head.next = null;
            return newHead;
        }
    }
}
