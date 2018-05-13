package ShortestSubArrayNeedToSort;

import java.util.LinkedList;
import java.util.List;

/**
 * Description:找出数组中最短需要排序的子数组
 * Tips：先从左向右遍历，遍历时记录最大值，若最大值比当前值大，则更新rightIndex，否则更新最大值
 *       再从右往左遍历，遍历时记录最小值，若最小值比当前值小，则更新leftIndex，否则更新最小值
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1,5,4,3,2,6,7};
        System.out.println(startAndEndPointOfSubArray(nums));
    }
    public static List<Integer> startAndEndPointOfSubArray(int[] nums){
        int Max = nums[0];
        int rightIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (Max > nums[i])
                rightIndex = i;
            else
                Max = nums[i];
        }
        int Min = nums[nums.length - 1];
        int leftIndex = nums.length - 1;
        for (int i = nums.length - 2;i >= 0;i--) {
            if (Min < nums[i])
                leftIndex = i;
            else
                Min = nums[i];
        }
        List<Integer> list = new LinkedList<>();
        list.add(leftIndex);
        list.add(rightIndex);
        return list;
    }
}
