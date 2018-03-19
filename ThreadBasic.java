public class ThreadBasic extends Thread {
    //Thread class provide constructors and methods to create and perform operations on a thread.
    // Thread class extends Object class and implements Runnable interface.
    public void run() {
        System.out.println("This is a thread running with id:" + this.getId());
    }
}

class Runner1 {
    public static void main(String args[]) {
        ThreadBasic  try1 = new ThreadBasic ();
        ThreadBasic  try2 = new ThreadBasic ();
        try1.start();
        try2.start();
    }
}