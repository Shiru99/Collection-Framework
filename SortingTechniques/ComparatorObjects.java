import java.util.*;

class StudentClass {
    int marks;
    String name;

    public StudentClass(int marks,String name){
        this.marks = marks;
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }
    public int reverseMarks() {
        return -1*marks;
    }

    @Override
    public String toString() {
        return "Student [name = " + name + "\tmarks = " + marks + "]";
    }
}

class SortByNameThenMarks implements Comparator<StudentClass>
{
    @Override
    public int compare(StudentClass obj1, StudentClass obj2) {
        if(obj1.name.equals(obj2.name)) return (obj1.marks-obj2.marks);
        return obj1.name.compareTo(obj2.name);
    }
}

public class ComparatorObjects 
{
    public static void main(String[] args) {
        
        List<StudentClass> students = new ArrayList<>();
        students.add(new StudentClass(35, "John"));
        students.add(new StudentClass(32, "Jenny"));
        students.add(new StudentClass(31, "Jenny"));
        students.add(new StudentClass(33, "Jenny"));
        students.add(new StudentClass(31, "Jerry"));
        students.add(new StudentClass(36, "Tom"));
        students.add(new StudentClass(30, "Cat"));

        // M-1
        // Collections.sort(students,new SortByNameThenMarks());   

        // M-1 (defined as Anonymous class)
        // Collections.sort(students,new Comparator<StudentClass>() {
        //     @Override
        //     public int compare(StudentClass obj1, StudentClass obj2) {
        //         if(obj1.name.equals(obj2.name)) return (obj1.marks-obj2.marks);
        //         return obj1.name.compareTo(obj2.name);
        //     }
        // });

        // students.forEach(System.out::println);  // lambda expression

        /*  Student [name = Cat     marks = 30]
            Student [name = Jenny   marks = 31]
            Student [name = Jenny   marks = 32]
            Student [name = Jenny   marks = 33]
            Student [name = Jerry   marks = 31]
            Student [name = John    marks = 35]
            Student [name = Tom     marks = 36]
        */

        // much simpler way :

        // Collections.sort(students,(This,That)-> This.name.compareTo(That.name)); // sort by name
        // students.forEach(System.out::println);

        // Other way :

        Collections.sort(students,Comparator.comparing(StudentClass::getName).reversed().thenComparing(StudentClass::getMarks));
        students.forEach(System.out::println);
        /*  
            Student [name = Tom     marks = 36]
            Student [name = John    marks = 35]
            Student [name = Jerry   marks = 31]
            Student [name = Jenny   marks = 31]
            Student [name = Jenny   marks = 32]
            Student [name = Jenny   marks = 33]
            Student [name = Cat     marks = 30]
        */
    }
}