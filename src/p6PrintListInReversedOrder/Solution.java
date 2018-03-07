package p6PrintListInReversedOrder;

import java.util.Stack;

public class Solution {
    public void printListReversingly_Iteratively(ListNode head){
        Stack<Integer> stack = new Stack<>();
        ListNode p = head;
        while(p != null){
            stack.push(p.val);
            p = p.next;
        }
        while(!stack.empty()){
            System.out.print(stack.pop()+" ");
        }
        System.out.println();
    }
    public void printListReversingly_Recursively(ListNode head){
        if (head != null){
            ListNode p = head;
            if(p.next != null){
                printListReversingly_Recursively(p.next);
            }
            System.out.print(" "+p.val);
        }
    }
}
