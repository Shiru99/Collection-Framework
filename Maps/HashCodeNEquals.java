package Maps;

/*
    Note : 
            
        == is a reference comparison, i.e. if both objects point to the same memory location

            By comparing two objects, the value of those objects is not 1. Rather it is their memory addresses in the stack that are different since both objects were created using the new operator. If we had assigned a to b, then we would've had a different result:

        .equals() evaluates to the comparison of values in the objects



    Hash Function :

        key -> HashFunction -> int (hashcode)

        hashcode are defined in such a way that they tries uniqueness but still it is possible that two objects have same hashcode. location of object also contributes in calculation of hashcode of object to maintain uniqueness as much as possible.

    Internal Working of HashMap :

        from hashcode using module (most of the time) it calculates hash & according to this value HashMap store key-value pair in array. hash of every key is calculated (using hashcode) and the element are placed in the array using this hash value.

        Default capacity is kept 16, load factor = 0.75 as it get crossed capacity gets doubled and new hash gets calculated according to new capacity (this helps in maintaining min. collisions)

        0 -> position for null
        1 
        2 -> hashcode1 obj -> hashcode2 obj -> hashcode1 obj -> hashcode3 obj ->...
        3
        4 -> hashcode4 obj 
        :
        :
        14
        15

    Object Class : 

        object class is parent class for java objects, every object of any class inheritances object class

        object class methods :
                                
            hashcode()
            equals()
            getClass()
            clone()
            finalize()
            notify()
            notifyall()
            toString()
            wait()
                        
            This methods can be overridden.
                                
    Best practices : 
            
        1. always use same attributes of an object to generate both hashcode & equals.
        2. equals must be persistence (until object is modified, equals must return same value).
            
            a.equals(b)  ==> a.hashcode() = b.hashcode()
            equal & hashcode : if you override one, then you should override the other 
                                

    How HashMap works :

        1. According to hashcode, hash value gets calculated
        2. According to hash value HashMap gets index for that object in HashMap-Table[]
        3. At this index linked list will be there with keys & values.
        4. If hashcode matches (if same) ==> check equals (it may possible two obj have same hashcode) and accordingly required operations take place.


    The Contract :

        If two objects are equal ==> they must have same hash code BUT If two objects have same hashcode, they may or may not be equal 


*/

import java.util.HashSet;
import java.util.Set;

public class HashCodeNEquals {
    public static void main(String[] args) {
        
        /* 

        String a = "BF";
        String b = "Ae";
        String c = "BF";
        String d = new String("BF");


        System.out.println(a.hashCode());           //  2116
        System.out.println(b.hashCode());           //  2116
        System.out.println(c.hashCode());           //  2116
        System.out.println(d.hashCode());           //  2116

        System.out.println(a==b);                   //  false
        System.out.println(a==c);                   //  true
        System.out.println(a==d);                   //  false

        System.out.println(a.equals(b));            //  false
        System.out.println(a.equals(c));            //  true
        System.out.println(a.equals(d));            //  true

        */

        Pen p1 = new Pen(10,"Blue");
        Pen p2 = new Pen(10,"Blue");

        System.out.println(p1==p2);                 //  false - as both references are different
        System.out.println(p1.equals(p2));          //  false (initially)
                                                    //  Default equal for objects - '=='

        System.out.println(p1);                     //  DSA.Maps.Pen@d716361
        System.out.println(p2);                     //  DSA.Maps.Pen@6ff3c5b5


        // After overridden only equals :


        System.out.println(p1);                     //  DSA.Maps.Pen@d716361
        System.out.println(p2);                     //  DSA.Maps.Pen@6ff3c5b5

        System.out.println(p1==p2);                 //  false - Still references are different
        System.out.println(p1.equals(p2));          //  true 



        // After overridden only hashcode :

        System.out.println(p1);                     //  DSA.Maps.Pen@1fa484
        System.out.println(p2);                     //  DSA.Maps.Pen@1fa484

        System.out.println(p1==p2);                 //  False - As both references are different
        System.out.println(p1.equals(p2));          //  false 



        // After overridden equals & hashCode :

        System.out.println(p1);                     //  DSA.Maps.Pen@1fa484
        System.out.println(p2);                     //  DSA.Maps.Pen@1fa484


        System.out.println(p1.hashCode());          //  2073732
        System.out.println(p2.hashCode());          //  2073732

        System.out.println(p1==p2);                 //  False - As both references are different
        System.out.println(p1.equals(p2));          //  true 

        Set<Pen> pens = new HashSet<>();
        pens.add(p1);
        pens.add(p2);

        System.out.println(pens);               // [DSA.Maps.Pen@1fa484] // only one object
        System.out.println(pens.size());        // 1

    }
}

class Pen{

    int price;
    String colour;

    public Pen(int price,String color ){
            this.price = price;
            this.colour = color;
    }


    @Override
    public boolean equals(Object obj){

        Pen that = (Pen) obj;
        boolean isequal = this.price == that.price && this.colour == that.colour;

        return isequal;
    }

    @Override
    public int hashCode(){
        return price+colour.hashCode();
    }


    // Generated by VScode 

    // @Override
    // public int hashCode() {
    //     final int prime = 31;
    //     int result = 1;
    //     result = prime * result + ((colour == null) ? 0 : colour.hashCode());
    //     result = prime * result + price;
    //     return result;
    // }

    //  @Override
    // public boolean equals(Object obj) {
    //     if (this == obj)
    //         return true;
    //     if (obj == null)
    //         return false;
    //     if (getClass() != obj.getClass())
    //         return false;
    //     Pen other = (Pen) obj;
    //     if (colour == null) {
    //         if (other.colour != null)
    //             return false;
    //     } else if (!colour.equals(other.colour))
    //         return false;
    //     if (price != other.price)
    //         return false;
    //     return true;
    // }
        
}