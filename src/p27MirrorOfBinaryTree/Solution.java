package p27MirrorOfBinaryTree;

public class Solution {
    public void mirrorRecursively(TreeNode root){
        if (root == null)
            return;
        if (root.left == null && root.right == null)
            return;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        if (root.left != null)
            mirrorRecursively(root.left);
        if (root.right != null)
            mirrorRecursively(root.right);
    }
    public void printTree(TreeNode root){
        if (root == null)
            return;
        System.out.println(root.val);
        printTree(root.left);
        printTree(root.right);
    }
}
