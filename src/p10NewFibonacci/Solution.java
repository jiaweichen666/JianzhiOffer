package p10NewFibonacci;

public class Solution {
    public long Fibonacci(int n){
        long a  = 0;
        long b = 1;
        long c = 0;
        if (n == 0) return  a;
        if (n == 1) return b;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
