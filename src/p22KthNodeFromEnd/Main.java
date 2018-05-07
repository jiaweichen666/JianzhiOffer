package p22KthNodeFromEnd;

public class Main {
    public static void main(String[] args) {
        ListNode[] listNodes = new ListNode[6];
        for (int i = 0; i < listNodes.length; i++) {
            listNodes[i] = new ListNode(i+1);
        }
        for (int i = 0; i < listNodes.length - 1; i++) {
            listNodes[i].next = listNodes[i + 1];
        }
        System.out.println(getKthFromEnd(listNodes[0],3).val);
    }
    public static ListNode getKthFromEnd(ListNode root,int k){
        if (root == null || k <= 0)
            return null;
        ListNode pAhead = root;
        ListNode pBehind = root;
        for (int i = 0; i < k - 1; i++) {
            if (pAhead.next != null)
                pAhead = pAhead.next;
            else
                return null;
        }
        while (pAhead.next != null){
            pAhead = pAhead.next;
            pBehind = pBehind.next;
        }
        return pBehind;
    }
}
