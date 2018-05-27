package p18_02DeleteDuplicatedNode;

/**
 * Description:删除链表中的重复节点
 * Tip：设置一个新的头部节点以应对头结点也要被删除的情况。
 * 注意在检查p.val 的时候应该先检查p是否为null
 */
public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if (pHead == null || pHead.next == null)
            return  pHead;
        ListNode newHead = new ListNode(-1);
        newHead.next = pHead;
        ListNode pre = newHead;
        ListNode p = pHead;
        while (p != null && p.next != null){
            if (p.val == p.next.val){
                int val = p.val;
                while (p != null && p.val == val)
                    p = p.next;
                pre.next = p;
            }else {
                pre = p;
                p = p.next;
            }
        }
        return newHead.next;
    }
}
