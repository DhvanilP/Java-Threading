public class ThreadImplementingRunnable implements Runnable{
    public void run(){
        System.out.println("This is a running thread with ID:");
    }
}
class Runner2 {
    public static void main(String args[]){
        ThreadImplementingRunnable RunnableObject=new ThreadImplementingRunnable();
        Thread t=new Thread(RunnableObject);
        t.start();
    }
}
