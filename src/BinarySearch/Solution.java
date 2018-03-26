package BinarySearch;

public class Solution {
    public int BinnarySearchRecursively(int[] nums,int start,int end,int target){
        int index = -1;
        if (start > end)
            return index;
        int mid = (start + end)/2;
        if (target == nums[mid]){
            return mid;
        }
        else if (target < nums[mid]){
            index = BinnarySearchRecursively(nums,start,mid - 1,target);
        }else {
            index = BinnarySearchRecursively(nums,mid + 1,end,target);
        }
        return index;
    }
    public int BinarySearch1(int[] nums,int start,int end ,int target){
        int index = -1;
        int mid = (start + end)/2;
        while(end >= start && nums[mid] != target){
            if (target > nums[mid]) {
                start = mid + 1;
                mid = (start + end) / 2;
            }
            else if (target < nums[mid]){
                end = mid - 1;
                mid = (start + end)/2;
            }
        }
        if (start > end){
            return index;
        }
        return mid;
    }
}
