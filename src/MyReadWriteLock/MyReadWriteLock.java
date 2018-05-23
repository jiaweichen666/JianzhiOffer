package MyReadWriteLock;

public class MyReadWriteLock {
    private  int readcount = 0;
    private  int writecount = 0;
    public void lockread() throws InterruptedException{
        while (writecount > 0){
            synchronized (this){
                wait();
            }
        }
        readcount++;
        System.out.println("进行读操作...");
    }
    public void unlockread() throws InterruptedException{
        readcount--;
        synchronized (this){
            notifyAll();
        }
    }
    public void lockwrite() throws  InterruptedException{
        while (writecount > 0){
            synchronized (this){
                wait();
            }
        }
        writecount ++;
        while (readcount > 0){
            synchronized (this){
                wait();
            }
        }
        System.out.println("进行写操作...");
    }
    public void  unlockwrite() throws InterruptedException{
        writecount--;
        synchronized (this){
            notifyAll();
        }
    }
}
