
import java.util.Queue;
import java.util.LinkedList;

public class queues {
    public static void main(String[] args) {

        // *************************************************************************
        // Queue = FIFO data structure. First-In First-Out (ex. A line of people)

        //          A collection designed for holding elements prior to processing Linear data structure.
        //          add = enqueue, offer(), add()
        //          remove = dequeue, poll()

        // Where are queues useful?

        // 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
        // 2. Printer Queue (Print jobs should be completed in order)
        // 3. Used in LinkedLists, PriorityQueues, Breadth-first search

        // **************************************************************************

        Queue<String> queue = new LinkedList<String>();

        System.out.println(queue.isEmpty());

        queue.add("Ben");
        queue.offer("Luffy");
        queue.offer("Zoro");
        queue.offer("Naruto");
        queue.add("Sanji");
        System.out.println(queue);

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Zoro"));

        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());
        System.out.println(queue);

    }
}
