package DSA.CollectionFramework.SortingTechniques;

import java.util.*;

public class ComparatorObjects {
    
    public static void main(String[] args) {
        
        List<StudentClass> students = new ArrayList<>();
        students.add(new StudentClass(33, "John"));
        students.add(new StudentClass(33, "Jenny"));
        students.add(new StudentClass(34, "Jenny"));
        students.add(new StudentClass(31, "Jerry"));
        students.add(new StudentClass(30, "Tom"));
        students.add(new StudentClass(37, "Cat"));

        Collections.sort(students,new SortByNameThenMarks()); // here new SoSortByNameThenMarks creates new obj.

    

        // lambda expression :
        students.forEach(System.out::println);

        /*
            Student [marks=37, name=Cat]
            Student [marks=34, name=Jenny]
            Student [marks=33, name=Jenny]
            Student [marks=31, name=Jerry]
            Student [marks=33, name=John]
            Student [marks=30, name=Tom]
        */


        // 2nd Way for same :

        Collections.sort(students,new Comparator<StudentClass>() {
            @Override
            public int compare(StudentClass arg0, StudentClass arg1) {
                if(arg0.name.equals(arg1.name)) return -1*(arg0.marks-arg1.marks);
                return arg0.name.compareTo(arg1.name);
            }
        });

        // much simpler way :

        Collections.sort(students,(This,That)-> This.name.compareTo(o2.That));

        // Other way :

        Collections.sort(students,Comparator.comparing(StudentClass::getName).reversed().thenComparing(StudentClass::getMarks));





    }
}

class SortByNameThenMarks implements Comparator<StudentClass>{

    @Override
    public int compare(StudentClass arg0, StudentClass arg1) {
        if(arg0.name.equals(arg1.name)) return -1*(arg0.marks-arg1.marks);
        return arg0.name.compareTo(arg1.name);
    }

    
}

class StudentClass {
    int marks;
    String name;

    @Override
    public String toString() {
        return "Student [marks=" + marks + ", name=" + name + "]";
    }

    public StudentClass(int marks,String name){
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
    

}

