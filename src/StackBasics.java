import java.util.ArrayDeque;
import java.util.Queue;

public class StackBasics {
    public static void main() {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);


    }
}
