package p68LowestCommanParentInTree;

/**
 * Description:在没有指向父节点的指针的树中找出两个节点的最低公共父节点
 * Tips：基于递归的解法，效率不是很高
 * 判断当前遍历的节点，是否制定的两个节点都是当前节点所在子树的子节点
 * 若是则判断当前节点的左右子树是否都包含制定的两个节点，若两个都不全部包含，则当前节点就是最低公共父节点
 * 若有一棵子树包含而另一颗不包含，则在包含的子树中继续重复以上过程
 * 知道找出满足条件的节点。
 * 因为递归过程中存在重复遍历所以效率不高。
 */
public class WithoutParentPointerSolution {
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
        System.out.println(getLowwestCommonParentNode(a,f,s));
    }
    public static String getLowwestCommonParentNode(TreeNode root,TreeNode node1,TreeNode node2){
        if (root == null || node1 ==  null || node2 == null)
            return "Invalid Input!";
        String ParentNodeVal = null;
        if (DoesNodeContains(root,node1) && DoesNodeContains(root,node2)){
            boolean leftCointains = DoesNodeContains(root.left,node1) && DoesNodeContains(root.left,node2);
            boolean rightContains = DoesNodeContains(root.right,node1) && DoesNodeContains(root.right,node2);
            if (!leftCointains && !rightContains) {
                ParentNodeVal = root.s;
                return ParentNodeVal;
            }else if (leftCointains){
                return getLowwestCommonParentNode(root.left,node1,node2);
            }else if (rightContains) {
                return getLowwestCommonParentNode(root.right, node1, node2);
            }
        }
        return "Not exist!";
    }
    public static boolean  DoesNodeContains(TreeNode root,TreeNode node){
        if (root == null || node == null)
            return false;
        if (root == node)
            return true;
        return DoesNodeContains(root.left,node) || DoesNodeContains(root.right,node);
    }
}
