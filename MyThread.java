public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("ChildThread " +Thread.currentThread().getName()+ " Created at " +System.currentTimeMillis());
    }

    public static void main(String[] args) {
        System.out.println("Main Thread " +Thread.currentThread().getName()+ " Created at " +System.currentTimeMillis());
        MyThread obj=new MyThread();
        obj.start();
    }
}
