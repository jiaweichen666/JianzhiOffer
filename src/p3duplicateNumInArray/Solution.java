package p3duplicateNumInArray;

/**
 * Description:给出范围在0~n-1范围的一组数组，找出其中重复的任一数字
 * Tips：若当前下标i上的数字不是i，而是j，则将j放回属于它的位置j，将位置上的值和num【i】上的值进行交换
 *       在遍历每一个下标的时候，若当前位置上的i与下标不符，则看它本属于它的位置上的元素和这个值是否相等
 *       如果相等则找到了重复数字。遍历到最后还没有找到重复数字，则返回false
 */

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
