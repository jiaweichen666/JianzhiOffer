package test.p16Power; 

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import p16Power.Solution;

public class SolutionTest {

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: power(double base, int exponent) 
* 
*/ 
@Test
public void testPower() throws Exception { 
//TODO: Test goes here...
    Solution solution = new Solution();
    System.out.println(solution.power(-2,11));
} 

/** 
* 
* Method: powerWithUnsinedExponet(double base, int exponet) 
* 
*/ 
@Test
public void testPowerWithUnsinedExponet() throws Exception { 
//TODO: Test goes here... 
} 


} 
