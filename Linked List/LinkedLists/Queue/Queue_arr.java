import java.util.ArrayDeque;

public class Queue_arr {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue =new ArrayDeque<>();
        queue.offer(3);
        queue.offer(8);
        queue.poll();
        queue.peek();
        queue.size();

    }
}
