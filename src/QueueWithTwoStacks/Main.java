package QueueWithTwoStacks;

public class Main {
    public static void main(String[] args) {
        /*MyQueue queue = new MyQueue();
        queue.appendTail(1);
        queue.appendTail(2);
        queue.appendTail(3);
        queue.appendTail(4);
        queue.appendTail(5);
        queue.deleteHead();
        queue.deleteHead();
        queue.deleteHead();
        queue.deleteHead();
        queue.deleteHead();*/
        MyStack myStack = new MyStack();
        for (int i = 1; i <= 5; i++) {
            myStack.push(i);
        }
        for (int i = 0; i < 5; i++) {
            myStack.pop();
        }

    }
}
