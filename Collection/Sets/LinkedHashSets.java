/*

    LinkedHashSet maintains the order of elements other features are same as HashSet

    NO constant time benefits        // generally O(n)         // uses Linked List 

*/



import java.util.*;


public class LinkedHashSets {
    public static void main(String[] args) {
        
                Set<String> ls = new LinkedHashSet<>();  
        

                System.out.println(ls.add("Mango"));     //  true
                System.out.println(ls.add("Banana"));    //  true
                System.out.println(ls.add("Apple"));     //  true
                System.out.println(ls.add("Mango"));     //  false
        
                System.out.println(ls);                  //  [Mango, Banana, Apple]   // EXACT order
        
    }
}