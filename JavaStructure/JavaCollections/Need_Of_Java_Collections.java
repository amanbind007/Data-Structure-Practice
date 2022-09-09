package JavaCollections;

import java.lang.Object;


public class Need_Of_Java_Collections {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;
        int f = 60;

        int[] newArr = new int[10000];
        // Limitations of Array
        // 1. Arrays can hold only homogeneous data elements
        // 2. Arrays are Fixed in Size

        Student[] students = new Student[100];
        students[0] = new Student();
        
        // Type Mismatch: Cannot convert Books to Student
        // students[1] = new Books();

        Object[] obj = new Object[10];

        obj[0] = new Student();
        obj[1] = new Student();
        obj[2] = new Student();
        obj[3] = new Books();
        // 3. Ready made APIs support is not available in Array

        
    }
    
}

class Student{

}
class Books{

}
