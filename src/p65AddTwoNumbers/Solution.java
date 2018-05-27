package p65AddTwoNumbers;

/**
 * Description:不用加减乘除做加法
 */
public class Solution {
    public int Add(int num1,int num2) {
        /*do {
            int sum = (num1 ^ num2);
            int carray = ((num1 & num2)<<1);
            num1 = sum;
            num2 = carray;
        }
        while (num2 != 0);
        return num1;*/
        while (num2 != 0){
            int tmp = (num1 ^ num2);
            num2 = (num1 & num2 )<<1;
            num1 = tmp;
        }
        return num1;
    }
}
