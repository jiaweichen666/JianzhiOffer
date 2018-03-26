package p36ConvertBinarySearchTree;

public class Main {
    public static void main(String[] args) {
        TreeNode[] treeNodes = new TreeNode[7];
        treeNodes[0] = new TreeNode(10);
        treeNodes[1] = new TreeNode(6);
        treeNodes[2] = new TreeNode(14);
        treeNodes[3] = new TreeNode(4);
        treeNodes[4] = new TreeNode(8);
        treeNodes[5] = new TreeNode(12);
        treeNodes[6] = new TreeNode(16);
        treeNodes[0].left = treeNodes[1];
        treeNodes[0].right = treeNodes[2];
        treeNodes[1].left = treeNodes[3];
        treeNodes[1].right = treeNodes[4];
        treeNodes[2].left = treeNodes[5];
        treeNodes[2].right = treeNodes[6];
        TreeNode head = new Solution().convertTree(treeNodes[0]);
        TreeNode node = head;
        while (node.right != null) {
            System.out.println(node.val);
            node = node.right;
        }

    }
}
