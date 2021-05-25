/* 
//
//    Array_Deque / Array Double Ended Queue / ArrayDeck
//
//    1.      Insertion/Deletion    ==> [ FRONT ------------- REAR ]    <==   Insertion/Deletion
//
//            addFirst or offerFirst                                          addLast or offerLast
//            removeFirst or pollFirst                                        removeLast or pollLast
//            getFirst or peekFirst                                           getLast or peekLast
//
//        methods as queue :
//                            add(), remove(), element()
//                            offer(), poll(), peek()
//        methods as Stack :
//                            pop(),peek(),push()

//    2.    Stack extends Vector ==> Deque is better than stack
*/


package DSA.CollectionFramework.Collection.Queue.Deque;
import java.util.*;

public class Array_Deque {

    public static void main(String[] args) {
        
        ArrayDeque adq = new ArrayDeque();      // ArrayDeque as Stack


         // ArrayDeque as Stack                // better than Stack()

        adq.push("hmm");
        adq.push(99);
        adq.push(0.01f);

        System.out.println(adq);                    //  [0.01, 99, hmm]
        System.out.println(adq.pop());              //  0.01
        System.out.println(adq.pop());              //  99
        System.out.println(adq.pop());              //  hmm


        // ArrayDeque as queue



        adq.add("hmm");
        adq.add(99);
        adq.add(0.01f);

        System.out.println(adq);                    //  [hmm, 99, 0.01]
        System.out.println(adq.remove());           //  hmm
        System.out.println(adq.remove());           //  99
        System.out.println(adq.remove());           //  0.01



    }
    
}