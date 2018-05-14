package p8NextNodeBinaryTrees;

/**
 * Description:找出有指向父节点指针的二叉树的指定节点的下一个节点（即中序遍历中此节点的下一个节点）
 * Tips：如果root节点有右子树，则下一个节点是右子树的最左下方的节点
 *       如果root节点没有右子树，1、若root节点是他父节点的左孩子，则root节点的下一个节点就是他的父节点
 *                             2、若root节点是他父节点的右孩子，就向上寻找后继节点，假设向上移动到的节点记为s，
 *                                s的父节点记为p，如果发现s是p的左孩子，则p节点就是root的后继节点
 *                             3、如果一直向上寻找知道p节点为空了还没有找到，则返回null
 */
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
        } else if (root.parent != null){
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
