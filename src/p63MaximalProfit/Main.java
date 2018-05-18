package p63MaximalProfit;

/**
 * Description：给出按时间排序的一组股票的价格，计算在什么时候买入和卖出时的利润最大
 * Tips：设置初始最小值为value[0],初始最大差值为value[1] - value[0]
 * 在从value[2]开始遍历的过程中，记录前面数字的最小值，并且更新maxDIff
 * 时间复杂度为O[n]
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {9,11,8,5,7,12,16,14};
        System.out.println(maxDiff(nums));

    }
    public static int maxDiff(int[] nums){
        if (nums.length < 2)
            return 0;
        int min = nums[0];
        int maxDiff = nums[1] - nums[0];
        for (int i = 2; i < nums.length; i++) {
            if (nums[i - 1] < min)
                min = nums[i - 1];//更新前i-1个数字中的最小值
            int currDiff  = nums[i] - min;
            if (currDiff > maxDiff)//比较当前差值和历史最大差值
                maxDiff = currDiff;
        }
        return maxDiff;
    }
}
