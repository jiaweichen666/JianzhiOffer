package Huawei;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(minStep(nums,0,n-1));
    }
    public static int minStep(int[] nums,int start,int end){
        int minstp = Integer.MAX_VALUE;
        if (start == end)
            return 0;
        if (end - start == 1)
            return 1;
        else {
            if (nums[start] >= end - start){
                minstp = 1;
            }else{
                for (int i = 1; i <= nums[start]; i++) {
                  int  indirect = 1 + minStep(nums,start+i,end);
                  if (indirect < minstp){
                      minstp = indirect;
                  }
                }
            }
        }
        return minstp;
    }
}
