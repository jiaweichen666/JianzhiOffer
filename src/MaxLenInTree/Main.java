package MaxLenInTree;

/**
 * Description：假设从二叉树中的任意一个节点出发，到达目标节点的路径上的节点数记为“路径长”
 *              现在有一颗二叉树，求这颗二叉树中最长的路径长度
 * Tips：以后续遍历的过程遍历二叉树，以record数组作为全局变量记录从root节点出发的左右子树中最远的点到root点的距离
 *       最远的路径长只可能来自于三种可能：1、左子树中的最大距离
 *                                     2、右子树中的最大距离
 *                                     3、左子树中最远节点到root节点到右子树中最远节点的距离
 */
public class Main {
    public static void main(String[] args) {
        TreeNode[] treeNodes = new TreeNode[5];
        for (int i = 0; i < treeNodes.length; i++) {
            treeNodes[i] = new TreeNode(i);
        }
        treeNodes[0].left = treeNodes[1];
        treeNodes[0].right = treeNodes[2];
        treeNodes[1].left = treeNodes[3];
        treeNodes[3].left = treeNodes[4];
        System.out.println(getLongestLenInTree(treeNodes[0]));
    }
    public static int getLongestLenInTree(TreeNode node){
        int[] record = new int[1];
        return search(node,record);
    }
    public static int search(TreeNode root,int[] record){//二叉树的后续遍历，返回整棵树中的最长路径
        if (root == null){
            record[0] = 0;
            return 0;
        }
        int leftMax = search(root.left,record);//左子树的最长路径
        int leftNodeMax = record[0];//左子树中离左子节点的最远距离
        int rightMax = search(root.right,record);//右子树的最长路径
        int rightNodeMax = record[0];//右子树中离右子节点的最远距离
        int MaxLenViaRoot = leftNodeMax + rightNodeMax + 1;//左子树中最远节点经过根节点到右子树中最远节点的距离
        record[0] = 1 + Math.max(leftNodeMax,rightNodeMax);//record记录左右子树中较大的最远节点到根节点的距离
        return Math.max(Math.max(leftMax,rightMax),MaxLenViaRoot);
    }
}
