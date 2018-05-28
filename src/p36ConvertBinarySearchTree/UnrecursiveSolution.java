package p36ConvertBinarySearchTree;

import java.util.Stack;
/*
Description:将二叉搜索树转换为双向链表
Tips：使用二叉树的中序遍历，在中序遍历的过程中，标记中序遍历的第一个节点为表头
设定pre指针，pre为中序遍历的上一个节点，改变指针的指向
 */
public class UnrecursiveSolution {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null)
            return null;
        boolean isfirst = true;
        TreeNode first = null;
        TreeNode p = pRootOfTree;
        TreeNode pre = null;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || p != null){
            while ( p!= null){
                stack.push(p);
                p = p.left;
            }
            if (!stack.isEmpty()){
                p = stack.pop();
                if (isfirst){
                    first = p;
                    pre = first;
                    isfirst = false;
                }else {
                    p.left = pre;
                    pre.right = p;
                    pre = p;
                }
                p = p.right;
            }
        }
        return first;
    }
}
