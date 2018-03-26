package Jinritoutiao;

public class Solution {
    public void operation1(int lenm,int lens){
        lenm = lens;
        lens = lens * 2;
    }
    public void operation2(int lenm, int lens){
        lens = lens + lenm;
    }
    public void helper(int len,int sum,int ls,int lm,boolean flag){
        if (ls == len)
            System.out.println(sum);
        else if(ls > len){
            ls = ls/2;
            lm = lm/2;
            sum--;
            flag = true;
            helper(len,sum,ls,lm,flag);
        }
        else {
            if (flag) {
                ls = ls + lm;
                sum++;
                helper(len,sum,ls,lm,flag);
            }else {
                lm = ls;
                ls = ls * 2;
                sum++;
                helper(len, sum, ls, lm, flag);
            }
        }

    }
}
