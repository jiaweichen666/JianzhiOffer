package p63MaximalProfit;

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
                min = nums[i - 1];
            int currDiff  = nums[i] - min;
            if (currDiff > maxDiff)
                maxDiff = currDiff;
        }
        return maxDiff;
    }
}
