package p42GreatSumOfSubArrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,-2,3,10,-4,7,2,-5};
        Solution solution = new Solution();
        int greatSum = solution.greatSumOfSubArrays(nums);
        System.out.println(greatSum);
        System.out.println(solution.greatSumOfSub(nums));
    }
}
