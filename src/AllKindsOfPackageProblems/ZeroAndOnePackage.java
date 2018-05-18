package AllKindsOfPackageProblems;

/**
 * Description:0-1背包问题。
 */
public class ZeroAndOnePackage {
    public static void main(String[] args) {
        int[] w = {1,3,2,6,2};
        int[] v = {2,5,3,10,4};
        int totalW = 12;
        System.out.println(getMaxValue(w,v,totalW));
    }
    public static int getMaxValue(int[] w,int[] v,int totalW){
        if (w.length != v.length || totalW < 0){
            return -1;
        }
        if (totalW == 0)
            return 0;
        int[][] maxValues = new int[w.length + 1][totalW + 1];
        for (int i = 0; i < totalW + 1; i++) {//第一行没有物品，maxValue都设为0
            maxValues[0][i] = 0;
        }
        for (int i = 0; i < w.length + 1; i++) {//第一列，背包容量为0，maxValue都设为0
            maxValues[i][0] = 0;
        }
        for (int i = 1; i < w.length + 1; i++) {
            for (int j = 1; j < totalW + 1; j++) {
                if (j < w[i - 1])//如果背包体积j小于物品i的体积
                    maxValues[i][j] = maxValues[i - 1][j];//背包装不下物品i，只能装下前 i-1个物品
                else {
                    int goodsNotInValue = maxValues[i - 1][j];//不将物品i放入背包
                    int goodsInValue = maxValues[i - 1][j - w[i - 1]] +  v[i - 1];//将物品i放入背包
                    maxValues[i][j] = Math.max(goodsInValue,goodsNotInValue);
                }
            }

        }
        return maxValues[w.length][totalW];
    }

}
