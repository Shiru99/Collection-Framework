package Collection.List;

//################################# JAVA Collections Framework  #########################################
//         
// 
//                       |==> List
//          Collection --|==> Set   -> SortedSet
//                       |==> Queue -> Deque
// 
//                 Map --|==> SortedMap
// 
//            Iterator --|==> ListIterator
// 
//########################################################################################################

//      Collection type - Define the Contract/Behavior of the collection 
//          E.g List (Interface)
//  
//      Implementations - How it actually works behind the scenes 
//          E.g. ArrayList/LinkedList (Implementation)
// 

//##################################  Collection Interface  #############################################
//
// 
//      1. have basic ops : add(),size(),remove(),iterator(),addAll(),removeAll(),clear()
//      2. List,Set,Queue(interface) extend collection interface 
//
// 
// 
//      List Interface :
//     
//              ArrayList,LinkedList,Stack,Vector implements List interface
//              have basic ops : size(),add(),addAll(),remove(),removeAll(),clear(),iterator(),
//                               get(),set(),contains(),isEmpty(),toArray()
//
//      Set Interface :
//     
//              EnumSet,HashSet,LinkedHashSet,TreeSet implements Set interface
//              have basic ops : size(),add(),addAll(),remove(),removeAll(),clear(),iterator(),
//                               get(),set(),contains(),isEmpty(),toArray()
//
//      Queue Interface :
//     
//              ArrayDeque,LinkedList,PriorityQueue implements Queue interface
//              have basic ops : size(),add(),addAll(),remove(),removeAll(),clear(),iterator(),
//                               get(),set(),contains(),isEmpty(),toArray()
// 
//              (LinkedList implements both queue & list interface)
//#######################################################################################################

//####################################  Map Interface  ##################################################
//  
//          HashMap,EnumMap,LinkedHashMap,WeakHashMap,TreeMap implements Map interface 
//
//#######################################################################################################



//######################################  Arraylist : dynamic array #####################################


import java.util.ArrayList;
import java.util.List;

public class Array_List {

    public static void main(String[] args) {
        
        /* 
            ArrayList stuff = new ArrayList();
            stuff.add("John");
            stuff.add("Doe");
            stuff.add(33);
            stuff.add(3.14f);
            stuff.add(true);
            stuff.add(null);

            System.out.println(stuff);
            // [John, Doe, 33, 3.14, true, null]

        */
        
            /*

                ArrayList<Integer> nums = new ArrayList<Integer>();  
                ERROR //  ArrayList<int> nums = new ArrayList<int>(); 
                wrapperclass of int is Integer

                    Integer x = new Integer(11);
                    System.out.println(++x);            // 12

            */

        /* 

        ArrayList<String> fruits = new ArrayList<String>();         // generic takes only Strings 
        
        // fruits.add(33);              // ArrayList<String> is not applicable for the arguments (int)
        fruits.add("Apple");
        fruits.add("Pineapple");  
        fruits.add("Mango");  
        fruits.add("Alooo");  

        System.out.println(fruits);             //  [Apple, Pineapple, Mango, Alooo]

        */


        List<String> fun = new ArrayList<String>();   

        fun.add("Apple");
        fun.add("Pineapple");  
        fun.add("Mango");  

        System.out.println(fun);                                // [Apple, Pineapple, Mango, Alooo]
        System.out.println(fun.getClass());                     // class java.util.ArrayList
        System.out.println(fun.getClass().getSimpleName());     // ArrayList   
    
        /*

        NOTE : 
                1. List is interface of Arraylist i.e. Arraylist implements List interface
                2. it makes interconversion easy that's why List is preferred rather than ArrayList
                e.g. 
                        List<String> fun = new ArrayList<String>();  
                        List<String> sfun = new LinkedList<String>();
                        fun.addAll(sfun);

        */

        fun.add("Alooo");

        ArrayList<String> stuff = new ArrayList<String>();
        stuff.add("John");
        stuff.add("Doe");
        stuff.add("33");
        stuff.add("3.14f");
        stuff.add("true");
        stuff.add("null");

        fun.addAll(stuff);     // [Apple, Pineapple, Mango, Alooo, John, Doe, 33, 3.14f, true, null]

        System.out.println(fun); 
        // System.out.println(fun.get(1));         //  Pineapple

        fun.set(1, "Nagpuri Oranges");
        // System.out.println(fun.get(1));         //  Nagpuri Oranges

        fun.remove("Alooo");
        fun.remove(0);
        // System.out.println(fun);         //  [Nagpuri Oranges, Mango, John, Doe, 33, 3.14f, true, null]

        // List<String> stuff = new ArrayList<>();
        fun.removeAll(stuff);
        // System.out.println(fun);                    //  [Nagpuri Oranges, Mango]

        fun.clear();
        // System.out.println(fun);                    //  []
        // System.out.println(fun.isEmpty());          //  true


        fun.add("Apple");
        fun.add("Pineapple");  
        fun.add("Mango"); 

        System.out.println(fun.contains("apple"));          //  false


        /////// ArrayList to Array Conversion ///////

        // M-1
        Object[] temp0 = fun.toArray();                     // "Object Class"
        for (Object ob : temp0) {
            System.out.print(ob+" ");                       // Apple Pineapple Mango 
        }
        System.out.println();

        // M-2
        String temp[] = new String[fun.size()];
        fun.toArray(temp);
        
        for (String string : temp) {
            System.out.print(string+" ");                       // Apple Pineapple Mango
        }
        System.out.println();
    }
}