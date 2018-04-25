package IsFullBinaryTree;

import java.util.LinkedList;
import java.util.List;

/**
 * Author:chen
 * Time:2017/4/25/14:30
 * Description:判断一棵树是不是满二叉树，找到第一个叶节点，其后的所有层次遍历的节点应该都是叶节点，若是，则是满二叉树
 */
public class IsFullBinaryTree {
    public static void main(String[] args) {
        TreeNode[] treeNodes = new TreeNode[7];
        for (int i = 0; i < 7; i++) {
            treeNodes[i] = new TreeNode(i+1);
        }
        treeNodes[0].left = treeNodes[1];
        treeNodes[0].right = treeNodes[2];
        treeNodes[1].left = treeNodes[3];
        treeNodes[1].right = treeNodes[4];
        treeNodes[2].left = treeNodes[5];
        //treeNodes[2].right = treeNodes[6];
        System.out.println(IsFullBinaryTree(treeNodes[0]));
    }
    public static boolean IsFullBinaryTree(TreeNode root){
        if (root == null)
            return  true;
        List<TreeNode> list = new LinkedList<>();
        list.add(root);
        boolean isFull = true;
        boolean flag = false;
        while (!list.isEmpty() && flag == false){
            TreeNode p = list.remove(0);
            System.out.print(p.val + " ");
            if ((p.left == null && p.right!= null) || (p.left != null && p.right == null)){
                isFull = false;
                break;
            }else if (p.left == null && p.right == null){
                flag = true;
            }else{
                list.add(p.left);
                list.add(p.right);
            }
        }
        while (!list.isEmpty()){
            TreeNode p = list.remove(0);
            System.out.print(p.val + " ");
            if (p.left != null || p.right != null) {
                isFull = false;
                break;
            }
        }
        return isFull;
    }
}
