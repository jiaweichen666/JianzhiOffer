package p56_02NumberAppearingOnce;

/**
 * Author:chen
 * time:2018/4/27/10:41
 * Description:找出数组中出现一次的数字，其他数字都是出现三次
 * tips：出现三次的数字对应的二进制位肯定能被三整除，加上出现一次的数字的相应的二进制位就不能被3整除了
 * 循环相加并且向左移位，最后得到的就是出现了一次的数字。·
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,2,3,3,3,4,4,4,10,5,5,5,6,6,6};
        System.out.println(FindNumAppearingOnce(nums));
    }
    public static int FindNumAppearingOnce(int [] nums){
        int[] bitSum = new int[32];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = 31; j >= 0 ; j--) {
                if ((num & 1) == 1)
                    bitSum[j]++;
                num = num >> 1;
            }
        }
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = result << 1;
            result += bitSum[i] % 3;
        }
        return result;
    }
}
