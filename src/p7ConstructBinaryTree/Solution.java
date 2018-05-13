package p7ConstructBinaryTree;

public class Solution {//由先序遍历和中序遍历的结果重构二叉树
    public TreeNode reConstruct(int[] pre,int[] in){
        if (pre == null || in ==null )
            return null;
        return helper(pre,in,0,pre.length - 1,0,in.length - 1);
    }
    public TreeNode helper(int[] pre,int[] in ,int prestart,int preend,int instart,int inend){
        TreeNode root = new TreeNode(pre[prestart]);
        root.left = root.right = null;
        if (prestart == preend && instart == inend){
            return root;
        }
        int rootIndex  = 0;
        for (rootIndex = instart; rootIndex < inend; rootIndex++) {
            if (pre[prestart] == in[rootIndex])
                break;
        }
        int leftsize = rootIndex - instart;
        int rightsize = inend - rootIndex;
        if (leftsize > 0){
            root.left = helper(pre,in,prestart+1,prestart + leftsize,instart,rootIndex-1);
        }
        if (rightsize > 0){
            root.right = helper(pre,in,prestart + leftsize +1,preend,rootIndex +1,inend);
        }
        return root;
    }
    public void preOrderTravesal(TreeNode root){
        if (root == null){
            return;
        }
        System.out.print(root.val + " ");
        preOrderTravesal(root.left);
        preOrderTravesal(root.right);
    }
}
