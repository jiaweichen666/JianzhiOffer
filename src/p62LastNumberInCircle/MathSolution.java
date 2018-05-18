package p62LastNumberInCircle;

public class MathSolution {
    public static void main(String[] args) {
        System.out.println(getLastRemaining(1000,3));
    }
    public static int getLastRemaining(int n,int m){//n个数字每m个删除一个
        if (n < 1 || m < 1)
            return -1;
        int last = 0;
        for (int i = 2; i <= n ; i++) {
            last = (last + m) % i;
        }
        return last;
    }
}