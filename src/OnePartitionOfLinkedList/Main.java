package OnePartitionOfLinkedList;

public class Main {
    public static void main(String[] args) {
        ListNode listNode3 = new ListNode(3);
        ListNode listNode7 = new ListNode(7);
        ListNode listNode8 = new ListNode(8);
        ListNode listNode1 = new ListNode(1);
        listNode7.next = listNode8;
        listNode8.next = listNode1;
        listNode1.next = listNode3;
        ListNode listNode = onPartition(listNode7,3);
        ListNode p = listNode;
        while (p != null){
            System.out.print(p.val + " ");
            p = p.next;
        }

    }
    public static ListNode onPartition(ListNode head,int val){
        if (head == null)
            return null;
        if (head.next == null)
            return head;
        ListNode smallerList = null;
        ListNode equalList = null;
        ListNode biggerList = null;
        ListNode cur = head;
        ListNode sp = null;
        ListNode ep = null;
        ListNode bp = null;
        while (cur != null){
            if (cur.val == val){
                if (equalList == null){
                    equalList = cur;
                    ep = equalList;
                }else {
                    ep.next = cur;
                    ep = ep.next;
                }
            }else if (cur.val < val){
                if (smallerList == null){
                    smallerList = cur;
                    sp = smallerList;
                }else {
                    sp.next = cur;
                    sp = sp.next;
                }
            }else {
                if(biggerList == null){
                    biggerList = cur;
                    bp = biggerList;
                }else {
                    bp.next = cur;
                    bp = bp.next;
                }
            }
            cur = cur.next;
        }
        ListNode returnNode = null;
        if (sp != null)
            sp.next = equalList;
        if (ep != null) {
            ep.next = biggerList;
            bp.next = null;
        }
        if (smallerList != null)
            returnNode = smallerList;
        else  if (equalList != null)
            returnNode = equalList;
        else
            returnNode = biggerList;
        return  returnNode;
    }
}
