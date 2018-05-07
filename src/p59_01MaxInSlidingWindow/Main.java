package p59_01MaxInSlidingWindow;
/**
 * Author:chen
 * Time:2018/5/7/9:59
 * Description:找出滑动窗口中的最大值，使用双端队列
 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] nums = {2,3,4,2,6,2,5,1};
        System.out.println(maxInWindows(nums,3));
    }
    public static List<Integer> maxInWindows(int[] nums,int k){
        List<Integer> linkedList = new LinkedList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        if (nums.length >= k && k >= 1){
            for (int i = 0; i < k; i++) {
                while (!deque.isEmpty() && nums[i] > nums[deque.getLast()]){
                    deque.removeLast();
                }
                deque.addLast(i);
            }
            for (int i = k; i < nums.length; i++) {
                linkedList.add(nums[deque.getFirst()]);
                while (!deque.isEmpty() && nums[i] > nums[deque.getLast()]){
                    deque.removeLast();
                }
                if (!deque.isEmpty() && (i - deque.getFirst()) >= k){
                    deque.removeFirst();
                }
                deque.addLast(i);
            }
            linkedList.add(nums[deque.getFirst()]);
        }
        return linkedList;
    }
}
