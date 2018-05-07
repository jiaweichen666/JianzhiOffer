package p22_02MiddleNodeOfList;

public class Main {
    public static void main(String[] args) {
        ListNode[] listNodes = new ListNode[5];
        for (int i = 0; i < listNodes.length; i++) {
            listNodes[i] = new ListNode(i+1);
        }
        for (int i = 0; i < listNodes.length - 1; i++) {
            listNodes[i].next = listNodes[i + 1];
        }
        System.out.println(getMiddleNode(listNodes[0]).val);
    }
    public static ListNode getMiddleNode(ListNode root){
        if (root == null)
            return null;
        ListNode pAhead = root;
        ListNode pBehind = root;
        ListNode midNode = null;
        while (pAhead != null){
            if (pAhead.next != null){
                pAhead = pAhead.next;
            }else {
                midNode = pBehind;
                break;
            }
            if (pAhead.next != null){
                pAhead = pAhead.next;
                pBehind = pBehind.next;
            }else {
                midNode = pBehind;
                break;
            }
        }
        return midNode;
    }
}
