package test.QuickSort; 

import QuickSort.Solution;
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
* Method: partition(int[] nums) 
* 
*/ 
@Test
public void testPartition() throws Exception { 
//TODO: Test goes here...
    int [] num = {5,3,6,7,2,1,9};
    Solution solution = new Solution();
    solution.quickSort(num,0,num.length-1);
} 

/** 
* 
* Method: swap(int a, int b) 
* 
*/ 
@Test
public void testSwap() throws Exception { 
//TODO: Test goes here... 
} 


} 
