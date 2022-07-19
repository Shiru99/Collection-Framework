package Maps;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMaps {
    public static void main(String[] args) {
        //  Sorted Map
        Map<Integer,String> treeMap = new TreeMap<Integer,String>(); 
        treeMap.put(3,"Three");
        treeMap.put(4,"Four");
        treeMap.put(1,"One");
        treeMap.put(2,"Two");

        for (Entry<Integer,String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey()+" - "+entry.getValue());
            // 1 - One, 2 - Two, 3 - Three, 4 - Four
        }

    }   
    
}
