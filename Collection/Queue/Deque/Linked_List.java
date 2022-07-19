package Collection.Queue.Deque;

/* 
// 
//    these methods Throws exceptions :
//                                      add(), remove(), element()
// 
//    these methods doesn't Throw exceptions :  (rather returns false/null with same functionalities)
//                                        
//                                      offer(), poll(), peek()
// 
*/


import java.util.LinkedList;
import java.util.Queue;

public class Linked_List {
    
    public static void main(String[] args) {
        
        Queue<Object> q = new LinkedList<>();

        q.add(99);
        q.offer("John");
        System.out.println(q.remove());                         //  99
        System.out.println(q.element());                        //  John

        System.out.println(q.poll());                           //  John
        System.out.println(q.peek());                           //  null
        // System.out.println(q.element());                     //  java.util.NoSuchElementException
    }
}