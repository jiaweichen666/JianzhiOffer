package p56_01NumbersAppearOnce;

/**
 * Author:chen
 * Time:2018/4/27/10:09
 * Description:数组中只有两个数字是只出现一次的，其他数字都是成对出现的，找出这两个数字
 * Tips:成对出现的数字异或为0，0与任何数字异或为此数字，1和任何数字求与就是判断此数字最后一位是否为1。
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {2,4,3,6,3,2,5,5};
        FindNumsAppearOnce(nums);
    }
    public static void FindNumsAppearOnce(int[] nums){
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        int index = findFirstBitsOne(result);
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isBitOne(nums[i],index))
                num1 ^= nums[i];
            else
                num2 ^= nums[i];
        }
        System.out.println(num1 + " " + num2);
    }
    public static int findFirstBitsOne(int num){
        int index = 0;
        while ((num & 1) == 0){
            index ++ ;
            num = num >> 1;
        }
        return index;//返回移位的次数
    }
    public static boolean isBitOne(int num,int index){
        for (int i = 0; i < index; i++) {
            num = num >> 1;
        }
        return (num & 1) != 0;
    }
}
