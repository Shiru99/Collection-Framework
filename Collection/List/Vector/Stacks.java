package Vector;
/* 

    Last IN First OUT        

    NOTE : 
            1.  Stack extends Vector ==> Deque is better than stack
            
            2.  Vector/ArrayList/LinkedList implements List & list extends Collection.

    methods of Stack :

        push(E e)
        pop()
        peek()
        search(E e)
        empty()

*/

import java.util.*;

public class Stacks {

    public static void main(String[] args) {

        // List<String> stackkk = new Stack(); // ERROR bz : push/pop/peek/empty fn are
        // undefined for List

        Stack stackkk = new Stack();

        stackkk.push("John Doe");
        stackkk.push(99);
        stackkk.push("Jenny Doe");
        stackkk.push(89);
        stackkk.push("Jerry Doe");
        stackkk.push(79);

        System.out.println(stackkk.peek()); // 79
        System.out.println(stackkk.pop()); // 79
        System.out.println(stackkk.peek()); // Jerry Doe
        System.out.println(stackkk.pop()); // Jerry Doe
        System.out.println(stackkk.peek()); // 89
        System.out.println(stackkk.pop()); // 89

        System.out.println(stackkk.empty()); // false

    }

}