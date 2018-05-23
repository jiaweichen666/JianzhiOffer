package p11MinNumInRotaryArray;

public class Solution {
    public int findMinInRotaryArray(int[] array) {
        if ( array.length == 0)
            return 0;
        int index1 = 0;
        int index2 = array.length - 1;
        int midIndex = index1;
        while (array[index1] >= array[index2]){
            if (index2 - index1 == 1){
                midIndex = index2;
                break;
            }
            midIndex = (index2 + index1) >> 1;
            if (array[index1] == array[index2] && array[index1] == array[midIndex]){
                return findMinOrderedly(array,index1,index2);
            }else if (array[midIndex] >= array[index1]){
                index1 = midIndex;
            }else if(array[midIndex] <= array[index2]){
                index2 = midIndex;
            }
        }
        return array[midIndex];

    }
    public int findMinOrderedly(int[] array,int index1,int index2){
        int min = Integer.MIN_VALUE;
        for (int i = index1; i <= index2 ; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }
}
