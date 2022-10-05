package day_50_CollectionCont;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueStudy {
    public static void main(String[] args) {
        Queue<Integer>numQue=new LinkedList<>();
        numQue.offer(1);
        numQue.offer(2);
        numQue.offer(4);
        numQue.offer(7);
        numQue.offer(8);
        numQue.offer(9);
        System.out.println("numQue = " + numQue); // [1, 2, 4, 7, 8, 9]

        // remove()
        numQue.remove();
        System.out.println("numQue = " + numQue); // FIFO-->[2, 4, 7, 8, 9]

        // peek()
        System.out.println("numQue.peek() = " + numQue.peek());

        // element()
        System.out.println("numQue.element() = " + numQue.element());
        // peek ten farkı sırada element yoksa exception atar..
        System.out.println("numQue = " + numQue); // [2, 4, 7, 8, 9]

        while (!numQue.isEmpty()){
            System.out.print("numQue.poll() = " + numQue.poll()+"--->");
           // System.out.println(numQue.element());  //element kalmadığı için exception attı
            System.out.println(numQue.peek());
        }
       System.out.println("numQue = " + numQue);
        //System.out.println("numQue.poll() = " + numQue.poll());
        //System.out.println("numQue.remove() = " + numQue.remove());


    }
}
