package p57_01TwoNumbersWithSum;

/**
 * Author:chen
 * Time:2018/4/27/10:57
 * Description:找出递增数组中的任意一对和为指定sum的数字
 * Tips：从数组两端开始搜索，若>sum,i++;若<sum,j--;若==sums,输出break
 */
public class Main{
    public static void main(String[] args) {
        int[] nums = {1,2,4,7,11,15};
        findTwoNumberWithSum(nums,15);
    }
    public static void findTwoNumberWithSum(int[] nums,int sum){
        int i = 0;
        int j = nums.length - 1;
        while (i < j){
            int numSum = nums[i] + nums[j];
            if (numSum == sum) {
                System.out.println(nums[i] + " + " + nums[j] + " = " + sum );
                break;
            }else if (numSum < sum){
                i++;
            }else{
                j--;
            }
        }
        if (i >= j){
            System.out.println("Not found!");
        }
    }
}
