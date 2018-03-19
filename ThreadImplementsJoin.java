public class ThreadImplementsJoin extends Thread {
    private String s;

    ThreadImplementsJoin(String s) {
        super();
        this.s = s;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(550);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Runner4 {
    public static void main(String args[]) throws InterruptedException {
        ThreadImplementsJoin t1 = new ThreadImplementsJoin("A");
        ThreadImplementsJoin t2 = new ThreadImplementsJoin("B");
        ThreadImplementsJoin t3 = new ThreadImplementsJoin("C");
        t1.start();
        t2.start();
        t3.start();
        t2.join();
        System.out.println("Id of 3 is:"+t3.getName());
    }
}