//To Create five threads and print "Hello All" using Thread class
public class ThreadExample extends Thread{
    @Override
    public void run() {
        System.out.println("Hello All");
    }

    public static void main(String[] args) {
        ThreadExample t1=new ThreadExample();
        ThreadExample t2=new ThreadExample();
        ThreadExample t3=new ThreadExample();
        ThreadExample t4=new ThreadExample();
        ThreadExample t5=new ThreadExample();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}
