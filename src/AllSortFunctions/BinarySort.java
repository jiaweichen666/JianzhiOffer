package AllSortFunctions;

import java.util.Arrays;

/**
 * Description：归并过程线排左半段，一直划分到两个单值比较，然后merge，然后排右边半段，最后merge
 */
public class BinarySort {
    public static void main(String[] args) {
        int[] nums = {7,6,5,4};
        BinarySort(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static void merge(int [] nums ,int start,int mid,int end){
        if (start >= end)
            return;
        int i = start;
        int j = mid + 1;
        int[] tmp = Arrays.copyOf(nums,nums.length);
        for (int k = start; k <= end ; k++) {
            if (i > mid)
                nums[k] = tmp[j++];
            else if (j > end)
                nums[k] = tmp[i++];
            else if (tmp[i] < tmp[j])
                nums[k] = tmp[i++];
            else
                nums[k] = tmp[j++];
        }
    }
    public static void BinarySortCore(int[] nums,int start,int end){
        if (end <= start)
            return;
        int mid = (end - start)/2 + start;
        BinarySortCore(nums,start,mid);
        BinarySortCore(nums,mid +1,end);
        merge(nums,start,mid,end);
    }
    public static void BinarySort(int[] nums){
        BinarySortCore(nums,0,nums.length - 1);
    }
}
