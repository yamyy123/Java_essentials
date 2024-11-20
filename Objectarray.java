import java.util.Hashtable;

class Student {
    String name;
    int marks;
    String rollno;
}


public class Objectarray {
    public static void main(String[] args) {
        Student arr [] = new Student[4];
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        s1.name = "balu";
        s1.rollno = "12";
        s1.marks = 70;

        s2.name = "rohith";
        s2.rollno = "12";
        s2.marks = 80;

        s3.name = "guru";
        s3.rollno = "12";
        s3.marks = 90;

        s4.name = "siva";
        s4.rollno = "12";
        s4.marks = 100;     // we need to create a object instance and then only we can able to store it in the array 

        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        arr[3] = s4;
        for(Student s : arr) {
            System.out.println(s);   // like this if you print means you will get the hashcode 
            // In Java, a hash code is a numerical value computed for an object. It is used to represent the object in hashing-based data structures, such as HashMap, HashSet, and Hashtable. The hash code is an integer returned by the object's hashCode() method.
            System.out.println(s.name + ":" + s.marks);
        }
    }
}
