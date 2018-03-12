package p21ReorderArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] nums = {1,2,3,4,5};
        solution.Reorder(nums);
        System.out.println(Arrays.toString(nums));
    }
}
