package p32_03PrintTreeInZigzag;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode[] treeNodes = new TreeNode[7];
        for (int i = 0; i < 7; i++) {
            treeNodes[i] = new TreeNode(i + 1);
        }
        treeNodes[0].left = treeNodes[1];
        treeNodes[0].right = treeNodes[2];
        treeNodes[1].left = treeNodes[3];
        treeNodes[1].right = treeNodes[4];
        treeNodes[2].left = treeNodes[5];
        treeNodes[2].right = treeNodes[6];
        solution.printTreeInZigzag(treeNodes[0]);
    }
}
