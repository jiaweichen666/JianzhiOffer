package QuickSort;

import java.util.Arrays;
import java.util.Stack;

public class QuickSortUnrecursively {
    public static int partiton(int[] nums ,int start,int end){
        int pivot = nums[start];
        while(start < end){
            while (start < end && nums[end] >= pivot)
                end--;
            nums[start] = nums[end];
            while (start < end && nums[start] <= pivot)
                start++;
            nums[end] = nums[start];
        }
        nums[start] = pivot;
        return start;
    }
    public static void quicksortUnrecursively(int[] nums,int start,int end){
        Stack<Integer> stack = new Stack<>();
        if (start < end){
            stack.push(end);
            stack.push(start);
            while (!stack.isEmpty()){
                int l = stack.pop();
                int r = stack.pop();
                int index = partiton(nums,l,r);
                if (l < index - 1){//若不满足说明左边有序，不需要登记再排
                    stack.push(index - 1);
                    stack.push(l);
                }
                if (r > index + 1){//若不满足则右边有序，不需要登记在排序。
                    stack.push(r);
                    stack.push(index + 1);
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {5,1,2,4,3,6,9,8,0,7};
        quicksortUnrecursively(nums,0,nums.length - 1);
    }
}
