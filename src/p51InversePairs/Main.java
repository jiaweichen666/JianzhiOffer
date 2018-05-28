package p51InversePairs;

import java.util.Arrays;

/**
 * Author:chen
 * Time:2018/4/23/10:12
 * Description:求数组中的逆序对，采用归并排序的思想。
 */
public class Main {
    public static int  merge(int[] nums,int start,int mid,int end){
        if (start >= end){
            return 0;
        }
        int i = mid;
        int j = end;
        int count = 0;
            int[] tmp = Arrays.copyOf(nums,nums.length);
        for (int k = end; k >= start ; k--) {
            if (i < start)
                nums[k] = tmp[j--];
            else if (j < mid + 1)
                nums[k] = tmp[i--];
            else if (tmp[i] > tmp[j]) {
                count = count + j - (mid + 1) + 1;
                nums[k] = tmp[i--];
            }
            else {
                nums[k] = tmp[j--];
            }
        }
        return count;

    }
    public static int BinarySortCoreCountReverseNum(int[] nums,int start,int end){
        if (start >= end)
            return 0;
        int mid = start + (end - start)/2;
        int left = BinarySortCoreCountReverseNum(nums,start,mid);
        int right = BinarySortCoreCountReverseNum(nums,mid + 1,end);
        int count = merge(nums,start,mid,end);
        return left + right + count;
    }
    public static void InverseCount(int[] nums){
        int count = BinarySortCoreCountReverseNum(nums,0,nums.length - 1);
        System.out.println(count);

    }

    public static void main(String[] args) {
        int[] nums = {7,5,6,4};
        InverseCount(nums);
        System.out.println(Arrays.toString(nums));
    }
}
