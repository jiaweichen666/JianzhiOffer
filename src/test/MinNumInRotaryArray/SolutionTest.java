package test.MinNumInRotaryArray; 

import MinNumInRotaryArray.Solution;
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
* Method: findMinInRotaryArray(int []nums)
*
*/
@Test
public void testFindMinInRotaryArray() throws Exception { 
//TODO: Test goes here...
    int [] nums = {1,1,1,0,1};
    Solution solution = new Solution();
    System.out.println(nums[solution.findMinInRotaryArray(nums)]);

} 


} 
