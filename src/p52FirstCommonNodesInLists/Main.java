package p52FirstCommonNodesInLists;

import java.util.Stack;

/**
 * Author:chen
 * Time:2018/4/23/10:49
 * Description:找出两个链表的第一个公共节点
 */
public class Main {
    public static void main(String[] args) {
        ListNode[] listNodes = new ListNode[7];
        for (int i = 0; i < listNodes.length; i++) {
            listNodes[i] = new ListNode(i+1);
        }
        listNodes[0].setNext(listNodes[1]);
        listNodes[1].setNext(listNodes[2]);
        listNodes[2].setNext(listNodes[5]);
        listNodes[5].setNext(listNodes[6]);
        listNodes[3].setNext(listNodes[4]);
        listNodes[4].setNext(listNodes[5]);
        ListNode common  = getFirstCommonNode(listNodes[0],listNodes[3]);
        System.out.println(common.getVal());
    }
    public static ListNode getFirstCommonNode(ListNode listNode1,ListNode listNode2){
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        ListNode p = listNode1;
        ListNode q = listNode2;
        while (p != null || q!= null){
            if (p != null){
                stack1.push(p);
                p = p.getNext();
            }
            if (q != null){
                stack2.push(q);
                q = q.getNext();
            }
        }
        ListNode a = stack1.pop();
        ListNode b = stack2.pop();
        while (a == b && stack1.peek().getVal()==stack2.peek().getVal()){
            a = stack1.pop();
            b = stack2.pop();
        }
        return a;
    }
}
