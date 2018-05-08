package p34PathInTree;

import java.util.Iterator;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        TreeNode treeNode10 = new TreeNode(10);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode12 = new TreeNode(12);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode7 = new TreeNode(7);
        treeNode10.left = treeNode5;
        treeNode10.right = treeNode12;
        treeNode5.left = treeNode4;
        treeNode5.right = treeNode7;
        treeNode10.right = treeNode12;
        findPath(treeNode10,22);

    }
    public static void findPath(TreeNode root,int expectSum){
        if (root == null)
            return;
        Stack<Integer> path = new Stack<>();
        int currentSum = 0;
        findPathCore(root,expectSum,currentSum,path);
    }
    public static void findPathCore(TreeNode root,int expectSum,int currentSum,Stack<Integer> path){
        currentSum  += root.val;
        path.add(root.val);
        boolean isLeaf  = root.left == null && root.right == null ? true:false;
        if (isLeaf && currentSum == expectSum){
            Iterator<Integer> iterator = path.iterator();
            while (iterator.hasNext()){
                System.out.print(iterator.next() + " ");
            }
            System.out.println();
        }
        if (root.left != null)
           findPathCore(root.left,expectSum,currentSum,path);
        if (root.right != null)
            findPathCore(root.right,expectSum,currentSum,path);
        path.pop();
    }
}
