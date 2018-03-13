package p24ReverseList;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode[] listNodes = new ListNode[5];
        for (int i = 0; i < 5; i++) {
            listNodes[i] = new ListNode(i+1);
        }
        for (int i = 0; i < 4; i++) {
            listNodes[i].next = listNodes[i + 1];
        }
        ListNode head = listNodes[0];
        ListNode reversedListHead = solution.reverseList(head);
        ListNode p = reversedListHead;
        while(p != null){
            System.out.println(p.val);
            p = p.next;
        }
    }
}
