package p55_01TreeDepth;

public class Main {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        treeNode1.setLeft(treeNode2);
        treeNode1.setRight(treeNode3);
        treeNode2.setLeft(treeNode4);
        System.out.println(getDepthOfTree(treeNode1));

    }
    public static int getDepthOfTree(TreeNode root){
        if (root == null)
            return 0;
        int left = getDepthOfTree(root.getLeft());
        int right = getDepthOfTree(root.getRight());
        return left >= right? left + 1 : right + 1;
    }
}
