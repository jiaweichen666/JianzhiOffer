package p47MaxValueOfGifts;
/**
 *Created By Intellij IDEA
 * Author:chen
 * Date:2018/4/17
 * Time:10:15
 * Description:找出从左上角到右下角礼物的最大值，采用缓冲数组实现
 **/
public class BetterSolution {
    public static void main(String[] args) {
        int[][] matrix = {{1,10,3,8},{12,2,9,6},{5,7,4,11},{3,7,16,5}};
        System.out.println(maxValue(matrix));
    }
    public static  int maxValue(int[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] cache = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int up = 0;
                int left = 0;
                if (i >= 1)
                    up = cache[i - 1][j];
                if (j  >= 1)
                    left = cache[i][j - 1];
                int maxway = up > left? up:left;
                cache[i][j] = maxway + matrix[i][j];
            }

        }
        return cache[rows - 1][columns - 1];
    }
}
