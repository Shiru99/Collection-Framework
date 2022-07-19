package Collection.Sets;

/*

    TreeSet have sorted order of elements, other features are same as HashSet

    NO constant time benefits        // generally O(ln(n))      // uses Tree Map 

*/

import java.util.Set;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {

        Set<String> ts = new TreeSet<>();

        System.out.println(ts.add("Mango")); // true
        System.out.println(ts.add("Banana")); // true
        System.out.println(ts.add("Apple")); // true
        System.out.println(ts.add("Mango")); // false

        System.out.println(ts); // [Apple, Banana, Mango] // Ascending order
    }
}