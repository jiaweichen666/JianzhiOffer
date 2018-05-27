package AllKindsOfCollectionIterate;

import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            priorityQueue.add(i);
        }
        Iterator<Integer> iterator  = priorityQueue.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
