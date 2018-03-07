package test.p8NextNodeBinaryTrees; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import p8NextNodeBinaryTrees.Solution;
import p8NextNodeBinaryTrees.TreeNode;

public class SolutionTest {

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: nextNode(TreeNode root) 
* 
*/ 
@Test
public void testNextNode() throws Exception { 
//TODO: Test goes here...
    TreeNode treeNode1 = new TreeNode(1);
    TreeNode treeNode2 = new TreeNode(2);
    TreeNode treeNode3 = new TreeNode(3);
    TreeNode treeNode4 = new TreeNode(4);
    TreeNode treeNode5 = new TreeNode(5);
    TreeNode treeNode6 = new TreeNode(6);
    TreeNode treeNode7 = new TreeNode(7);
    treeNode1.leftChild = treeNode2;
    treeNode1.rightChild = treeNode3;
    treeNode2.leftChild = treeNode4;
    treeNode2.rightChild = treeNode5;
    treeNode3.leftChild = treeNode6;
    treeNode3.rightChild = treeNode7;
    treeNode1.parent = null;
    treeNode2.parent = treeNode1;
    treeNode3.parent = treeNode1;
    treeNode4.parent = treeNode2;
    treeNode5.parent = treeNode2;
    treeNode6.parent = treeNode3;
    treeNode7.parent = treeNode3;
    Solution solution = new Solution();
    TreeNode next = solution.nextNode(treeNode5);
    if (next != null)
        System.out.println(next.val);
    else
        System.out.println("NULL");
} 


} 
