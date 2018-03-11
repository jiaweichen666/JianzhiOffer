package test.AllSortFunctions; 

import AllSortFunctions.MinHeap;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class MinHeapTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: isEmpty() 
* 
*/ 
@Test
public void testIsEmpty() throws Exception { 
//TODO: Test goes here...
    int[] nums = {-20,1,4,2,3,8,9,5,7,6};
    MinHeap minHeap = new MinHeap();
    minHeap.heapSort(nums);
}
/** 
* 
* Method: size() 
* 
*/ 
@Test
public void testSize() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: isLess(int i, int j, int[] nums) 
* 
*/ 
@Test
public void testIsLess() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: swap(int i, int j, int[] nums) 
* 
*/ 
@Test
public void testSwap() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: swim(int i) 
* 
*/ 
@Test
public void testSwim() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: sink(int i) 
* 
*/ 
@Test
public void testSink() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: insert(int i) 
* 
*/ 
@Test
public void testInsert() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: deleteMin() 
* 
*/ 
@Test
public void testDeleteMin() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: buildHeap() 
* 
*/ 
@Test
public void testBuildHeap() throws Exception { 
//TODO: Test goes here... 
} 


} 
