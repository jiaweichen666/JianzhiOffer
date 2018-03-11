package AllSortFunctions;

import java.util.Arrays;

public class MinHeap {
    private int[] heap;
    private int N;
    public MinHeap(){
    }
    public boolean isEmpty(){
        return (N == 0);
    }
    public int size(){
        return N;
    }
    public boolean isLess(int i,int j ,int[] nums){
        return nums[i] < nums[j];
    }
    public void swap(int i,int j,int[] nums){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    public void swim(int i){
        while(i > 1 && isLess(i,i/2,heap)){
            swap(i,i/2,heap);
            i = i / 2;
        }
    }
    public void sink(int i ){
        while(i * 2 <= N){
            int j = i * 2;
            if (j < N && isLess(j + 1,j,heap))
                j++;
            if (isLess(i,j,heap))
                break;
            swap(i,j,heap);
            i = j;
        }
    }
    public void insert(int i){
        heap[++N] = i;
        swim(N);
    }
    public int  deleteMin(){
        int min = heap[1];
        swap(1,N--,heap);
        heap[N + 1] = 0;
        sink(1);
        return min;
    }
    public void buildHeap(){
        for (int i = 1; i < heap.length; i++) {
            sink(i);
        }
    }
    public void heapSort(int[] nums){
        heap = nums;
        N = nums.length - 1;
        int[] tmp = new int[N];
        buildHeap();
        int deletetimes = N;
        for (int i = 1; i <= deletetimes ; i++) {
            tmp[i - 1] = deleteMin();
        }
        System.out.println(Arrays.toString(tmp));
    }
}
