package MinInStack;

import java.util.Stack;

public class MyStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    private int min;
    public MyStack(){
        stack = new Stack<>();
        minStack = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    public void push(int num){
        stack.push(num);
        if (num < min){
            minStack.push(num);
            min = num;
        }else {
            minStack.push(min);
        }
    }
    public void pop(){
        System.out.println("Num "+ stack.pop()+ " has been poped!");
        minStack.pop();
    }
    public void min(){
        System.out.println("The min in stack is : "+minStack.peek());
    }
}
