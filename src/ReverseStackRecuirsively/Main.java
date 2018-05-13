package ReverseStackRecuirsively;

import java.util.Stack;

/**
 * Description: 不使用额外的空间来把栈逆置
 */
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        reverse(stack);
        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }
    public static int deleteNumAtTheBottoOfStack(Stack<Integer> stack){
        int result = stack.pop();
        if (stack.isEmpty())
            return result;
        else {
            int last = deleteNumAtTheBottoOfStack(stack);
            stack.push(result);
            return last;
        }
    }
    public static void reverse(Stack<Integer> stack){
        if (stack.isEmpty())
            return;
        int i = deleteNumAtTheBottoOfStack(stack);
        reverse(stack);
        stack.push(i);
    }
}
