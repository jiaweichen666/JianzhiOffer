package p31StackPushPopOrder;

import java.util.Stack;

public class Solution {
    boolean isPopOrder(int[] push,int[] pop){
        if (push == null && pop == null)
            return false;
        if (push.length != pop.length)
            return false;
        boolean isPopOrder = false;
        Stack<Integer> stack  = new Stack<>();
        int i;
        int j = 0;
        for ( i = 0; i < push.length; i++) {
            if (!stack.empty() && stack.peek() == pop[i]){
                stack.pop();
            }else if (j == push.length && stack.peek() != pop[i]){
                break;
            }else{
                while(j < push.length){
                    if (pop[i] != push[j])
                        stack.push(push[j++]);
                    else{
                        j++;
                        break;
                    }
                }
            }
        }
        if (stack.empty() && i == pop.length)
            isPopOrder  = true;
        return isPopOrder;
    }
}
