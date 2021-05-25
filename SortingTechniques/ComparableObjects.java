package DSA.CollectionFramework.SortingTechniques;


import java.util.*;

public class ComparableObjects {
    
    public static void main(String[] args) {
        
        List<Student> students = new ArrayList<>();
        students.add(new Student(33, "John"));
        students.add(new Student(33, "Jen"));
        students.add(new Student(34, "Jenny"));
        students.add(new Student(31, "Jerry"));
        students.add(new Student(30, "Tom"));
        students.add(new Student(37, "Cat"));

        Collections.sort(students);

        // lambda expression :
        students.forEach(System.out::println);

            /* 
            
                before adding Comparables :

                    Student [marks=33, name=John]
                    Student [marks=33, name=Jen]
                    Student [marks=34, name=Jenny]
                    Student [marks=31, name=Jerry]
                    Student [marks=30, name=Tom]
                    Student [marks=37, name=Cat]
            */

            /* 
            
                After adding Comparables :

                    Student [marks=37, name=Cat]
                    Student [marks=34, name=Jenny]
                    Student [marks=33, name=John]
                    Student [marks=33, name=Jen]
                    Student [marks=31, name=Jerry]
                    Student [marks=30, name=Tom]
            */

    }
}



class Student implements Comparable<Student>{
    int marks;
    String name;

    @Override
    public String toString() {
        return "Student [marks=" + marks + ", name=" + name + "]";
    }

    public Student(int marks,String name){
        this.marks = marks;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student obj) {
        //  For Decreasing Order :
        //      if this returns +ve num ==> current obj smaller
        //                      -ve     ==> current obj Bigger
        //                      0       ==> current obj Equal

        if(this.marks > obj.marks) return -1;
        if(this.marks < obj.marks) return 1;
        return this.name.compareTo(obj.name);       // in case of marks equal ==> sorts by names
                                                    // string sorting is already implemented 
    }

    
    

}