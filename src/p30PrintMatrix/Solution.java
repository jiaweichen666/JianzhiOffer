package p30PrintMatrix;

public class Solution {
    public void printMatrixRataryly(int[][] matirx,int colums,int rows){
        if (matirx == null || colums < 0 || rows < 0)
            return;
        int start = 0;
        while(colums > start * 2 && rows > start * 2){
            printOneCircle(matirx,colums,rows,start);
            start++;
        }
    }
    public void printOneCircle(int[][] matrix,int colums,int rows,int start){
        int endX = colums - 1 - start;
        int endY = rows - 1 - start;
        for (int i = start; i <= endX ; i++) {
            System.out.print(" " + matrix[start][i]);
        }
        if (endY > start){
            for (int i = start + 1; i <= endY; i++) {
                System.out.print(" " + matrix[i][endX]);
            }
        }
        if (endY > start && endX > start){
            for (int i = endY - 1; i >= start ; i--) {
                System.out.print(" " + matrix[endY][i]);
            }
        }
        if (endY > start && endX - 1 > start ){
            for (int i = endY - 1; i > start; i--) {
                System.out.print(" " + matrix[i][start]);
            }
        }
    }
}
