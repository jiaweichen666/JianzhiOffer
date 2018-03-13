package SubstructureInTree;

public class Solution {
    public boolean hasSubTree(TreeNode tree1,TreeNode tree2){
        boolean result = false;
        if (tree1.val == tree2.val){
            result = doesTree1HasTree2(tree1,tree2);
        }
        if (!result){
            result = hasSubTree(tree1.left,tree2);
        }
        if (!result){
            result = hasSubTree(tree1.right,tree2);
        }
        return result;

    }
    public boolean doesTree1HasTree2(TreeNode tree1,TreeNode tree2){
        if (tree2 == null)
            return true;
        if (tree1 == null)
            return false;
        if (tree1.val != tree2.val)
            return false;
        return doesTree1HasTree2(tree1.left,tree2.left) && doesTree1HasTree2(tree1.right,tree2.right);
    }
}
