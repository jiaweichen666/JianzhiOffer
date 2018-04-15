package MultiThread;

public class Main {
    public static void main(String[] args) throws InterruptedException{
    Object A = new Object();
    Object B = new Object();
    Object C = new Object();
    Thread t1 = new Thread(new Print(A,B),"A");
    Thread t2 = new Thread(new Print(B,C),"B");
    Thread t3 = new Thread(new Print(C,A),"C");
    t1.start();
    Thread.sleep(1);
    t2.start();
    Thread.sleep(1);
    t3.start();
    }

}
