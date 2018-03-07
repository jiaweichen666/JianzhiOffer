package test.p6PrintListInReversedOrder; 

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import p6PrintListInReversedOrder.ListNode;
import p6PrintListInReversedOrder.Solution;

public class SolutionTest {

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: printListReversingly_Iteratively(ListNode head) 
* 
*/ 
@Test
public void testPrintListReversingly_Iteratively() throws Exception {
    ListNode one = new ListNode(0);
    ListNode head = one;
    ListNode p = head;
    for (int i = 1; i < 10 ; i++) {
        p.next = new ListNode(i);
        p = p.next;
    }
    Solution solution = new Solution();
    solution.printListReversingly_Iteratively(head);
}

/** 
* 
* Method: printListReversingly_Recursively(ListNode head) 
* 
*/ 
@Test
public void testPrintListReversingly_Recursively() throws Exception { 
//TODO: Test goes here...
    ListNode one = new ListNode(0);
    ListNode head = one;
    ListNode p = head;
    for (int i = 1; i < 10 ; i++) {
        p.next = new ListNode(i);
        p = p.next;
    }
    Solution solution = new Solution();
    solution.printListReversingly_Recursively(head);
} 


} 
