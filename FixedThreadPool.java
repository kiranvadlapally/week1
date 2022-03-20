import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Work1 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

    }

}
public class FixedThreadPool {
    public static void main(String[] args) {
        Runnable r1=new Work1();
        Runnable r2=new Work1();
        Runnable r3=new Work1();
        Runnable r4=new Work1();
        Runnable r5=new Work1();
        Runnable r6=new Work1();
        Runnable r7=new Work1();
        Runnable r8=new Work1();
        Runnable r9=new Work1();
        Runnable r10=new Work1();

        ExecutorService executor=Executors.newFixedThreadPool(5);
        executor.submit(r1);
        executor.submit(r2);
        executor.submit(r3);
        executor.submit(r4);
        executor.submit(r5);
        executor.submit(r6);
        executor.submit(r7);
        executor.submit(r8);
        executor.submit(r9);
        executor.submit(r10);
    }
}
