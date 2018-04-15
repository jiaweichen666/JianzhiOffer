package aa;

public class Print {
    private boolean flag_a = true;
    private boolean flag_b = false;
    private boolean flag_c = false;
    public synchronized void print_A(){
        while (flag_b || flag_c){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            System.out.println("A");
        flag_a = false;
        flag_b = true;
        flag_c = false;
        this.notifyAll();
    }
    public synchronized void print_B(){
        while (flag_a || flag_c){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            System.out.println("B");
            flag_a = false;
            flag_b = false;
            flag_c = true;
           // this.notifyAll();
    }
    public synchronized void print_C(){
        while (flag_a || flag_b){
            try {
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("C");
        flag_a = true;
        flag_b = false;
        flag_c = false;
        //this.notifyAll();
    }
}
