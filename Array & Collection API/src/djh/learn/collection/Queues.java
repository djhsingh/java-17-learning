import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        System.out.println("Queues.....");
        Queue queue = new PriorityQueue();
        queue.add("Deepak");
        queue.add("Singh");
        queue.add("Jangra");
        queue.remove();
        System.out.println(queue);
    }
}
