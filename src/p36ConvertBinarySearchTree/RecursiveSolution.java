package p36ConvertBinarySearchTree;

/**
 * Description:left指向中序遍历的第一个节点，right随着中序遍历的过程向右拓展。
 */
public class RecursiveSolution {
    TreeNode leftHead = null;
    TreeNode rightHead = null;
    public TreeNode Convert(TreeNode pRootOfTree){
        if(pRootOfTree == null)
            return null;
        Convert(pRootOfTree.left);
        if (rightHead == null){
            leftHead = rightHead = pRootOfTree;
        }else {
            rightHead.right = pRootOfTree;
            pRootOfTree.left = rightHead;
            rightHead = pRootOfTree;
        }
        Convert(pRootOfTree.right);
        return leftHead;
    }
}
