//####################################  Map Interface  #####################################################
//  
//          HashMap,EnumMap,LinkedHashMap,WeakHashMap,TreeMap implements Map interface 
//
//#############################################################################################################


/*
    Map contains Key-Value pair 


    Hash Function :

        key -> HashFunction -> int (hashcode)

    Internal Working of HashMap :

        from hashcode using module (most of the time) it calculates hash & according to this value HashMap store key-value pair in array. hash of every key is calculated (using hashcode) and the element are placed in the array using this hash value.

        Default capacity is kept 16, load factor = 0.75 as it get crossed capacity gets doubled and new hash gets calculated according to new capacity (this helps in maintaining min. collisions)

        0 -> position for null
        1 
        2
        :
        :
        14
        15


*/


package DSA.CollectionFramework.Maps;

import java.util.*;
import java.util.Map.Entry;

public class HashMaps {
    
    public static void main(String[] args) {

        
            Map<String,Integer> hm = new HashMap<>();

            hm.put("One", 1);
            hm.put("Two", 2);
            hm.put("Five", 5);

            System.out.println(hm);                             //  {Five=5, One=1, Two=2}


            hm.put("One",11);
            System.out.println(hm);                             //  {Five=5, One=11, Two=2}

            System.out.println(hm.putIfAbsent("One",111));      // inserts this pair if doesn't exists
            System.out.println(hm);   
            System.out.println(hm.get("One"));                  //  11
            System.out.println(hm.get("Three"));                //  null

            System.out.println(hm.containsKey("Three"));                    //  false
            System.out.println(hm.containsValue(2));                        //  true

            
            System.out.println(hm.replace("One",0));                    //  11
            System.out.println(hm);                                     //  {Five=5, One=0, Two=2}
            System.out.println(hm.replace("Nine",9));                   //  null
            System.out.println(hm);                                     //  {Five=5, One=0, Two=2}

            // replaces only if value matches
            System.out.println(hm.replace("One",1,101));                //  false => so no replace
            System.out.println(hm);                                     //  {Five=5, One=0, Two=2}
            System.out.println(hm.replace("One",0,101));                //  true => so replace
            System.out.println(hm);                                     //  {Five=5, One=101, Two=2}

            System.out.println(hm.remove("One"));                       //  101
            System.out.println(hm);                                     //  {Five=5, Two=2}
            System.out.println(hm.remove("Two",101));                   //  false => so no remove
            System.out.println(hm);                                     //  {Five=5, Two=2}
            System.out.println(hm.remove("Two",2));                     //  true => so remove
            System.out.println(hm);                                     //  {Five=5}

            
            hm.put("One", 1);
            hm.put("Two", 2);

            System.out.println(hm.keySet());            //  [Five, One, Two]
            System.out.println(hm.values());            //  [5, 1, 2]
            System.out.println(hm.entrySet());          //  [Five=5, One=1, Two=2]
            

            //    entryset : 
            //
            //    Entry<K,V>{
            //        K key;
            //        V value;
            //    }
            

            // Set<Entry<String,Integer>> entries = hm.entrySet();

            // for (Entry<String,Integer> entry : entries) {
            for (Entry<String,Integer> entry : hm.entrySet()) {

                entry.setValue(entry.getValue()*1000);
            }

            System.out.println(hm);                 //  {Five=5000, One=1000, Two=2000}
            
        




    }

}