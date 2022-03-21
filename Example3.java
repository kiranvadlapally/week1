//Java Program store group of integers(Order of inserting elements does not matter and store unique elements)
import java.util.HashSet;
public class Example3 {
    public static void main(String[] args) {
        HashSet<Integer> obj=new HashSet<>();
        obj.add(5);
        obj.add(4);
        obj.add(9);
        obj.add(1);
        obj.add(3);
        obj.add(5);
        obj.add(4);
        obj.add(9);
        obj.add(1);
        obj.add(3);
        System.out.println("Set is "+obj + "Stores only unique elements i.e duplicates not repeated");
    }
}
