package QueueWithTwoStacks;

public class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        for (int i = 1; i <= 5; i++) {
            myStack.push(i);
        }
        for (int i = 0; i < 5; i++) {
            myStack.pop();
        }

    }
}
