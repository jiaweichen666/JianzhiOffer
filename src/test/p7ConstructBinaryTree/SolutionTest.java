package test.p7ConstructBinaryTree; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import p7ConstructBinaryTree.Solution;

public class SolutionTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: reConstruct(int[] pre, int[] in) 
* 
*/ 
@Test
public void testReConstruct() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: helper(int[] pre, int[] in, int prestart, int preend, int instart, int inend) 
* 
*/ 
@Test
public void testHelper() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: preOrderTravesal(TreeNode root) 
* 
*/ 
@Test
public void testPreOrderTravesal() throws Exception { 
//TODO: Test goes here...
    int[] pre = {1,2,4,7,3,5,6,8};
    int[] in = {4,7,2,1,5,3,8,6};
    Solution solution = new Solution();
    solution.preOrderTravesal(solution.reConstruct(pre,in));
} 


} 
