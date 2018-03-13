package p23EntryNodeInListLoop;

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
