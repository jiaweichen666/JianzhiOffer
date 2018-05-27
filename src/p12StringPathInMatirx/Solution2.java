package p12StringPathInMatirx;

public class Solution2 {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        if(matrix == null || rows < 1 || cols < 1 || str == null)
            return false;
        boolean[] isvisited = new boolean[rows * cols];
        for(int i = 0;i < rows;i++){
            for(int j = 0;j < cols;j++){
                boolean haspath = hasPathCore(matrix,str,isvisited,i,rows,j,cols,0);
                if(haspath)
                    return true;
            }
        }
        return false;
    }
    public boolean hasPathCore(char[] matrix,char[] str,boolean[] isvisited,int row ,int rows,int col,int cols,int index){
        if(index >= str.length)
            return true;
        boolean haspath = false;
        if(row < rows && row >= 0 && col < cols && col >= 0 && matrix[row * cols + col] == str[index] && !isvisited[row * cols + col]){
            isvisited[row * cols + col] = true;
            index++;
            haspath = hasPathCore(matrix,str,isvisited,row + 1,rows,col,cols,index)
                    || hasPathCore(matrix,str,isvisited,row - 1,rows,col,cols,index)
                    || hasPathCore(matrix,str,isvisited,row,rows,col + 1,cols,index)
                    || hasPathCore(matrix,str,isvisited,row,rows,col - 1,cols,index);
            if(!haspath){
                index--;
                isvisited[row * cols + col] = false;
            }
        }
        return haspath;
    }


}
