package p54KthNodeINBST;

import java.util.Stack;

/**
 * Author:chen
 * time:2018/4/13/14:47
 * Description:找出二叉搜索树中第k大的节点
 */
public class Main {
    public static void main(String[] args) {
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode8 = new TreeNode(8);
        treeNode5.setLeft(treeNode3);
        treeNode5.setRight(treeNode7);
        treeNode3.setLeft(treeNode2);
        treeNode3.setRight(treeNode4);
        treeNode7.setLeft(treeNode6);
        treeNode7.setRight(treeNode8);
        System.out.println(kthInBST(treeNode5,4));
    }
    public static int kthInBST(TreeNode root,int k){
        int kNode = -1;
        int count = 0;
        if (root == null)
            return -1;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (p != null || !stack.isEmpty()){
            while (p!= null) {
                stack.push(p);
                p = p.getLeft();
            }
            if (!stack.isEmpty()){
                p = stack.pop();
                if (++count == k){
                    kNode = p.getVal();
                    break;
                }
                p = p.getRight();
            }
        }
        return kNode;
    }
}
