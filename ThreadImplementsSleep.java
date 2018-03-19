public class ThreadImplementsSleep extends Thread {
    private String s;
    ThreadImplementsSleep(String s){
        super();
        this.s=s;
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(s);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Runner3 {
    public static void main(String args[]) {
        ThreadImplementsSleep t1 = new ThreadImplementsSleep("A");
        ThreadImplementsSleep t2 = new ThreadImplementsSleep("B");
        t1.start();
        t2.start();
    }
}