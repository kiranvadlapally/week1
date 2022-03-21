//Java Prog to understand working of stack
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> obj=new Stack<>();
        for(int i=1;i<=6;i++){
            obj.add(i);
        }
        System.out.println("Stack is "+obj);
        System.out.println("Removing elements");
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println("Existing Elements are "+obj);

    }
}
