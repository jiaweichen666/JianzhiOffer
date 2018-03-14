package MinInStack;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        for (int i = 0; i < 5; i++) {
            stack.push(i + 1);
        }
        stack.min();
        stack.min();
        stack.pop();
        stack.push(0);
        stack.min();
    }
}
