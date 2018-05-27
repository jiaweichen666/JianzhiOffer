package p37SerializeBinaryTrees;

public class Main {
    public static int index = -1;
    public static void main(String[] args) {
        TreeNode[] treeNodes = new TreeNode[6];
        for (int i = 0; i < treeNodes.length; i++) {
            treeNodes[i] = new TreeNode(i+1);
        }
        treeNodes[0].left = treeNodes[1];
        treeNodes[0].right = treeNodes[2];
        treeNodes[1].left = treeNodes[3];
        treeNodes[2].left = treeNodes[4];
        treeNodes[2].right = treeNodes[5];
        String s = SerializeTree(treeNodes[0]);
        System.out.println(s);
        TreeNode root = DeSerializeTree(s);
        PreOrderTravesal(root);
    }
    public static String SerializeTree(TreeNode root){
        StringBuffer stringBuffer = new StringBuffer();
        if (root == null){
            stringBuffer.append("$,");
            return stringBuffer.toString();
        }
        stringBuffer.append(root.val + ",");
        stringBuffer.append(SerializeTree(root.left));
        stringBuffer.append(SerializeTree(root.right));
        return stringBuffer.toString();
    }
    public static TreeNode DeSerializeTree(String s){
        index++;
        String[]  nodes = s.split(",");
        TreeNode leaf = null;
        if (!nodes[index].equals("$")){
            leaf = new TreeNode(Integer.valueOf(nodes[index]));
            leaf.left = DeSerializeTree(s);
            leaf.right = DeSerializeTree(s);
        }
        return leaf;
    }
    public static void PreOrderTravesal(TreeNode root){
        if (root == null)
            return;
        System.out.print(root.val + " ");
        PreOrderTravesal(root.left);
        PreOrderTravesal(root.right);
    }
}
