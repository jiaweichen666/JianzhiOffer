package p41StreamMedian;
public class Solution {
    private int[] maxHeap;
    private int[] minHeap;
    private  int maxheapnum  = 0;
    private  int minheapnum = 0;
    public  Solution(){
        maxHeap = new int[100];
        minHeap = new int[100];
    }
    public void swap(int[] heap,int i,int j){
        int tmp = heap[i];
        heap[i] = heap[j];
        heap[j] = tmp;
    }
    public int getMaxheapNum(){
        return maxheapnum; 
    }
    public int getMinheapnum(){
        return minheapnum;
    }
    public void minHeapSwim(int i){
        while (i > 1) {
            if(minHeap[i] < minHeap[i/2]) {
                swap(minHeap, i, i / 2);
                i = i /2;
            }
            else
                break;
        }
    }
    public void minHeapSink(int i){
        while(i * 2 <= minheapnum){
            int j = i * 2;
            if (j < minheapnum && minHeap[j + 1] < minHeap[j])
                j = j + 1;
            if (minHeap[i] < minHeap[j])
                break;
            swap(minHeap,i,j);
            i = j;
        }
    }
    public void minHeapInsert(Integer num) {
        minheapnum++;
        minHeap[minheapnum] = num;
        minHeapSwim(minheapnum);
    }
    public int minHeapDelete(){
        int min = minHeap[1];
        swap(minHeap,1,minheapnum);
        minHeap[minheapnum] = 0;
        minheapnum--;
        minHeapSink(1);
        return  min;
    }
    public void maxHeapSwim(int i){
        while (i > 1){
            if (maxHeap[i] > maxHeap[i / 2]){
                swap(maxHeap,i,i/2);
                i = i / 2;
            }else
                break;
        }
    }
    public void maxHeapSink(int i){
        while (i * 2 <= maxheapnum){
            int maxerIndex = i * 2;
            if ( maxerIndex < maxheapnum && maxHeap[maxerIndex] < maxHeap[maxerIndex + 1])
                maxerIndex = maxerIndex + 1;
            if (maxHeap[i] > maxHeap[maxerIndex]) {
                swap(maxHeap, i, maxerIndex);
                i = maxerIndex;
            }else
                break;
        }
    }
    public void insertIntomaxheap(int num){
        maxheapnum++;
        maxHeap[maxheapnum] = num;
        maxHeapSwim(maxheapnum);
    }
    public int deleteMaxHeap(){
        int max = maxHeap[1];
        swap(maxHeap,1,maxheapnum);
        maxHeap[maxheapnum] = 0;
        maxheapnum--;
        maxHeapSink(1);
        return max;
    }
    public int getMin(){
        return  minHeap[1];
    }
    public int getMax(){
        return maxHeap[1];
    }

    public Double GetMedian() {
        int size = getMinheapnum() + getMaxheapNum();
        if (size == 0)
            return null;
        double median;
        if ((size & 0x1) == 1)
            median = (double) getMin();
        else
            median = (double) (getMin() + getMax()) / 2;
        return median;

    }
    public void Insert(Integer num) {
        if(((getMaxheapNum() + getMinheapnum()) & 0x1) == 0 ){
            if (getMaxheapNum() > 0 && num < getMax()){
                insertIntomaxheap(num);
                num = deleteMaxHeap();
            }
            minHeapInsert(num);
        }else {
            if (getMinheapnum() > 0 && num > getMin()){
                minHeapInsert(num);
                num = minHeapDelete();
            }
            insertIntomaxheap(num);
        }

    }

}
