package p32_1PrintTreeFromTopToBottom;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public void levelPrintTree(TreeNode root){
        if (root == null)
            return;
        Queue<TreeNode> list = new LinkedList<>();
        TreeNode flag = root;
        list.add(root);
        while(!list.isEmpty()){
            TreeNode node = list.poll();
            System.out.print(" " + node.val);
            if (node == flag)
                System.out.println();
            if (node.left != null)
                list.add(node.left);
            if (node.right != null) {
                list.add(node.right);
                if (node.right == flag.right)
                    flag = flag.right;
            }
        }
    }
}
