package test.p3FindInPartiallySortedMatix; 

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import p3FindInPartiallySortedMatix.Solution;

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
* Method: find(int[][] matirx, int target) 
* 
*/ 
@Test
public void testFind() throws Exception {
    int[][] matrix = {{1,2,8,9},{2,4,9,2},{4,7,10,13},{6,8,11,15}};
    Solution solution = new Solution();
    assertTrue(solution.find(matrix,7));
} 


} 
