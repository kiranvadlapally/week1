//Java Program store group of integers(Order of inserting elements does not matter)
import java.util.HashSet;
public class HashsetDemo {
    public static void main(String[] args) {
        HashSet<Integer> obj=new HashSet<Integer>();
        obj.add(5);
        obj.add(4);
        obj.add(9);
        obj.add(1);
        obj.add(3);
        System.out.println("Set is"+obj);
    }
}
