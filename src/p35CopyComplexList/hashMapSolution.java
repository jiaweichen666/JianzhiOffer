package p35CopyComplexList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Tips:采用哈希表记录node,clonedNode,第一遍复制next指针，第二遍根据node指向的值从hashmap中取出对应的clonedNode，
 * 复制random指针。
 */
public class hashMapSolution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if (pHead == null)
            return  null;
        HashMap<RandomListNode,RandomListNode> hashMap = new HashMap<>();
        RandomListNode node = pHead;
        RandomListNode newHead = new RandomListNode(-1);
        RandomListNode pre = newHead;
        while (node != null){
            RandomListNode clonedNode = new RandomListNode(node.label);
            hashMap.put(node,clonedNode);
            pre.next = clonedNode;
            pre = clonedNode;
            node = node.next;
        }
        Iterator <Map.Entry<RandomListNode,RandomListNode>>iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = iterator.next();
            RandomListNode realnode = (RandomListNode) entry.getKey();
            RandomListNode clonedNode = (RandomListNode) entry.getValue();
            RandomListNode nodeRandom = realnode.random;
            RandomListNode ClonedNodeRandom = hashMap.get(nodeRandom);
            clonedNode.random = ClonedNodeRandom;
        }
        return newHead.next;
    }
}
