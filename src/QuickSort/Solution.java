package QuickSort;

import java.util.Arrays;

public class Solution {
    public void quickSort(int [] nums ,int tbegin,int tend){
        int begin = tbegin;
        int end = tend;
        int pivot = nums[begin];
        while (tbegin < tend){
            while(tbegin < tend && nums[tend] >= pivot){
                tend--;
            }
            nums[tbegin] = nums[tend];
            while(tbegin < tend && nums[tbegin] <= pivot){
                tbegin++;
            }
            nums[tend] = nums[tbegin];
        }
        nums[tbegin] = pivot;
        System.out.println(Arrays.toString(nums));
        if (begin < tend){
            quickSort(nums,begin,tend-1);
        }
        if (tbegin < end){
            quickSort(nums,tbegin + 1,end);
        }
    }
}
