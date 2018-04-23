package p53_01NumberOfK;

/**
 * Author:chen
 * Time:2018.4.23.11:48
 * Description:求一个数字在排序数组中出现的次数
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,3,3,4,5};
        System.out.println(lengthOfK(nums,3));

    }
    public static int getFirstOfK(int[] nums,int start,int end ,int k){
        if (start > end)
            return -1;
        int mid = start + (end - start)/2;
        int middleData = nums[mid];
        if (k == middleData){
            //若mid是第一个或者mid不是第一个且mid前面一个数字不等于k则返回
            if (mid == 0 || (mid > 0 && nums[mid - 1] != k))
                return mid;
            else
                end = mid - 1;
        }
        else if (k > middleData)
            start = start + 1;
        else
            end = mid - 1;
        return getFirstOfK(nums,start,end,k);
    }
    public static  int getLastOfK(int[] nums,int start,int end ,int k){
        if (start > end)
            return -1;
        int mid = start + (end - start)/2;
        int middleData = nums[mid];
        if (k == middleData){
            //若mid是最后一个或者不是最后一个但是mid后面一个不等于k则返回
            if (mid == nums.length - 1 || (mid < nums.length - 1 && nums[mid + 1] != k)){
                return mid;
            }else
                start = mid + 1;
        }else if (k > middleData)
            start = mid + 1;
        else
            end = mid - 1;
        return getLastOfK(nums,start,end,k);
    }
    public static int lengthOfK(int[] nums,int k){
        int number = 0;
        int start = getFirstOfK(nums,0,nums.length - 1,k);
        int end = getLastOfK(nums,0,nums.length - 1,k);
        if (start > -1 && end > -1){
            number = end - start +1;
        }
        return number;
    }
}
