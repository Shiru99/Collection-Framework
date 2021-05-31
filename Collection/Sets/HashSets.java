/*
    Set is interface with following methods :
    
        1.  add(element)
        2.  addAll(collection)
        3.  remove(element)
        4.  removeAll(collection)
        5.  retainAll(collection)       // others get removed
        6.  clear()
        7.  size()
        8.  contains()
        9.  containsAll()
        10. isempty()
        11. toArray()

    Operations of sets : 

        1.  Union           :   x.addAll(y)
        2.  Intersection    :   x.retainAll(y)
        3.  Subset          :   y.containAll(y) 

    ----------------------------------------------------------------------------------------

    HashSet : 
        
        uses Hash function (Hash function gives unique output on particular input), which gives unique location to store that data, that's why it take constant time for most of the operations.

*/

import java.util.*;

public class HashSets {
    public static void main(String[] args) {

        Set<String> s = new HashSet<>();

        System.out.println(s.add("Mango"));     //  true
        s.add("Banana");
        s.add("Apple");  
        System.out.println(s.add("Mango"));     //  false

        System.out.println(s);                  //  [Apple, Mango, Banana]  // Random order

        Set<String> s2 = new HashSet<>();

        s2.add("Mango");   
        s2.add("Banana");  
        s2.add("Pineapple");     
        s2.add("Kairi");    
        System.out.println(s2);                 // [Kairi, Mango, Pineapple, Banana]

        Set<String> s3 = new HashSet<>();

        s3.add("Mango");     
        s3.add("Banana");   
        System.out.println(s3);                 // [Mango, Banana]

        
        System.out.println("S2 < S  -> "+s.containsAll(s2));    //  false
        System.out.println("S3 < S -> "+s.containsAll(s3));     //  true
        System.out.println("S u S2  -> "+s.addAll(s2));         //  true
        System.out.println("S n S2  -> "+s.retainAll(s2));      //  true
    }  
}