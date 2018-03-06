package p3FindInPartiallySortedMatix;

public class Solution {
    public boolean find(int[][] matirx,int target){
        int column = matirx[0].length - 1;
        int rows = matirx.length;
        int row = 0;
        boolean found = false;
        while (row < rows && column >= 0){
            if (matirx[row][column] == target){
                found = true;
                break;
            }
            else if (matirx[row][column] > target)
                column--;
            else
                row++;
        }
        return found;
    }
}
