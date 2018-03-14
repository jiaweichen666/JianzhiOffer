package p32_03PrintTreeInZigzag;

import java.util.Stack;

public class Solution {
    public void printTreeInZigzag(TreeNode root){
        if (root == null)
            return;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        int level = 1;
        stack1.push(root);
        while(!stack1.empty() || !stack2.empty()){
            if ((level % 2) != 0){//若为奇数行
                while(!stack1.empty()) {
                    TreeNode node = stack1.pop();
                    System.out.print(node.val);
                    if (node.left != null)
                        stack2.push(node.left);
                    if (node.right != null)
                        stack2.push(node.right);
                }
                System.out.println();
                level++;
            }
            else {
                while (!stack2.empty()){
                    TreeNode node = stack2.pop();
                    System.out.print(node.val);
                    if (node.right != null)
                        stack1.push(node.right);
                    if (node.left != null)
                        stack1.push(node.left);
                }
                System.out.println();
                level++;
            }
        }
    }
}
