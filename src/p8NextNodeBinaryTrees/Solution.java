package p8NextNodeBinaryTrees;

public class Solution {
    public TreeNode nextNode(TreeNode root){
        if (root == null)
            return null;
        TreeNode nextNode = null;
        if (root.rightChild != null){
            TreeNode p = root.rightChild;
            while(p.leftChild != null){
                p = p.leftChild;
            }
            nextNode = p;
        }
        else if (root.parent != null){
            TreeNode parent = root.parent;
            TreeNode current = root;
            while(parent != null && current != parent.leftChild){
                current = parent;
                parent = parent.parent;
            }
            nextNode = parent;
        }
        return nextNode;
    }
}
