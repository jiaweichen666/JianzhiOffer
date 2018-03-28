package p42GreatSumOfSubArrays;

public class Solution {
    public int greatSumOfSubArrays(int [] nums){
        if (nums.length == 0)
            return 0;
        int GreatSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum <= 0){
                sum = nums[i];
            }else{
                sum = sum + nums[i];
            }
            if (sum > GreatSum)
                GreatSum = sum;
        }
        return GreatSum;
    }
    public int greatSumOfSub(int [] nums){
        int[] greatSumOfIndexI = new int[nums.length];
        int greatSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0){
                greatSumOfIndexI[i] = nums[i];
            }else if (greatSumOfIndexI[i - 1] < 0){
                greatSumOfIndexI[i] = nums[i];
            }else if (greatSumOfIndexI[i - 1] > 0){
                greatSumOfIndexI[i] = greatSumOfIndexI[i - 1] + nums[i];
            }
            if (greatSumOfIndexI[i] > greatSum)
                greatSum = greatSumOfIndexI[i];
        }
        return greatSum;
    }
}
