package p43PathInTree;

import java.util.Stack;

public class Solution {
    public void findPath(int currentSum, int targetSum, Stack<Integer> path,TreeNode node){
        if (node == null)
            return;
        currentSum += node.val;
        path.add(node.val);
        if (isLeaf(node) && currentSum == targetSum){
            for (int a:path
                 ) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
        if (node.left != null)
            findPath(currentSum,targetSum,path,node.left);
        if (node.right != null)
            findPath(currentSum,targetSum,path,node.right);
        path.pop();
    }
    public boolean isLeaf(TreeNode node){
        return node.left == null && node.right == null;
    }
}
