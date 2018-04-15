package aa;

public class Main {
    public static void main(String[] args) {
        Object lock = new Object();
        Print print = new Print();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                print.print_A();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {

                print.print_B();
                }
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    print.print_C();
                }
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
