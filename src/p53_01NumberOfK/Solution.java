package p53_01NumberOfK;

/**
 * Description：查找出排序数组中的k的个数
 * Tip：非递归形式的二分查找
 * 注意：>>的优先级很低需要加括号
 *
 */
public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        int num = 0;
        if(array == null || array.length == 0)
            return num;
        int start = getFirstk(array,k,0,array.length - 1);
        int end = getLastk(array,k,0,array.length - 1);
        if(start > -1 && end > -1)
            num = end - start + 1;
        return num;
    }
    public int getFirstk(int[] array,int k,int start,int end){
        if(array.length == 0 || start > end)
            return -1;
        while(start <= end){
            int mid = start + ((end - start) >> 1);
            if(array[mid] == k){
                if(mid == 0 || (mid > 0 && array[mid - 1] != k))
                    return mid;
                else
                    end = mid - 1;
            }else if(array[mid] > k)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
    public int getLastk(int[] array,int k,int start,int end){
        if(array.length == 0 || start > end)
            return -1;
        while(start <= end){
            int mid = start + ((end - start)>>1);
            if(array[mid] == k){
                if(mid == array.length - 1 ||(mid < array.length - 1 && array[mid + 1] != k))
                    return mid;
                else
                    start = mid + 1;
            }else if(array[mid] > k)
                end = mid - 1;
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}