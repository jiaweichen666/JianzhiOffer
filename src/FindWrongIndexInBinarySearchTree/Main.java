package FindWrongIndexInBinarySearchTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Description:一棵二叉搜索树，树种有两个节点被交换，导致这棵树变成了一棵非二叉搜索树，找出这两个被交换的节点
 * Tips：中序遍历一棵二叉树，若当前仅当出现了一个逆序对（即当前访问节点的值小于pre的值），则这一对数则是逆序的两个数
 *       若出现了两个逆序对，则第一个逆序对中较大的数和第二个逆序对中较小的数为两个需要查找的节点数。
 */
public class Main {
    public static void main(String[] args) {
        TreeNode[] treeNodes = new TreeNode[7];
        for (int i = 0; i < treeNodes.length; i++) {
            treeNodes[i] = new TreeNode(i + 1);
        }
        treeNodes[2].left = treeNodes[1];
        treeNodes[2].right = treeNodes[5];
        treeNodes[1].left = treeNodes[0];
        treeNodes[1].right = treeNodes[3];
        treeNodes[5].left = treeNodes[4];
        treeNodes[5].right = treeNodes[6];
        System.out.println(getWrongIndex(treeNodes[2]));
    }
    public static List<Integer> getWrongIndex(TreeNode root){
        if (root == null)
            return null;
        int preVisited = Integer.MIN_VALUE;
        List<Integer> wrongIndexList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        int wrongindexnum = 1;
        int index1 = -1;
        int index2 = -2;
        while (!stack.isEmpty() || p != null){
            while (p != null){
                stack.push(p);
                p = p.left;
            }
            if (!stack.isEmpty()){
                p = stack.pop();
                int val = p.val;
                if (val < preVisited){
                    if (wrongindexnum == 1) {
                        index1 = preVisited;
                        index2 = val;
                        preVisited = val;
                        wrongindexnum++;
                    }else {
                        index2 = val;
                        preVisited = val;
                    }
                }else {
                    preVisited = val;
                }
                System.out.print(val + " ");
                p = p.right;
            }
        }
        wrongIndexList.add(index1);
        wrongIndexList.add(index2);
        return wrongIndexList;
    }
}
