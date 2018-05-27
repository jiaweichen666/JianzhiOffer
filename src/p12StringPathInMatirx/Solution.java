package p12StringPathInMatirx;

public class    Solution {
    public boolean havePath(char[][] matrix, String string) {
        if (matrix == null || string == null)
            return false;
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        char[] chars = string.toCharArray();
        boolean[][] visited = new boolean[rowLen][colLen];
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                if (helper(matrix,visited,i,j,rowLen,colLen,0,chars)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean helper(char[][] matrix, boolean[][] visited, int row, int col, int rows, int cols, int charindex, char[] chars) {
        if (charindex >= chars.length)
            return true;
        boolean hasPath = false;
        if (row >= 0 && row < rows && col >= 0 && col < cols && matrix[row][col] == chars[charindex] && !visited[row][col]) {
            charindex++;
            visited[row][col] = true;
            hasPath = helper(matrix, visited, row + 1, col, rows, cols, charindex, chars)
                    || helper(matrix, visited, row - 1, col, rows, cols, charindex, chars)
                    || helper(matrix, visited, row, col + 1, rows, cols, charindex, chars)
                    || helper(matrix, visited, row, col - 1, rows, cols, charindex, chars);
            if (!hasPath) {
                charindex--;
                visited[row][col] = false;
            }
        }
        return hasPath;
    }
}
