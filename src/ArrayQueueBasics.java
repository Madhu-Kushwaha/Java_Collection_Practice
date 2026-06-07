import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayQueueBasics {

    public static void main() {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offer(5);
        q.offerFirst(50);
        System.out.println(q);

        q.pollLast();
        System.out.println(q);
        q.pollFirst();
        System.out.println(q);

        System.out.println(q.size());
        System.out.println(q.peek());
        System.out.println(q.peekFirst());
        System.out.println(q.peekLast());
    }
}

// Method                                   | Description        |
//        | ---------------------------- | ------------------ |
//        | `offerFirst(e)`              | Add at front       |
//        | `offerLast(e)` or `offer(e)` | Add at rear        |
//        | `pollFirst()`                | Remove from front  |
//        | `pollLast()`                 | Remove from rear   |
//        | `peekFirst()`                | View front element |
//        | `peekLast()`                 | View rear element  |

