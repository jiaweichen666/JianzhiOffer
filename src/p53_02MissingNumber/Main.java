package p53_02MissingNumber;

/**
 * Author:chen
 * Time:2018/4/23/14:02
 * Description:找出数组中第一个确实的数字
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5,6,7,8,10,11,12};
        System.out.println(firstMissingNum(nums));
    }
    public  static int firstMissingNum(int[] nums){
        if (nums.length == 0)
            return -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid  = (start + end)>>1;
            if (nums[mid] == mid)
                start  = mid + 1;
            else{
                if ((mid > 0 && nums[mid -1] == mid - 1) || mid == 0)
                    return mid;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }
}
