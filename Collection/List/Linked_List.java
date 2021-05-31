/* 

    linked list are preferred for deletion or insertion of elements (not from/at last)
    while repeatedly accessing is preferred over Arraylist

    Linked List implements both List & Queue interfaces

    //    these methods Throws exceptions :
    //                  add(), remove(), element()

    //    these methods doesn't Throw exceptions :  (rather returns false/null with same functionalities)
    //                  offer(), poll(), peek()

*/

import java.util.*;

public interface Linked_List {
    
    public static void main(String[] args) {
        
        List<Integer> ll = new LinkedList<>(); // have all functions of arraylist bz they are of List
        List<Integer> al = new ArrayList<>();


        // adding at 0th position
        // timeDiff(ll);                    //  LinkedList --> 221 ms
        // timeDiff(al);                    //  ArrayList  --> 110944 ms  
                                            // better to make ll & convert it to al

        // adding at the end
        // timeDiff(ll);                   //  LinkedList --> 221 ms
        // timeDiff(al);                   //  ArrayList  -->  79 ms


        List<Integer> ll1 = new LinkedList<>();
        List<Integer> al1 = new ArrayList<>();

        long start,end;
        
        // time to convert LinkedList to Arraylist
        start = System.currentTimeMillis();
        al1.addAll(ll);
        end = System.currentTimeMillis();
        System.out.println("LinkedList to Arraylist --> "+(end-start)+" ms");       //  --> 27 ms

        // time to convert Arraylist to LinkedList
        start = System.currentTimeMillis();
        ll1.addAll(al);
        end = System.currentTimeMillis();
        System.out.println("Arraylist to LinkedList --> "+(end-start)+" ms");       //  --> 103 ms
        
        

    }

    static void timeDiff(List<Integer> l){
        long start = System.currentTimeMillis();

        for(int i=0;i<1_000_000;i++){
            // l.add(0,i*10);
            l.add(i*10);
        }

        long end = System.currentTimeMillis();

        System.out.println(l.getClass().getSimpleName()+" --> "+(end-start)+" ms");

    }
}