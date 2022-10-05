package day_52_Set_Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer>queue=new PriorityQueue<>();
        queue.add(5);
        queue.add(8);
        queue.add(12);
        System.out.println("peek() = " + queue.peek());
        System.out.println("queue = " + queue);
        System.out.println("poll() = " + queue.poll());
        System.out.println("queue = " + queue);
        System.out.println("queue.offer(3) = " + queue.offer(3));
        System.out.println("queue = " + queue);
    }
}
