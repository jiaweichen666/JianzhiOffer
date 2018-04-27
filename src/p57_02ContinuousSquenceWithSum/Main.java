package p57_02ContinuousSquenceWithSum;

/**
 * Author:chen
 * Time:2018/4/27/11:32
 * Description:找出正数s的所有连续正数序列（至少含有两个数）
 */
public class Main {
    public static void main(String[] args) {
        findAllContinuousString(15);
    }
    public static void findAllContinuousString(int sum){
        int start = 1;
        int end = 2;
        int nowSum = start + end;
        int mid = (1 + sum) / 2;//small最大就是mid - 1，若为偶数8则最大为3，若为奇数9则最大为4，若为偶数10则最大为4
        while (start < mid){
            if (nowSum == sum) {
                printSequence(start, end);
                end++;//打印出一对后继续向后搜索
                nowSum = nowSum + end;
            }
            else if (nowSum > sum){
                nowSum = nowSum - start;
                start++;
            }else {
                end++;
                nowSum = nowSum + end;
            }
        }
    }
    public static void printSequence(int start,int end ){
        for (int i = start; i <= end ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
