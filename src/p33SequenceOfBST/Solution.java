package p33SequenceOfBST;

public class Solution {
    public boolean isSequenceOfBST(int[] nums,int start,int end){
        if ( nums == null || start > end)
            return false;
        if (start == end)
            return true;
        int i;
        int root = nums[end];
        for (i = start; i < end ; i++) {
            if (nums[i] > root)
                break;
        }
        int j;
        for (j = i; j < end ; j++) {
            if (nums[j] < root)
                return false;
        }
        boolean left = true;
        //if (i >  start)
        left = isSequenceOfBST(nums,start,i - 1);
        boolean right = true;
        //if (i < end - 1)
        right = isSequenceOfBST(nums,i,end - 1);
        return (left && right);
    }
}
