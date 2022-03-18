//Java Program to create 5 Threads using Runnable interface
public class ThreadUsingRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello India");
    }

    public static void main(String[] args) {
        for (int i=0;i<5;i++) {


            ThreadUsingRunnable obj = new ThreadUsingRunnable();
            Thread t1 = new Thread(obj);

            t1.start();
        }


    }
}
