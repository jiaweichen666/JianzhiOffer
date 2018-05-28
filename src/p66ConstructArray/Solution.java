package p66ConstructArray;

/**
 * Description:构建乘积数组
 * Tip：每一步的求积都应用了上一步求得的结果，降低了时间复杂度。O（n）
 */
public class Solution {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        B[0] = 1;
        for (int i = 1; i < A.length; i++) {
            B[i] = B[i - 1] * A[i - 1];
        }
        int tmp = 1;
        for (int i = A.length - 2; i >= 0 ; i--) {
            tmp *= A[i + 1];
            B[i] *= tmp;
        }
        return B;
    }
}