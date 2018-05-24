package p23EntryNodeInListLoop;

/**
 * Description:一个链表中包含环，请找出该链表的环的入口结点。
 * Tips：注释掉的代码用的是pfast节点走circleLen步，最后循环终止的条件是pfast 和 pslow相遇即指向入口节点
 * 没有注释的代码是使用的求链表的倒数第k个节点的思想，将环形链表展开。
 * 求环的入口节点即求展开链表的倒数第circlelen个节点，先让pfast走circlelen - 1步。
 * 循环结束的条件是pfast.next = pslow，跟求链表的倒数第k个节点的终止条件p.next = null类似。
 */
/*
public class Solution {
    public ListNode meetingNode(ListNode head){
        if (head == null)
            return null;
        ListNode pSlow = head.next;
        if (pSlow == null){
            return null;
        }
        ListNode pFast = pSlow.next;
        while(pSlow != null && pFast != null){
            if (pSlow == pFast)
                return pFast;
            pSlow = pSlow.next;
            pFast = pFast.next;
            if (pFast != null)
                pFast = pFast.next;
        }
            return null;
    }
    public ListNode entryNodeofList(ListNode head){
        ListNode meetingNode = meetingNode(head);
        if (meetingNode == null)
            return null;
        ListNode countingNode = meetingNode;
        int rotaryListCount = 1;
        while(countingNode.next != meetingNode){
            countingNode = countingNode.next;
            rotaryListCount++;
        }
        ListNode pSlow,pFast;
        pSlow = pFast = head;
        for (int i = 1; i <= rotaryListCount ; i++) {
            pFast = pFast.next;
        }
        while(pSlow != pFast){
            pSlow = pSlow.next;
            pFast = pFast.next;
        }
        return pFast;
    }
}
*/
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead == null)
            return null;
        ListNode p1 = pHead;
        ListNode p2 = pHead;
        ListNode meetingNode = getmeetingNode(pHead);
        if(meetingNode == null)
            return null;
        int len = getCircleLen(meetingNode);
        for(int i = 0; i < len - 1;i++){
            p1 = p1.next;
        }
        while(p1.next != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
    public ListNode getmeetingNode(ListNode pHead){
        if(pHead == null)
            return null;
        ListNode meetingNode = null;
        ListNode p1 = pHead;
        ListNode p2 = pHead.next;
        if (p2 == null)
            return  null;
        p2 = p2.next;
        while(p1 != p2 && p2 != null){
            if(p1 != null)
                p1 = p1.next;
            if(p2 != null)
                p2 = p2.next;
            if(p2 != null)
                p2 = p2.next;
        }
        if(p2 == null)
            return null;
        else if(p1 == p2)
            meetingNode = p1;
        return meetingNode;
    }
    public int getCircleLen(ListNode meetingnode){
        ListNode flag = meetingnode;
        ListNode p = meetingnode.next;
        int count = 1;
        while(p != flag){
            count++;
            p = p.next;
        }
        return count;
    }
}