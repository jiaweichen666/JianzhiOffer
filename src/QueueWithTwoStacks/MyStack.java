package QueueWithTwoStacks;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class MyStack {
    private Queue<Integer> queue1 = new ArrayBlockingQueue<Integer>(10);
    private  Queue<Integer> queue2 = new ArrayBlockingQueue<Integer>(10);
    public void push(int x){
        if (queue1.isEmpty()){
            queue2.add(x);
            System.out.println("Push Success: "+x);
        }
        else {
            queue1.add(x);
            System.out.println("Push Success: " + x);
        }
    }
    public void pop(){
        if (queue1.isEmpty()){
            while(queue2.size() != 1){
                queue1.add(queue2.remove());
            }
            System.out.println("Pop success: "+queue2.remove());
        }else{
            while(queue1.size() != 1) {
                queue2.add(queue1.remove());
            }
            System.out.println("Pop success: "+queue1.remove());
        }
    }
}
