package p41StreamMedian;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Descripton:求获取数据流中的中位数
 * Tips：PriorityQueue底层采用堆结构来实现，维护一个大根堆和一个小根堆结构
 *       如果插入的数字是奇数个，则插入到小根堆中（为了保持小根堆的所有元素大于大根堆中所有元素，在插入数字时可能遇到
 *       此数字小于大根堆中部分数字的情况，此时先应该插入大根堆中再取得大根堆中的最大值查如小根堆）
 *       如果插入的数字是偶数个，则插入到大根堆中（为了保持大根堆中的所有元素小于小根堆中的所有元素，在插入数字时可能遇到
 *       此数字大于小根堆中部分数字的情况，此时应先插入到小根堆中再取得小根堆中的最小值插入大根堆）
 *       因为0 & 1 == 0,所以小根堆的元素个数差值和大根堆始终不会超过1。
 */
public class PriorityQueueSolution {
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });
    public void Insert(int num){
        if (((maxHeap.size() + minHeap.size())& 0x1) == 0){
            if (maxHeap.size() > 0 && maxHeap.peek() > num){
                //偶数时插入小根堆，但小于大根堆中的部分值，则需要先插入大根堆再取大根堆中的最大值插入小根堆
                maxHeap.add(num);
                num = maxHeap.poll();
            }
            minHeap.add(num);
        }else {
            if (minHeap.size() > 0 && minHeap.peek() < num){
                //奇数时插入大根堆， 但num大于小根堆中的部分值，则需要先插入小根堆再去小根堆中的最小值插入大根堆
                minHeap.add(num);
                num = minHeap.poll();
            }
            maxHeap.add(num);
        }
    }
    public Double GetMedian(){
        int size = maxHeap.size() + minHeap.size();
        double median = 0.0;
        if (size == 0)
            return 0.0;
        if ((size & 0x1) == 1)
            median = (double)minHeap.peek();
        else if((size & 0x1) == 0)
            median = (double)(minHeap.peek() + maxHeap.peek())/2;
        return median;
    }
}
