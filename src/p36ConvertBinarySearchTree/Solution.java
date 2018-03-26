package p36ConvertBinarySearchTree;

public class Solution {
    public TreeNode convertTree(TreeNode root){
        TreeNode lastNodeInList = null;
        converthelper(root,lastNodeInList);
        TreeNode head = lastNodeInList;
        while (head != null && head.left!= null){
            head = head.left;
        }
        return head;
    }
    public void converthelper(TreeNode node,TreeNode lastNodeInList){
        if (node == null)
            return;
        TreeNode current = node;
        if (current.left != null){
            converthelper(current.left,lastNodeInList);
        }
        current.left = lastNodeInList;
        if (lastNodeInList != null){
            lastNodeInList.right = current;
        }
        lastNodeInList = current;
        if (current.right != null)
            converthelper(current,lastNodeInList);
    }
}
