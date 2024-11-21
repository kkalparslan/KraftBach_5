package day_48_Collections;

import java.util.Vector;

public class Vector_Example {
    public static void main(String[] args) {
        Vector<String> vector=new Vector<>();
        vector.add("ahmet");
        vector.add("mehmet");
        vector.add("ayşe");
        vector.add("alparslan");
        vector.add("ahmet");
        vector.add("mehmet");
        vector.add("ayşe");
        vector.add("alparslan");
        vector.add("ahmet");
        vector.add("mehmet");
        vector.add("ayşe");
        vector.add("alparslan");

        System.out.println("vector.capacity() = " + vector.capacity());
        System.out.println("vector.size() = " + vector.size());
    }
}
