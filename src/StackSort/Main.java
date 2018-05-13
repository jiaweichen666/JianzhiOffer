package StackSort;

import java.util.Stack;

/**
 * Description:使用一个辅助栈来排序当前的栈，最后排序栈内的元素应该是最大的元素在栈顶
 *             若辅助栈空，直接将排序站栈顶元素压入辅助站
 *             若排序站栈顶元素小于等于辅助站栈顶元素，则直接将排序栈栈顶元素压入辅助站
 *             否则将辅助栈的元素全部压入排序栈再压回cur重复以上过程
 */
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(3);
        stack.push(4);
        stack.push(2);
        sort(stack);
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
    public static void sort(Stack<Integer> stack){
        Stack<Integer> help = new Stack<>();
        while (!stack.isEmpty()){
            int cur = stack.pop();
            if (help.isEmpty()){
                help.push(cur);
            }else if (cur <= help.peek()){
                help.push(cur);
            }else {
                stack.push(help.pop());
                stack.push(cur);
            }
        }
        while (!help.isEmpty()){
            stack.push(help.pop());
        }
    }
}
