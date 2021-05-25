
/* 

    by default it's min priority queue

*/

package DSA.CollectionFramework.Collection.Queue.Deque.AbstractQueue;
import java.util.*;

public class Priority_Queue {
    public static void main(String args[]) 
    { 

        PriorityQueue<Integer> minPQueue = new PriorityQueue<Integer>(); 
        // MIN priority queue

        minPQueue.add(10); 
        minPQueue.add(20); 
        minPQueue.add(15); 

        System.out.println(minPQueue);              //  [10, 20, 15]   // not in sorted order
        System.out.println(minPQueue.peek());       //  10
        minPQueue.poll(); 
        System.out.println(minPQueue.poll());       //  15
        System.out.println(minPQueue.poll());       //  20
        System.out.println(minPQueue.poll());       //  null



        PriorityQueue<Integer> maxPQueue = new PriorityQueue<Integer>(Collections.reverseOrder());  
        // MAX priority queue

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