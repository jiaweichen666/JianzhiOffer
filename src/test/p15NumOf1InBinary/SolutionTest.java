package test.p15NumOf1InBinary; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import p15NumOf1InBinary.Solution;

public class SolutionTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: test() 
* 
*/ 
@Test
public void testTest() throws Exception { 
//TODO: Test goes here...
    Solution solution = new Solution();
    System.out.println("Better "+solution.numOf1_Better(0x80000000));
    System.out.println("Normal "+solution.numOf1_Normal(0xfFFFFFFF));
}


} 
