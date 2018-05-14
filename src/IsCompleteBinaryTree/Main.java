package IsCompleteBinaryTree;

import java.util.LinkedList;
import java.util.List;

/**
 * Author:chen
 * Time:2018/4/25/14:08
 * Description:判断一棵树是不是完全二叉树
 * Tips：1.完全二叉树的定义：完全二叉树是指除了最后一层之外，其他每一层的节点数都是满的。如果最后一层也满了，则是一颗满二叉树，
 *         也是一颗完全二叉树。如果最后一层的节点不满，缺少的节点也都集中在右边，那也是一颗完全二叉树
 *       2.判断过程：
 *         2.1 采用层序遍历的方式从左到右遍历二叉树
 *         2.2 如果当前节点只有右孩子没有左孩子，则直接返回false
 *         2.3 如果当前节点并不是左右两个孩子都有，则之后的节点必须全部都是叶子节点，否则返回false
 *         2.4 遍历过程中没有返回false，则最后返回true
 */
public class Main {
    public static void main(String[] args) {
        TreeNode[] treeNodes = new TreeNode[7];
        for (int i = 0; i < 7; i++) {
            treeNodes[i] = new TreeNode(i+1);
        }
        treeNodes[0].left = treeNodes[1];
        treeNodes[0].right = treeNodes[2];
        //treeNodes[1].left = treeNodes[3];
        treeNodes[1].right = treeNodes[4];
        //treeNodes[2].left = treeNodes[5];
        //treeNodes[2].right = treeNodes[6];
        System.out.println(IsCompleteTree(treeNodes[0]));

    }
    public static boolean IsCompleteTree(TreeNode root){
        if (root == null)
            return true;
        List<TreeNode> list = new LinkedList<>();
        list.add(root);
        boolean isComplete = true;
        boolean flag = false;
        while (!list.isEmpty() && flag == false){
            TreeNode p = list.remove(0);
            System.out.print(p.val + " ");
            if (p.left == null && p.right == null){//若左右子树都为空则此叶节点之后的所有节点都是叶节点（并不是左右孩子都有）
                flag = true;
            }else if (p.left == null && p.right != null){//若左子树空右子树不空则一定不是完全二叉树
                isComplete = false;
                break;
            }else if (p.left != null && p.right == null){//若左子树不空右子树空则此点之后的所有节点都是叶节点（并不是左右孩子都有）
                flag = true;
                list.add(p.left);
            }else{
                list.add(p.left);
                list.add(p.right);
            }
        }
        while (!list.isEmpty()){//判断之后的点是不是叶节点
            TreeNode p = list.remove(0);
            System.out.print(p.val + " ");
            if (p.left != null || p.right != null){
                isComplete = false;
                break;
            }
        }
        return isComplete;
    }
}
