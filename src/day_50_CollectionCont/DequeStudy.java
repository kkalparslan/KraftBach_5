package day_50_CollectionCont;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStudy {
    public static void main(String[] args) {
        //FİFO
        Deque <Integer> deq=new ArrayDeque<>();

        deq.push(200);
        deq.push(5);
        deq.push(7);
        deq.push(8);
        deq.push(20);
        deq.push(25);
        System.out.println("deq = " + deq); // [25, 20, 8, 7, 5, 200]

        deq.offerFirst(11);
        deq.offerLast(11);
        System.out.println("deq = " + deq); // [11, 25, 20, 8, 7, 5, 200, 11]

        deq.addFirst(15);
        deq.addLast(30);
        System.out.println("deq = " + deq);//[15, 11, 25, 20, 8, 7, 5, 200, 11, 30]

        //deq.pop();
        //System.out.println("deq = " + deq); // [11, 25, 20, 8, 7, 5, 200, 11, 30]
        // deq.addLast(100);
        deq.addFirst(100);
        System.out.println("deq = " + deq); // [100, 15, 11, 25, 20, 8, 7, 5, 200, 11, 30]

        while (!deq.isEmpty()){
            System.out.println("deq.pop() = " + deq.pop());
        }


    }
}
