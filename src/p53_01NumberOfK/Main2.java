package p53_01NumberOfK;

public class Main2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2,2,2,2,4};
        System.out.println(solution.getFirstk(nums,2,0,nums.length - 1));
    }
}
