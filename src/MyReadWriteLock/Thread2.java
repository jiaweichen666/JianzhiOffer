package MyReadWriteLock;

public class Thread2 extends  Thread {
    public int i;
    public MyReadWriteLock myReadWriteLock;
    public  Thread2(int i,MyReadWriteLock myReadWriteLock){
        this.i = i;
        this.myReadWriteLock = myReadWriteLock;
    }

    @Override
    public void run() {
        try {
            myReadWriteLock.lockwrite();
            Thread.sleep(1000);
            System.out.println("第" + i +"个写任务");
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            try {
                myReadWriteLock.unlockwrite();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
