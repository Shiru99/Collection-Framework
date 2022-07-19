package Collection.List;

/* 

    Vectors are same as ArrayList/Dynamic Array
    but
        1.  vectors have all their methods "Synchronized" 
            means  ==>  in case of program running on multi-core, to avoid clashing synchronized is used
                
            eg. add(4) & add(11) on two cores may cause some abstract complication
                here synchronized makes it [4,11] by locking them and releases them in order
            
            for normal programs increases time of execution

        2.  
            ArrayList*1.5     (size increases by 1.5 times)
            Vector*2          (size increases by 2 times)

*/



import java.util.*;

public interface Vectors{
    
    public static void main(String[] args) {
    
        List<String> v = new Vector<>();

        v.add("John Doe");
        v.add("Jenny Doe");
        v.add("Jerry Doe");
        v.remove("Jerry Doe");

    }
}