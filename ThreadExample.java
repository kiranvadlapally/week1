//To Create five threads and print "Hello All" using Thread class
public class ThreadExample extends Thread{
    @Override
    public void run() {
        System.out.println("Hello All");
    }

    public static void main(String[] args) {
        for (int i=0;i<5;i++) {
            ThreadExample t1 = new ThreadExample();
            t1.start();
        }


    }
}
