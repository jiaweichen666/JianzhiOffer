package p23EntryNodeInListLoop;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode[] listNodes = new ListNode[6];
        for (int i = 0; i < 6 ; i++) {
            listNodes[i] = new ListNode(i + 1);
        }
        for (int i = 0; i < 5 ; i++) {
            listNodes[i].next = listNodes[i + 1];
        }
        listNodes[5].next = listNodes[2];
        ListNode startNode = solution.EntryNodeOfLoop(listNodes[0]);
        System.out.println(startNode.val);
    }
}
