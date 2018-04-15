package MultiThread;

public class Print implements Runnable{
    private Object self;
    private Object next;
    public  Print(Object self,Object next){
        this.self = self;
        this.next = next;
    }
    public void run(){
        for (int i = 0; i < 3; i++) {
            synchronized (self){
                synchronized (next){
                    System.out.println(Thread.currentThread().getName());
                    next.notify();
                }
                try{
                    if (i == 2){
                        return;
                    }
                    self.wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
        }
    }
}
