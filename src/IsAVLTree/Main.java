package IsAVLTree;

import p7ConstructBinaryTree.TreeNode;

/**
 * 判断一棵树是否是平衡二叉树，牛客网的做法，采用后序遍历二叉树的方法，先遍历左子树，获得两个值，左子树最多到哪一层lh
 * （最多到达的那一层是null结点所在的层）和左子树是否为AVL
 * 若左子树不为AVL则直接返回false
 * 再遍历右子树，获取两个信息，右子树最多到哪一层和右子树是否为AVL，若不为AVL则直接返回false
 * 若左右子树都为AVL，则判断lh - rh的绝对值是否小于等于1，若是则返回True，否则返回false。
 */
public class Main {
    public static void main(String[] args) {
        TreeNode treeNode1=  new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode4.left = treeNode5;
        System.out.println(isBalance(treeNode1));
        System.out.println("Get height " + getDepth(treeNode1));
    }
    public static int getHeight(TreeNode head,int level,boolean[] res){
        if (head == null)
            return level;
        int lh = getHeight(head.left,level + 1,res);
        if (!res[0])
            return level;
        int rh = getHeight(head.right,level + 1,res);
        if (!res[0])
            return level;
        if (Math.abs(lh - rh) > 1)
            res[0] = false;
        return Math.max(lh,rh);
    }
    public static boolean isBalance(TreeNode root){
        boolean[] res = new boolean[1];
        res[0] = true;
        getHeight(root,1,res);
        return res[0];
    }
    public static int getDepth(TreeNode root){
        if (root == null)
            return 0;
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        return left > right ? left + 1 : right + 1;
    }
}
