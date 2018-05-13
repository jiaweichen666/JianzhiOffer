package p7ConstructBinaryTree;

import java.util.Stack;

/**
 * 根据后序遍历和中序遍历重构二叉树
 */
public class AfterAndInorderReconstruct {
    public static void main(String[] args) {
        int[] in = {4,2,5,1,6,3,7};
        int [] after = {4,5,2,6,7,3,1};
        TreeNode treeNode = reConstruct(after,in);
        PreOrderTraversal(treeNode);
        System.out.println();
        PreOrderTraversalInRecursively(treeNode);
        System.out.println();
        InOrderTraversalInRecursively(treeNode);
        System.out.println();
        InOrderTraversal(treeNode);
        System.out.println();
        AfterOrderTraversal(treeNode);
        System.out.println();
        AfterOrderTraversalInRecursively(treeNode);
    }
    public static TreeNode reConstruct(int[] after,int[] in){
        if (after == null || in == null)
            return null;
        return reconstructCore(after,0,after.length - 1,in,0,in.length - 1);
    }
    public static TreeNode reconstructCore(int[] after,int afterStart,int afterEnd,int[] in,int inStart,int inEnd){
        TreeNode root = new TreeNode(after[afterEnd]);
        if (afterStart == afterEnd && inStart == inEnd)
            return root;
        int index = 0;
        for (index = inStart; index < inEnd;index++){
            if (after[afterEnd] == in[index])
                break;
        }
        int leftsize = index - inStart;
        int rightsize = inEnd - index;
        if (leftsize > 0){
            root.left = reconstructCore(after,afterStart, afterStart + leftsize - 1,in,inStart,index - 1);
        }
        if (rightsize > 0){
            root.right = reconstructCore(after,afterStart + leftsize,afterEnd - 1,in,index + 1,inEnd);
        }
        return root;
    }
    public static void PreOrderTraversal(TreeNode root){
        if (root == null)
            return;
        System.out.print(root.val + " ");
        PreOrderTraversal(root.left);
        PreOrderTraversal(root.right);
    }
    public static void PreOrderTraversalInRecursively(TreeNode root){
        if (root == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (!stack.isEmpty() || p != null){
            while (p != null){
                System.out.print(p.val + " ");
                stack.push(p);
                p = p.left;
            }
            if (!stack.isEmpty()){
                p = stack.pop();
                p = p.right;
            }
        }
    }
    public static void InOrderTraversal(TreeNode root){
        if (root == null)
            return;
        InOrderTraversal(root.left);
        System.out.print(root.val + " ");
        InOrderTraversal(root.right);

    }
    public static void InOrderTraversalInRecursively(TreeNode root){
        if (root == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (!stack.isEmpty() || p != null){
            while (p != null){
                stack.push(p);
                p = p.left;
            }
            if (!stack.isEmpty()){
                p = stack.pop();
                System.out.print(p.val + " ");
                p = p.right;
            }
        }
    }
    public static void AfterOrderTraversal(TreeNode root){
        if (root == null)
            return;
        AfterOrderTraversal(root.left);
        AfterOrderTraversal(root.right);
        System.out.print(root.val + " ");
    }
    public static void AfterOrderTraversalInRecursively(TreeNode root){
        if (root == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        TreeNode lastVisited = null;
        while (p != null){
            stack.push(p);
            p = p.left;
        }
        while (!stack.isEmpty()){
            p = stack.pop();
            if (p.right == null || p.right == lastVisited){
                System.out.print(p.val + " ");
                lastVisited = p;
            }else {
                stack.push(p);
                p = p.right;
                while (p != null){
                    stack.push(p);
                    p = p.left;
                }
            }
        }
    }
}
