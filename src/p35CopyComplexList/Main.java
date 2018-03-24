package p35CopyComplexList;

public class Main {
    public static void main(String[] args) {
        ListNode[] listNodes = new ListNode[5];
        for (int i = 0; i < listNodes.length; i++) {
            listNodes[i] = new ListNode(i+1);
        }
        for (int i = 0; i < listNodes.length - 1; i++) {
            listNodes[i].next = listNodes[i+1];
        }
        listNodes[0].sibling = listNodes[2];
        listNodes[1].sibling = listNodes[4];
        listNodes[3].sibling = listNodes[1];
        Solution solution = new Solution();
        ListNode clonedHead = solution.cloneComplexList(listNodes[0]);
        ListNode node = clonedHead;
        while(node != null){
            System.out.println(node.val);
            if (node.sibling != null){
                System.out.println(" sibling: "+node.sibling.val);
            }
            node = node.next;
        }
    }
}
