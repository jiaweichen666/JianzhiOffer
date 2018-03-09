package p14CuttingRope;

public class Solution {
    public int maxProductAfterCutting_DynamicPlanning(int length){
        if (length < 2)
            return 0;
        if (length == 2)
            return 1;
        if (length == 3)
            return 2;
        int [] products = new int[length+1];
        //product1~3 do not store the real value correspond to the length;
        products[0] = 0;
        products[1] = 1;
        products[2] = 2;
        products[3] = 3;
        for (int i = 4; i <=length ; i++) {
            for (int j = 1; j <= i/2 ; j++) {
                int tmp = products[j]*products[i - j];
                if (tmp > products[i]){
                    products[i] = tmp;
                }
            }
        }
        return products[length];
    }
    public int maxProductAfterCutting_Greedy(int length){
        if (length < 2)
            return 0;
        if (length == 2)
            return 1;
        if (length == 3)
            return 2;
        int timeOf3 = length/3;
        if (length - timeOf3*3 == 1){
            timeOf3-- ;
        }
        int timeOf2 = (length - timeOf3*3)/2;
        int max = (int)Math.pow(3,timeOf3) * (int)Math.pow(2,timeOf2);
        return max;

    }
}
