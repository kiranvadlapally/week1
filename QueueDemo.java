//Task4
import java.util.LinkedList;
import java.util.Queue;
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> obj=new LinkedList<>();
        for(int i=1;i<=6;i++){
            obj.add(i);
        }
        System.out.println("Queue is "+obj);
        System.out.println("Removing elements");
        System.out.println(obj.poll());
        System.out.println(obj.poll());
        System.out.println("Existing Elements are "+obj);

    }
}
