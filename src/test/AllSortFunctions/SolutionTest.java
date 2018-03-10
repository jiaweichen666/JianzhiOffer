package test.AllSortFunctions; 

import AllSortFunctions.Solution;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.Arrays;

public class SolutionTest {

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: swap(int i, int j, int[] nums) 
* 
*/ 
@Test
public void testSwap() throws Exception {
//TODO: Test goes here...
    Solution solution = new Solution();
    int[] nums = {1,4,2,3,8,9,5,7,6};
    solution.fastSort(nums,0,nums.length - 1 );
    System.out.println(Arrays.toString(nums));
} 

/** 
* 
* Method: selectSort(int[] nums) 
* 
*/ 
@Test
public void testSelectSort() throws Exception { 
//TODO: Test goes here... 
} 


} 
