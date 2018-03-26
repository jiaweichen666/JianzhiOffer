package p39MoreThanHalfNumber;

import java.util.Arrays;

public class Solution {
    public boolean isValidNum(int[] num){
        if (num == null || num.length == 0)
            return false;
        return  true;
    }
    public boolean isHalfNumber(int[] num,int result){
        boolean halfNum = false;
        int times = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == result)
                times++;
        }
        if (times * 2 > num.length)
            halfNum = true;
        return halfNum;
    }
    public int partition(int[] nums,int start,int end){
        int poviot = nums[start];
        while(start < end){
            while (start < end && nums[end] >= poviot){
                end--;
            }
            nums[start] = nums[end];
            while (start < end && nums[start] <= poviot){
                start++;
            }
            nums[end] = nums[start];
        }
        nums[start] = poviot;
        return start;
    }
    public void moreThanHalfNumber(int[] nums){
        if (!isValidNum(nums)){
            return;
        }
        int mid = (nums.length - 1)/2;
        int start = 0;
        int end = nums.length - 1;
        int index = partition(nums,start,end);
        while (index != mid){
            if (index > mid){
                end = index - 1;
                index = partition(nums,start,end);
                System.out.println(Arrays.toString(nums));
            }else if (index < mid){
                start = index + 1;
                index = partition(nums,start,end);
                System.out.println(Arrays.toString(nums));
            }
        }
        if (isHalfNumber(nums,nums[index])){
            System.out.println(nums[index]);
        }else {
            System.out.println("Not exist.");
        }
    }
}
