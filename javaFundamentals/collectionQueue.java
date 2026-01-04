package javafundamentals;

import java.util.ArrayDeque;
import java.util.Queue;

public class collectionQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);


        for (Integer value : queue){
            System.out.println(value);
        }

        System.out.println("Pool :" + queue.poll());
        System.out.println("peek  : " + queue.peek());
 
        for (Integer value : queue){
            System.out.println(value);
        }

    }
}
