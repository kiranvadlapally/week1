public class ThreadRunnable implements Runnable{

    public void run() {
        System.out.println("ChildThread " +Thread.currentThread().getName()+ " Created at " +System.currentTimeMillis());
    }

    public static void main(String[] args) {
        System.out.println("Main Thread " +Thread.currentThread().getName()+ " Created at " +System.currentTimeMillis());
        ThreadRunnable obj=new ThreadRunnable();
        Thread t1=new Thread(obj);
        t1.start();
    }
}
