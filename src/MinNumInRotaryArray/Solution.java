package MinNumInRotaryArray;

public class Solution {
    public int findMinInRotaryArray(int []nums){
        int low = 0;
        int high = nums.length - 1;
        int mid;
        while(low < high){
            mid = (low + high)/2;
            if (nums[mid] > nums[high]){
                low = mid + 1 ;
            }else {
                high = mid;
            }
        }
        return low;
    }
}
