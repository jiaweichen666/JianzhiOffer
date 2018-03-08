package test.p10NewFibonacci; 

import org.junit.Test;
import p10NewFibonacci.Solution;

public class SolutionTest {
@Test
public void testFibonacci() throws Exception { 
//TODO: Test goes here...
    Solution solution = new Solution();
    for (int i = 0; i < 10; i++) {
        System.out.println("The "+i+"nd num: "+solution.Fibonacci(i));
    }
} 


} 
