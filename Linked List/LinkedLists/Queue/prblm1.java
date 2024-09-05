import java.util.LinkedList;

public class prblm1 {
    public static void reverseQueue(LinkedList<Integer> Q){
        if(Q.isEmpty()){
            return;
        }
        
        int front=Q.poll();
        reverseQueue(Q);
        Q.offer(front);

    }
    public static void main(String[] args) {
        LinkedList<Integer> myQueue = new LinkedList<>();
        int[] elements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int element : elements) {
            myQueue.offer(element);
        }
        reverseQueue(myQueue);
        while (!myQueue.isEmpty()) {
            System.out.print(myQueue.poll() + " ");
        }
    }
    }