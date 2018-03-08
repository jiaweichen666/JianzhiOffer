package test.StringPathInMatirx; 

import StringPathInMatirx.Solution;
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
* Method: havePath(int[][] matrix, String string) 
* 
*/ 
@Test
public void testHavePath() throws Exception { 
//TODO: Test goes here...
    Solution solution = new Solution();
    char[][] matrix = {{'a','b','t','g'},{'c','f','c','s'},{'j','d','e','h'}};
    String s  = "bfce";
    if (solution.havePath(matrix,s)){
        System.out.println("Yes,have an path!");
    }else
        System.out.println("No path exists!");
} 

/** 
* 
* Method: helper(int[][] matrix, boolean[][] visited, int row, int col, int rows, int cols, int charindex, char[] chars) 
* 
*/ 
@Test
public void testHelper() throws Exception { 
//TODO: Test goes here... 
} 


} 
