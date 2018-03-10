package test.DleleteDuplicatedNodes; 

import DleleteDuplicatedNodes.ListNode;
import DleleteDuplicatedNodes.Solution;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
public class SolutionTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: deleteDuplication(ListNode head) 
* 
*/ 
@Test
public void testDeleteDuplication() throws Exception { 
//TODO: Test goes here...
    ListNode listNode1 = new ListNode(1);
    ListNode listNode2 = new ListNode(2);
    ListNode listNode3 = new ListNode(2);
    ListNode listNode4 = new ListNode(2);
    ListNode listNode5 = new ListNode(3);
    ListNode listNode6 = new ListNode(5);
    ListNode listNode7 = new ListNode(5);
    ListNode listNode8 = new ListNode(5);
    listNode1.next = listNode2;
    listNode2.next = listNode3;
    listNode3.next = listNode4;
    listNode4.next = listNode5;
    listNode5.next = listNode6;
    listNode6.next = listNode7;
    listNode7.next = listNode8;
    ListNode head;
    head = listNode1;
    Solution solution  = new Solution();
    solution.deleteDuplication(head);
    ListNode current = head;
    while(current != null){
        System.out.println(current.val);
        current = current.next;
    }

}


} 
