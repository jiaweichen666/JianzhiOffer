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
                    TreeNode tmp = stack.pop();
                    System.out.println(tmp.val);
                    p = tmp;
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
                    System.out.println(p.val);
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
                System.out.println(p.val);
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
}
