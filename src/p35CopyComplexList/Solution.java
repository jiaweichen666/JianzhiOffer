package p35CopyComplexList;

public class Solution {
    public void CloneNodes(ListNode head){
        ListNode node = head;
        while(node != null){
            ListNode clonedNode = new ListNode(node.val);
            ListNode nextNode = node.next;
            node.next = clonedNode;
            clonedNode.next = nextNode;
            node = clonedNode.next;
        }
    }
    public void connectSiblingNodes(ListNode head){
        ListNode node = head;
        while (node != null){
            ListNode clonedNode = node.next;
            if (node.sibling == null){
                node = clonedNode.next;
                continue;
            }
            ListNode siblingNode = node.sibling;
            clonedNode.sibling = siblingNode.next;
            node = clonedNode.next;
        }
    }
    public ListNode reConnectNodes(ListNode head){
        ListNode clonedHead = null;
        ListNode clonedNode = null;
        ListNode node = head;
        if (node != null){
            clonedHead= clonedNode = node.next;
            node = clonedNode.next;
        }
        while(node != null){
            clonedNode.next = node.next;
            clonedNode = clonedNode.next;
            node = clonedNode.next;
        }
        return clonedHead;
    }
    public ListNode cloneComplexList(ListNode head){
        CloneNodes(head);
        connectSiblingNodes(head);
        return reConnectNodes(head);
    }
}
