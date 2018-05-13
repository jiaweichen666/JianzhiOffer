package AllSortFunctions;

public class Solution {
    public void swap(int i,int j,int[] nums){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    public void bubbleSort(int[] nums){
        for (int i = 1; i <= nums.length - 1 ; i++) {
            for (int j = nums.length - 1 ; j >= i ; j--) {
                if (nums[j] < nums[j - 1]){
                    swap(j,j - 1, nums);
                }
            }
        }
    }
    public void betterBubbleSort(int[] nums){
        for (int i = 1; i <= nums.length - 1; i++) {
            boolean swaped = false;
            for (int j = nums.length - 1; j >= i ; j--) {
                if (nums[j] < nums[j - 1]){
                    swaped = true;
                    swap(j,j - 1,nums);
                }
            }
            if (!swaped)
                break;
        }
    }

    public void selectSort(int[] nums){
        int j;
        for (int i = 0; i < nums.length; i++) {
            int minvalue = Integer.MAX_VALUE;
            int minIndex = -1;
            for ( j = i; j < nums.length ; j++) {
                if (nums[j] < minvalue){
                    minvalue = nums[j];
                    minIndex = j;
                }
            }
            swap(i,minIndex,nums);
        }
    }
    public void insertSort(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0 && nums[j] < nums[j - 1] ; j--) {
                swap(j,j-1,nums);
            }

        }
    }
    public void shellSort(int[] nums){
        int N = nums.length;
        int h = 1;
        while(h < N/3){
            h = h * 3 + 1;
        }
        while(h >= 1){
            for (int i = h; i < N; i++) {
                for (int j = i; j >=h && nums[j] < nums[j - h]; j -= h) {
                    swap(j,j - h,nums);
                }
            }
            h /= 3;
        }
    }
    public void fastSort(int[] nums,int low ,int high){
        int start = low;
        int end = high;
        int pivot = nums[low];
        while(start < end){
            while(start < end && nums[end] >= pivot)
                end--;
            nums[start] = nums[end];
            while(start < end && nums[start] <= pivot)
                start++;
            nums[end] = nums[start];
        }
        nums[start] = pivot;
        if (end > low)
            fastSort(nums,low,end - 1);
        if (high > start)
            fastSort(nums,start + 1,high);
    }
    public void binarySort(int[] nums){
        binarySortHelper(nums,0,nums.length - 1);
    }
    public void merge(int[] nums,int low ,int mid ,int high){
        int i = low;
        int j = mid + 1;
        if (low >= high){
            return;
        }
        int[] tmp = new int[nums.length];
        for (int k = 0; k < nums.length; k++) {
            tmp[k] = nums[k];
        }
        for (int k = low; k <= high ; k++) {
            if (i > mid)
                nums[k] = tmp[j++];
            else if (j > high)
                nums[k] = tmp[i++];
            else if (tmp[i] < tmp[j])
                nums[k] = tmp[i++];
            else
                nums[k] = tmp[j++];

        }
      }
    public void binarySortHelper(int[] nums,int low,int high){
        if (high <= low)
            return;
        int mid = low + (high - low)/2;
        binarySortHelper(nums,low,mid);
        binarySortHelper(nums,mid + 1,high);
        merge(nums,low,mid,high);
    }
}
