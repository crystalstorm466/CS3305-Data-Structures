package Quiz;

import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("apple");
        queue.add("cherry");
        queue.add("grapes");

        System.out.println("Queue: " + queue);
        queue.remove();
        System.out.println("Queue After removal: " + queue);
        System.out.println("Peek the front of queue: " + queue.peek());
        System.out.println("Queue After peeked: " + queue);


    }
}
