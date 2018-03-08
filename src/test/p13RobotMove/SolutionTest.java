package test.p13RobotMove; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import p13RobotMove.Solution;

public class SolutionTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getDigitSum(int num) 
* 
*/ 
@Test
public void testGetDigitSum() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: check(int threshold, int row, int col, int rows, int cols, boolean[][] visited) 
* 
*/ 
@Test
public void testCheck() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: movingCount(int threshold, int rows, int cols) 
* 
*/ 
@Test
public void testMovingCount() throws Exception { 
//TODO: Test goes here...
    Solution solution = new Solution();
    int count = solution.movingCount(18,10000,10000);
    System.out.println("Robot can move to "+count +" squares.");
} 

/** 
* 
* Method: movingCountHelper(int threshold, int row, int col, int rows, int cols, boolean[][] visited) 
* 
*/ 
@Test
public void testMovingCountHelper() throws Exception { 
//TODO: Test goes here... 
} 


} 
