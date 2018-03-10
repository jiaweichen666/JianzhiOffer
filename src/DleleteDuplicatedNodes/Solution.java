package DleleteDuplicatedNodes;

public class Solution {
    public void deleteDuplication(ListNode head){
        if (head == null)
            return;
        ListNode current = head;
        ListNode pre = null;
        while(current != null){
            boolean tobeDeleted = false;
            if (current.next != null && current.val == current.next.val){
                tobeDeleted = true;
            }
            if (!tobeDeleted){
                pre = current;
                current = current.next;
            }
            else {
                ListNode dcurrent = current;
                int dval = dcurrent.val;
                while((dcurrent.val == dval)){
                    if (dcurrent.next != null) {
                        ListNode dnext = dcurrent.next;
                        dcurrent.val = dnext.val;
                        dcurrent.next = dnext.next;
                    }else{
                        //若最后一个节点也是需要删除的执行以下步骤
                        pre.next = null;
                        current = null;
                        return;
                    }

                }
                if (pre == null){
                    head = current;
                }
                else{
                    pre.next = dcurrent;
                }
                current = dcurrent;
            }
        }
    }
}
