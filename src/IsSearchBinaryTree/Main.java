package IsSearchBinaryTree;

import java.util.Stack;

/**
 * Description:判断一棵树是否是二叉搜索树
 * Tips：若一棵树是二叉搜索树则这棵树的中序遍历的结果是一个从小到大的数串，
 *       因此在中序遍历的过程中记录前一个访问的节点值，将当前访问的节点值和其比较，若大于pre则继续遍历
 *       若小于则返回false
 */
public class Main {
    public static void main(String[] args) {
      TreeNode[] treeNodes = new TreeNode[7];
        for (int i = 0; i < treeNodes.length; i++) {
            treeNodes[i] = new TreeNode(i+1);
        }
        treeNodes[3].left = treeNodes[1];
        treeNodes[3].right = treeNodes[5];
        treeNodes[1].left = treeNodes[0];
        treeNodes[1].right = treeNodes[2];
        treeNodes[5].left = treeNodes[4];
        treeNodes[5].right = treeNodes[6];
        System.out.println(isSearchBinaryTree(treeNodes[3]));
    }
    public static boolean isSearchBinaryTree(TreeNode root){
        boolean isSBT = true;
        if (root == null)
            return  isSBT;
        TreeNode p = root;
        Stack<TreeNode> stack = new Stack<>();
        long lastVisitedVal = Long.MIN_VALUE;
        while (!stack.isEmpty() || p != null){
            while (p != null){
                stack.push(p);
                p = p.left;
            }
            if (!stack.isEmpty()){
                p = stack.pop();
                System.out.println(p.val);
                if (p.val < lastVisitedVal){
                    isSBT = false;
                    break;
                }else {
                    lastVisitedVal = p.val;
                }
                p = p.right;
            }
        }
        return isSBT;
    }
}
