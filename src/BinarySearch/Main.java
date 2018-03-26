package BinarySearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] nums = {4,6,2,3,7,9,1,10,8};
        Arrays.sort(nums);
        Solution solution = new Solution();
        System.out.println(solution.BinnarySearchRecursively(nums,0,nums.length - 1,4));
        System.out.println(solution.BinarySearch1(nums,0,nums.length - 1,4));
    }
}
