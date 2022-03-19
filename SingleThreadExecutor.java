//Java Program to study function of Single Thread Pool
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Work implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread Created: "+Thread.currentThread().getName()+ " "+System.currentTimeMillis());
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class SingleThreadExecutor {
    public static void main(String[] args) {
        System.out.println(" Main Thread: "+Thread.currentThread().getName()+ " "+System.currentTimeMillis());
        Runnable r1=new Work();
        Runnable r2=new Work();
        Runnable r3=new Work();
        Runnable r4=new Work();
        Runnable r5=new Work();
        Runnable r6=new Work();
        Runnable r7=new Work();
        Runnable r8=new Work();
        ExecutorService executor=Executors.newSingleThreadExecutor();
        executor.submit(r1);
        executor.submit(r2);
        executor.submit(r3);
        executor.submit(r4);
        executor.submit(r5);
        executor.submit(r6);
        executor.submit(r7);
        executor.submit(r8);
    }

}
