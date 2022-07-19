package Collection.Queue.AbstractQueue;

/* 

    by default it's min priority queue

*/

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Collections;


public class Priority_Queue {
    public static void main(String args[]) 
    { 
        // MIN priority queue
        Queue<Integer> minPQueue = new PriorityQueue<Integer>(); 

        minPQueue.add(10); 
        minPQueue.add(20); 
        minPQueue.add(15); 

        System.out.println(minPQueue);              //  [10, 20, 15]   // not in sorted order
        System.out.println(minPQueue.peek());       //  10
        minPQueue.poll(); 
        System.out.println(minPQueue.poll());       //  15
        System.out.println(minPQueue.poll());       //  20
        System.out.println(minPQueue.poll());       //  null


        // MAX priority queue
        Queue<Integer> maxPQueue = new PriorityQueue<Integer>(Collections.reverseOrder());  

        maxPQueue.add(10); 
        maxPQueue.add(20); 
        maxPQueue.add(15); 

        System.out.println(maxPQueue);              //  [20, 10, 15]    // not in sorted order
        System.out.println(maxPQueue.peek());       //  20              // in sorted order
        maxPQueue.poll(); 
        System.out.println(maxPQueue.poll());       //  15
        System.out.println(maxPQueue.poll());       //  10
        System.out.println(maxPQueue.poll());       //  null

    } 
}