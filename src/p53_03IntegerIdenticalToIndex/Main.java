package p53_03IntegerIdenticalToIndex;

/**
 * Author:chen
 * Time:2018/4/23/14:14
 * Description:找出递增数组中任意一个和下标相等的数字
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {-3,-1,1,3,5};
        System.out.println(AnyNunEqualsIndex(nums));
    }
    public static int AnyNunEqualsIndex(int[] nums){
        if (nums.length == 0)
            return -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + ((end - start) >> 1);
            if (nums[mid] == mid)
                return mid;
            else if (nums[mid] > mid)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}
