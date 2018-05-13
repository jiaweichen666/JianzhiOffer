package BinaryTreeTraversal;

public class Main {
    public static void main(String[] args) {
        TreeNode [] treeNodes = new TreeNode[7];
        for (int i = 0; i < treeNodes.length; i++) {
            treeNodes[i] = new TreeNode(i+1);
        }
        treeNodes[0].left = treeNodes[1];
        treeNodes[0].right = treeNodes[2];
        treeNodes[1].left = treeNodes[3];
        treeNodes[1].right = treeNodes[4];
        treeNodes[2].left = treeNodes[5];
        treeNodes[2].right = treeNodes[6];
        Solution solution = new Solution();
        System.out.println("IN");
        solution.InorderWithoutRecursion(treeNodes[0]);
        System.out.println();
        System.out.println("Pre");
        solution.PreorderWithoutRecursion(treeNodes[0]);
        System.out.println();
        System.out.println("Post");
        solution.PostOrderWithoutRecursion(treeNodes[0]);
        System.out.println();
        System.out.println("PostNewCoderWay");
        solution.PostOrderBinaryTreeTraversalUnrecursivelyByNewCoder(treeNodes[0]);
    }
}
