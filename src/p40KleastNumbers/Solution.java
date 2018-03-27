package p40KleastNumbers;

import java.util.Iterator;
import java.util.TreeSet;

public class Solution {
    public int partition(int start,int end,int[] nums){
        int pivot = nums[start];
        while(start < end){
            while(start < end && nums[end] >= pivot){
                end--;
            }
            nums[start] = nums[end];
            while(start < end && nums[start] <= pivot){
                start++;
            }
            nums[end] = nums[start];
        }
        nums[start] = pivot;
        return start;
    }
    public void leastK(int[] numbers,int k){
        int len = numbers.length;
        if (k < 0 || k > len ){
            return;
        }
        int start = 0;
        int end = len - 1;
        int index = partition(start,end,numbers);
        while(k - 1 != index){
            if (index > k - 1 ){
                end = index - 1;
                index = partition(start,end,numbers);
            }else if (index < k - 1){
                start = index + 1;
                index = partition(start,end,numbers);
            }
        }
        for (int i = 0; i <= k - 1; i++) {
            System.out.println(numbers[i]);
        }
    }
    public void leastKBaseOnRedBlackTree(int[] nums,int k){
        if (k < 0 || nums.length < k)
            return;
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.size() < k){
                set.add(nums[i]);
            }else {
                int maxInSet = set.last();
                if(maxInSet > nums[i]){
                    set.pollLast();
                    set.add(nums[i]);
                }
            }
        }
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
