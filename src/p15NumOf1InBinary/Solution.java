package p15NumOf1InBinary;

public class Solution {
    public void test(){
        int flag = 1;
        int count = 0;
        while(flag!= 0){
           flag = flag << 1;
           count++;
        }
        System.out.println(count);
    }
    public int numOf1_Normal(int n){
        int flag = 1;
        int count = 0;
        while(flag != 0){
            if ((flag & n) != 0){
                count++;
            }
            flag = flag<<1;
        }
        return count;
    }
    public int numOf1_Better(int n){
        int count = 0;
        while(n != 0){
            count++;
            n = (n - 1 )& n;
        }
        return count;
    }
}
