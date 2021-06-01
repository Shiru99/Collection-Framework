import java.util.*;

public class ComparableObjects 
{    
    public static void main(String[] args) {
        
        List<Student> students = new ArrayList<>();
        students.add(new Student(33, "John"));
        students.add(new Student(33, "Jen"));
        students.add(new Student(34, "Jenny"));
        students.add(new Student(31, "Jerry"));
        students.add(new Student(30, "Tom"));
        students.add(new Student(37, "Cat"));

        /*  Student [marks=33, name=John]
            Student [marks=33, name=Jen]
            Student [marks=34, name=Jenny]
            Student [marks=31, name=Jerry]
            Student [marks=30, name=Tom]
            Student [marks=37, name=Cat]    */

        Collections.sort(students);
        students.forEach(System.out::println);      // lambda expression

        /*  After adding Comparables :
    
                Student [marks=30, name=Tom]
                Student [marks=31, name=Jerry]
                Student [marks=33, name=Jen]
                Student [marks=33, name=John]
                Student [marks=34, name=Jenny]
                Student [marks=37, name=Cat]    */
    }
}



class Student implements Comparable<Student>
{
    int marks;
    String name;

    public Student(int marks,String name){
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [marks=" + marks + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student that) 
    {
        /*  returns : (By Default Increasing Order)

                +ve     ==> this obj is Bigger
                -ve     ==> this obj is smaller
                0       ==> Equal           
        */                     

        if(this.marks > that.marks) return +1;
        if(this.marks < that.marks) return -1;
        return this.name.compareTo(that.name);       
        // in case of marks equal ==> sorts by names string sorting is already implemented 
    }
}