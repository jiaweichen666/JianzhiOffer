package p13RobotMove;

public class Solution {
    public int getDigitSum(int num){
        int sum = 0;
        while(num > 0){
            sum = sum + num%10;
            num = num/10;
        }
        //System.out.println(sum);
        return sum;
    }
    public boolean check(int threshold,int row,int col,int rows,int cols,boolean[][] visited){
        if (getDigitSum(row) + getDigitSum(col) <= threshold && row >= 0 && row < rows && col >= 0 && col < cols&&!visited[row][col]){
            return true;
        }
        return false;
    }
    public int movingCount(int threshold,int rows,int cols){
        if (threshold < 0 || rows <0 || cols < 0){
            return -1;
        }
        boolean[][] visited = new boolean[rows][cols];
        int count = movingCountHelper(threshold,0,0,rows,cols,visited);
        return count;

    }
    public int movingCountHelper(int threshold,int row,int col,int rows,int cols,boolean[][] visited){
        int count = 0;
        if (check(threshold,row,col,rows,cols,visited)){
            visited[row][col] =true;
            count = 1 + movingCountHelper(threshold,row+1,col,rows,cols,visited)+
                    movingCountHelper(threshold,row-1,col,rows,cols,visited)+
                    movingCountHelper(threshold,row,col+1,rows,cols,visited)+
                    movingCountHelper(threshold,row,col-1,rows,cols,visited);
        }
        //System.out.println(count);
        return count;
    }
}
