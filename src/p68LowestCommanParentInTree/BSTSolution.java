package p68LowestCommanParentInTree;

/**
 * Description:寻找两个树节点的最低公共父节点（最靠近树根的节点），给定的树是一棵BST
 * Tips：从根节点开始和两个node 的值进行比较，若当前节点的值比两个节点的值都要大，则最低的公共父节点一定在当前节点的左子树中
 *       于是下一步遍历当前节点的左子节点。如果当前节点的值比两个节点的值都小，那么下一步遍历当前节点的右子树。
 *       这样，在树中从上到下找到的第一个在两个输入节点的值之间的节点就是最低的公共祖先。
 */
public class BSTSolution {
    public static void main(String[] args) {
        TreeNode node8 = new TreeNode(8);
        TreeNode node4 = new TreeNode(4);
        TreeNode node15 = new TreeNode(15);
        TreeNode node2 = new TreeNode(2);
        TreeNode node6 = new TreeNode(6);
        TreeNode node1 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        TreeNode node5  = new TreeNode(5);
        TreeNode node7 = new TreeNode(7);
        TreeNode node10 = new TreeNode(10);
        TreeNode node20 = new TreeNode(20);
        TreeNode node9 = new TreeNode(9);
        TreeNode node11 = new TreeNode(11);
        TreeNode node18 = new TreeNode(18);
        TreeNode node21 = new TreeNode(21);
        node8.left = node4;
        node8.right = node15;
        node4.left = node2;
        node4.right = node6;
        node2.left = node1;
        node2.right = node3;
        node6.left = node5;
        node6.right = node7;
        node15.left = node10;
        node15.right = node20;
        node10.left = node9;
        node10.right = node11;
        node20.left = node18;
        node20.right  = node21;
        System.out.println(getLowestCommonParent(node8,node18,node21));

    }
    public static int getLowestCommonParent(TreeNode root,TreeNode node1,TreeNode node2){
        if (root == null || node1 == null || node2 == null)
            return -1;
        if (node1.val < root.val && node2.val > root.val  )
            return root.val;
        else if (root.val > node1.val && root.val > node2.val){
            return getLowestCommonParent(root.left,node1,node2);
        }else {
            return getLowestCommonParent(root.right,node1,node2);
        }
    }
}
