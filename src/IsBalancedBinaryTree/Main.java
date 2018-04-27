package IsBalancedBinaryTree;

/**
 * Author:chen
 * Time:2-18/4/27/9:36
 * Description:判断一棵树是否是平衡二叉树，在后续遍历树的过程中，设置一个Boolean变量，若某子树不平衡，则设为false
 */
public class Main {
    private static boolean isBalanced = true;
    public static void main(String[] args) {
        TreeNode[] treeNodes = new TreeNode[7];
        for (int i = 0; i < 7; i++) {
            treeNodes[i] = new TreeNode(i+1);
        }
        treeNodes[0].left = treeNodes[1];
        //treeNodes[0].right = treeNodes[2];
        treeNodes[1].left = treeNodes[3];
        treeNodes[1].right = treeNodes[4];
        //treeNodes[2].left = treeNodes[5];
        //treeNodes[2].right = treeNodes[6];
        int depth = getDepth(treeNodes[0]);
        System.out.println("TreeDepth: "+ depth + " IsBalancedTree? " + isBalanced);
    }
    public static int getDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        if (Math.abs(left - right) > 1)
            isBalanced = false;
        return left > right ? left + 1 : right + 1;
    }
}
