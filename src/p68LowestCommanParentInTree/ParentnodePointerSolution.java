package p68LowestCommanParentInTree;

/**
 * Description：找出两个节点的最低公共父节点，在给定有指向父节点的指针的树中
 * Tips：将问题转化为找两个链表的第一个公共节点
 */
public class ParentnodePointerSolution {
    public static void main(String[] args) {
        PointerTreeNode a = new PointerTreeNode("a");
        PointerTreeNode b = new PointerTreeNode("b");
        PointerTreeNode c = new PointerTreeNode("c");
        PointerTreeNode d = new PointerTreeNode("d");
        PointerTreeNode e = new PointerTreeNode("e");
        PointerTreeNode f = new PointerTreeNode("f");
        PointerTreeNode g = new PointerTreeNode("g");
        PointerTreeNode h = new PointerTreeNode("h");
        PointerTreeNode i = new PointerTreeNode("i");
        a.left = b;
        a.right = c;
        b.father = a;
        c.father = a;
        b.left = d;
        b.right = e;
        d.father = b;
        e.father = b;
        d.left = f;
        d.right = g;
        f.father = d;
        g.father = d;
        e.left = h;
        e.right = i;
        h.father = e;
        i.father = e;
        System.out.println(getLowwestFather(a,f,h));
    }
    public static String getLowwestFather(PointerTreeNode root,PointerTreeNode node1,PointerTreeNode node2){
        if (root == null || node1 == null || node2 == null)
            return "Invalid Input!";
        int lenthNode1 = getListLength(node1);
        int lenthNode2=  getListLength(node2);
      //  System.out.println(lenthNode1 + " " + lenthNode2);
        PointerTreeNode p1 = node1;
        PointerTreeNode p2 = node2;
        int diff = lenthNode1 >= lenthNode2 ? lenthNode1 - lenthNode2 : lenthNode2 - lenthNode1;
        if (lenthNode1 >= lenthNode2){
            for (int i = 0; i < diff; i++) {
                p1 = p1.father;
            }
        }else {
            for (int i = 0; i < diff; i++) {
                p2 = p2.father;
            }
        }
        while (p1 != p2 && p1 != null && p2 != null){
            p1 = p1.father;
            p2 = p2.father;
        }
        if (p1 == null)
            return "Not Exist!";
        else
            return p1.val;

    }
    public static int getListLength(PointerTreeNode root){
        if (root == null)
            return 0;
        return 1 + getListLength(root.father);
    }
}
