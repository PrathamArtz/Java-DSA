import java.util.*;
public class Priorityqueues {
    public static void main(String[] args) {

        //Priority Queue = A FIFO data structure that serves elements
        //                 with the highest priorities first
        //                 before elements with lower priority

        Queue<Double> queue =new PriorityQueue<>();

        queue.offer(2.4);
        queue.offer(1.4);
        queue.offer(5.4);
        queue.offer(28.4);

        System.out.println(queue);
    }
}
