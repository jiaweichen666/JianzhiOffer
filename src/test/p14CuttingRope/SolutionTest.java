package test.p14CuttingRope; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import p14CuttingRope.Solution;

public class SolutionTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: maxProductAfterCutting_DynamicPlanning(int length) 
* 
*/ 
@Test
public void testMaxProductAfterCutting_DynamicPlanning() throws Exception { 
//TODO: Test goes here...
    Solution solution = new Solution();
    System.out.println("MaxLength by DynamicPlanning: "+solution.maxProductAfterCutting_DynamicPlanning(6));
} 

/** 
* 
* Method: maxProductAfterCutting_Greedy(int length) 
* 
*/ 
@Test
public void testMaxProductAfterCutting_Greedy() throws Exception { 
//TODO: Test goes here...
    Solution solution = new Solution();
    System.out.println("MaxLength by Greedy: "+solution.maxProductAfterCutting_Greedy(6));
} 


} 
