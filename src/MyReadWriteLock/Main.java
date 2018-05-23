package MyReadWriteLock;

public class Main {
    public static void main(String[] args) {
        MyReadWriteLock readWriteLock = new MyReadWriteLock();
        for (int i = 0; i < 2; i++) {
            Thread2 thread2 = new Thread2(i,readWriteLock);
            thread2.start();
        }
        for (int i = 0; i < 10; i++) {
            Thread1 thread1 = new Thread1(i,readWriteLock);
            thread1.start();
        }
    }
}
