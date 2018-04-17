package MaxValueOfGifts;
/**
 *Created By Intellij IDEA
 * Author:chen
 * Date:2018/4/17
 * Time:11:11
 * Description:找到礼物最大值的路径，递归方法
 * Out：Stack Overflow
 **/
public class SolutionRecursively {
    public static void main(String[] args) {
        int[][] matrix = {{1,10,3,8},{12,2,9,6},{5,7,4,11},{3,7,16,5}};
        System.out.println(maxValueOfIJ(matrix,matrix.length,matrix[0].length,0));

    }
    public static int maxValueOfIJ(int [][] matrix,int i,int j,int max){
        if (i==j && i==0)
            return matrix[i][j] + max;
        else {
            int maxleft = maxValueOfIJ(matrix,i,j - 1,0);
            int maxright  = maxValueOfIJ(matrix,i - 1,j,0);
            int maxWay = maxleft > maxright ? maxleft:maxright;
            return maxWay + matrix[i][j];
        }
    }
}
