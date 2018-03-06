package test.p3duplicateNumInArray; 

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import p3duplicateNumInArray.Solution;

import static org.junit.Assert.assertTrue;

public class SolutionTest {

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: duplicate(int [] nums) 
* 
*/ 
@Test
public void testDuplicate() throws Exception {
    Solution solution = new Solution();
    int[] a = {2,3,1,0,2,5,3};
    boolean duplicate = true;
    assertTrue(solution.duplicate(a));
} 

/** 
* 
* Method: swap(int i, int j, int [] num) 
* 
*/ 
@Test
public void testSwap() throws Exception { 
//TODO: Test goes here... 
} 


} 
