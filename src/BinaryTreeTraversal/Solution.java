package BinaryTreeTraversal;

import java.util.Stack;

public class Solution {
    public void InorderWithoutRecursion(TreeNode root){
        if (root == null){
            return;
        }else {
            TreeNode p = root;
            Stack<TreeNode> stack = new Stack<>();
            while(p != null || !stack.empty()) {
                while (p != null) {
                    stack.push(p);
                    p = p.left;
                }
                if (!stack.empty()) {
                    p = stack.pop();
                    System.out.print(p.val + " ");
                    p = p.right;
                }
            }
        }
    }
    public void PreorderWithoutRecursion(TreeNode root){
        if (root == null)
            return;
        else {
            TreeNode p = root;
            Stack<TreeNode> stack = new Stack<>();
            while (p!= null || !stack.empty()){
                while (p!= null){
                    System.out.print(p.val + " ");
                    stack.push(p);
                    p = p.left;
                }
                if (!stack.empty()){
                    TreeNode tmp = stack.pop();
                    p = tmp.right;
                }
            }
        }
    }
    public void PostOrderWithoutRecursion(TreeNode root){
        if (root == null)
            return;
        TreeNode p = root;
        TreeNode lastvisited = null;
        Stack<TreeNode> stack = new Stack<>();
        while (p != null){
            stack.push(p);
            p = p.left;
        }
        while(! stack.empty()){
            p = stack.pop();
            if (p.right == null || p.right == lastvisited){
                System.out.print(p.val + " ");
                lastvisited = p;
            }
            else {
                stack.push(p);
                p = p.right;
                while(p != null){
                    stack.push(p);
                    p = p.left;
                }
            }
        }
    }
    public void PostOrderBinaryTreeTraversalUnrecursivelyByNewCoder(TreeNode root){
        /**
         * 需要两个辅助栈，将根节点push入stack1，从stack1 pop出的值记成curNode，如果curNode有左右子树，依次push如stack1
         * 重复以上过程知道stack1 为空，pop stack2中所有的node值即为后序遍历的结果
         */
        if (root == null)
            return;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()){
            TreeNode curNode = stack1.pop();
            TreeNode leftNode = curNode.left;
            TreeNode rightNode = curNode.right;
            if (leftNode != null)
                stack1.push(leftNode);
            if (rightNode != null)
                stack1.push(rightNode);
            stack2.push(curNode);
        }
        while (!stack2.isEmpty()){
            System.out.print(stack2.pop().val + " ");
        }
    }
}
