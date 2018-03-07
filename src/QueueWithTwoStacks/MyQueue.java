package QueueWithTwoStacks;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();
    public void appendTail(int x){
        stack1.push(x);
        System.out.println("Append Success!: "+x);
    }
    public void deleteHead(){
        if (!stack2.empty()){
            System.out.println("Delete Success! "+stack2.pop());
        }else {
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
            System.out.println("Delete Success! "+stack2.pop());
        }
    }
}
