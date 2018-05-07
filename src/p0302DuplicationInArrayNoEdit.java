public class p0302DuplicationInArrayNoEdit {
    public static void main(String[] args) {
        int[] nums = {2,3,5,4,3,2,6,7};
        System.out.println(getDuplication(nums));

    }
    public static int getDuplication(int[] nums){
        if (nums.length <= 1)
            return -1;
        int start = 1;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + ((end - start) >> 1);
            int count = getCount(nums,start,mid);
            if (end == start){
                if (count > 1)
                    return start;
                else
                    break;
            }
            if (count > (mid - start + 1))
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
    public static int getCount(int nums[],int start,int end){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= start && nums[i] <= end)
                count++;
        }
        return count;
    }
}
