package p68LowestCommanParentInTree;

import java.util.*;

/**
 * Description:找出所给节点的最低公共子节点
 * Tips：用回溯法找到到指定节点的路径，设置found值，以便找到之后就不在递归剩余的节点
 * 所查找到的路径使用list存储
 * 根据两个list，从头开始遍历，最后一对相等的节点值就是最低公共子节点。
 */
public class WithoutParentPointerSolutionBestSolution {
    public static void main(String[] args) {
        TreeNode a = new TreeNode("a");
        TreeNode b = new TreeNode("b");
        TreeNode c = new TreeNode("c");
        TreeNode d = new TreeNode("d");
        TreeNode e = new TreeNode("e");
        TreeNode f = new TreeNode("f");
        TreeNode g = new TreeNode("g");
        TreeNode h = new TreeNode("h");
        TreeNode i = new TreeNode("i");
        TreeNode s = new TreeNode("s");
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        d.left = f;
        d.right = g;
        e.left = h;
        e.right = i;
        System.out.println(getLastCommon(a,f,e));
    }
    public static boolean getNodePath(TreeNode root, TreeNode node, List<TreeNode> list){
        if (root == null)
            return false;
        list.add(root);
        boolean found = false;
        if (root == node) {
            found = true;
            return found;
        }
        if (!found)
            found = getNodePath(root.left,node,list);
        if (!found)
            found=  getNodePath(root.right,node,list);
        if (!found)
            list.remove(root);
        return found;
    }
    public static String getLastCommon(TreeNode root,TreeNode node1,TreeNode node2){
        List<TreeNode> list1 = new LinkedList<>();
        List<TreeNode> list2 = new LinkedList<>();
        boolean get1 = getNodePath(root,node1,list1);
        boolean get2 = getNodePath(root,node2,list2);
        String commanParent = "Not Exist!";
        if (get1 && get2){
            TreeNode p = list1.remove(0);
            TreeNode q = list2.remove(0);

            while (!list1.isEmpty() && !list2.isEmpty() && p == q  ){
                commanParent = p.s;
                p = list1.remove(0);
                q = list2.remove(0);
            }
            if (p != q)
                return commanParent;
            else
                return commanParent ;
        }else
            return commanParent;

    }
}
