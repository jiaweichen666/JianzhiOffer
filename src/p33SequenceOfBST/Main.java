package p33SequenceOfBST;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4,6,7,5};
        System.out.println(solution.isSequenceOfBST(nums,0,nums.length - 1));
    }
}
