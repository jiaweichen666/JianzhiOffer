package p3duplicateNumInArray;


public class Solution {
    public boolean duplicate(int [] nums){
        Boolean d = false;
        if (nums.length <= 0)
            return false;
        for (int i = 0; i < nums.length ; i++) {
            while(nums[i] != i){
                if (nums[i] == nums[nums[i]]){
                    d = true;
                    System.out.println("Duplicated num: "+nums[i]);
                    break;
                }
                swap(i,nums[i],nums);
            }
        }
        return d;
    }
    public void swap(int i,int j,int [] num){
        int tmp = num[i];
        num[i] = num[j];
        num[j] = tmp;
    }
}
