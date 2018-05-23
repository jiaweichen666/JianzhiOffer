package MyReadWriteLock;

public class Thread1 extends Thread {
    public int i;
    public MyReadWriteLock myReadWriteLock;
    public  Thread1(int i,MyReadWriteLock myReadWriteLock){
        this.i = i;
        this.myReadWriteLock = myReadWriteLock;
    }

    @Override
    public void run() {
        try {
            myReadWriteLock.lockread();
            Thread.sleep(1000);
            System.out.println("第" + i +"个任务");
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            try {
                myReadWriteLock.unlockread();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
