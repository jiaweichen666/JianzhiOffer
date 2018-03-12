package p21ReorderArray;

public class Solution {
    public void Reorder(int[] nums){
        int i = 0;
        int j = nums.length - 1;
        while (i < j){
            while(i < j && isOdd(nums[i]))
                i++;
            while(i < j && !isOdd(nums[j]))
                j--;
            if (i < j){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }

    }
    public boolean isOdd(int n){
        if ((n & 0x1)== 0)
            return true;
        return false;
    }
}
